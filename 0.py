values = [
    "101",
    "10",
    "111",
    "101",
    "1001",
    "10"
]

n = 100000

with open("DATA.IN", "wb") as f:
    for i in range(n):
        x = values[i % len(values)]

        f.write(x.encode())
        f.write(b' ')

        if (i + 1) % 10 == 0:
            f.write(b'\n')