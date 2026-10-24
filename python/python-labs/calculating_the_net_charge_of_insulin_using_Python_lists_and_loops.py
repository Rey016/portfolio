# Python3.11
# Coding: utf-8

# Store the human preproinsulin sequence in a variable called preproinsulin:

preproInsulin = "malwmrllpllallalwgpdpaaafvnqhlcgshlvealylvcgergffytpktrreaedlqvgqvelgggpgagslqplalegslqkrgiveqcctsicslyqlenycn"

# Store the remaining sequence elements of human insulin in variables:

lsInsulin = "malwmrllpllallalwgpdpaaa"

bInsulin = "fvnqhlcgshlvealylvcgergffytpkt"

aInsulin = "giveqcctsicslyqlenycn"

cInsulin = "rreaedlqvgqvelgggpgagslqplalegslqkr"

# Combine the B chain and A chain to create insulin:

insulin = bInsulin + aInsulin

# Create a dictionary of pKR values:

pKR = {
    'y': 10.07,
    'c': 8.18,
    'k': 10.53,
    'h': 6.00,
    'r': 12.48,
    'd': 3.65,
    'e': 4.25
}

# Count the number of each amino acid:

seqCount = {
    x: float(insulin.count(x))
    for x in ['y', 'c', 'k', 'h', 'r', 'd', 'e']
}

# Start pH at 0:

pH = 0

# Calculate the net charge from pH 0 through pH 14:

while (pH <= 14):

    netCharge = (
        +(sum({
            x: ((seqCount[x] * (10**pKR[x])) /
            ((10**pH) + (10**pKR[x])))
            for x in ['k', 'h', 'r']
        }.values()))

        -(sum({
            x: ((seqCount[x] * (10**pH)) /
            ((10**pH) + (10**pKR[x])))
            for x in ['y', 'c', 'd', 'e']
        }.values()))
    )

    # Print pH and net charge:

    print('{0:.2f}'.format(pH), netCharge)

    # Increase pH by 1:

    pH += 1