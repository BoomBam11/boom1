def get_valid_probability_input(prompt):
    while True:
        try:
            probability=float(input(prompt))
            if 0<= probability <=1:
                return probability
            else:
                print("probability must be between 0 and 1. please try")
        except ValueError:
            print("Invalid input. please enter a valid probability between o and 1.")
P_B= get_valid_probability_input("Enter the probability of event B(0 to 1):")
P_A_and_B=get_valid_probability_input("Enter the probability of events A and B (0 to 1):")
P_A_given_B= P_A_and_B/P_B
if P_A_given_B >1:
    print("Inconsistent result.Please check the inputs again.")
else:
    formatted_result = "{:.2f}".format(P_A_given_B)
    print("P(A|B)=", formatted_result)
