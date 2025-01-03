def length_conversion():
    print("\nLength Conversion:")
    print("1. Meters to Kilometers")
    print("2. Feet to Meters")
    choice = int(input("Choose an option: "))
    value = float(input("Enter value: "))

    if choice == 1:
        print(f"{value} meters = {value / 1000} kilometers")
    elif choice == 2:
        print(f"{value} feet = {value * 0.3048} meters")
    else:
        print("Invalid choice!")

def weight_conversion():
    print("\nWeight Conversion:")
    print("1. Kilograms to Pounds")
    print("2. Pounds to Kilograms")
    choice = int(input("Choose an option: "))
    value = float(input("Enter value: "))

    if choice == 1:
        print(f"{value} kg = {value * 2.20462} pounds")
    elif choice == 2:
        print(f"{value} pounds = {value / 2.20462} kg")
    else:
        print("Invalid choice!")

def temperature_conversion():
    print("\nTemperature Conversion:")
    print("1. Celsius to Fahrenheit")
    print("2. Fahrenheit to Celsius")
    choice = int(input("Choose an option: "))
    value = float(input("Enter value: "))

    if choice == 1:
        print(f"{value} °C = {(value * 9/5) + 32} °F")
    elif choice == 2:
        print(f"{value} °F = {(value - 32) * 5/9} °C")
    else:
        print("Invalid choice!")

def main():
    print("Welcome to Unit Converter!")
    print("1. Length Conversion")
    print("2. Weight Conversion")
    print("3. Temperature Conversion")
    choice = int(input("Choose an option: "))

    if choice == 1:
        length_conversion()
    elif choice == 2:
        weight_conversion()
    elif choice == 3:
        temperature_conversion()
    else:
        print("Invalid choice! Exiting...")

if __name__ == "__main__":
    main()
