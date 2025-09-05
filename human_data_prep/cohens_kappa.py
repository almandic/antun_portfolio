import numpy as np

def cohens_kappa(rater1, rater2, labels=None):
    """
    Calculate Cohen's Kappa between two raters.

    Parameters:
    rater1 (list or np.array): Ratings from the first rater.
    rater2 (list or np.array): Ratings from the second rater.
    labels (list): List of possible labels. If None, inferred from data.

    Returns:
    float: Cohen's Kappa score.
    """
    if len(rater1) != len(rater2):
        raise ValueError("Rater lists must have the same length.")

    if labels is None:
        labels = np.unique(np.concatenate((rater1, rater2)))

    n_labels = len(labels)
    confusion_matrix = np.zeros((n_labels, n_labels), dtype=int)

    label_to_index = {label: index for index, label in enumerate(labels)}

    for a, b in zip(rater1, rater2):
        confusion_matrix[label_to_index[a], label_to_index[b]] += 1

    total = np.sum(confusion_matrix)
    p0 = np.trace(confusion_matrix) / total
    p_yes = np.sum(confusion_matrix, axis=0) / total
    p_no = np.sum(confusion_matrix, axis=1) / total
    pe = np.sum(p_yes * p_no)

    if pe == 1:
        return 1.0  # Perfect agreement

    kappa = (p0 - pe) / (1 - pe)

    return kappa