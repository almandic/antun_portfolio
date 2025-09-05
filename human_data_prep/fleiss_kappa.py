from __future__ import annotations
from typing import Optional, Sequence
import numpy as np

def fleiss_kappa(ratings: Sequence[Sequence[int]], n_labels: Optional[int] = None) -> float:
    """
    Calculate Fleiss' Kappa for multiple raters.

    Parameters:
    ratings (Sequence[Sequence[int]]): A sequence of sequences where each inner sequence contains the ratings from one rater.
    n_labels (int, optional): The number of possible labels. If None, it will be inferred from the data.

    Returns:
    float: Fleiss' Kappa score.
    """
    ratings = np.array(ratings)
    n_raters, n_items = ratings.shape

    if n_labels is None:
        n_labels = int(np.max(ratings)) + 1

    # Matrix to count the number of ratings per label for each item
    label_counts = np.zeros((n_items, n_labels), dtype=int)
    
    for i in range(n_items):
        for j in range(n_raters):
            label_counts[i, ratings[j, i]] += 1

    # Proportion of all assignments to label j
    p_j = np.sum(label_counts, axis=0) / (n_items * n_raters)
    # Proportion of agreement for item i
    P_i = (np.sum(label_counts**2, axis=1) - n_raters) / (n_raters * (n_raters - 1))

    P_bar = np.mean(P_i)
    P_e = np.sum(p_j**2) # Expected agreement

    if P_e == 1:
        return 1.0  # Perfect agreement

    kappa = (P_bar - P_e) / (1 - P_e)

    return kappa
