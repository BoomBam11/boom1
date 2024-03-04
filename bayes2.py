def bayes_theorem(prior_prob,likelihood,evidence):
    posterior_prob=(likelihood*prior_prob)/evidence
    return posterior_prob
if __name__=="__main__":
   prior_prob=0.01
   likelihood_cancer=0.95
   likelihood_no_cancer=0.10
   evidence=(likelihood_cancer*prior_prob)+(likelihood_no_cancer*(1-prior_prob))
   posterior_prob=bayes_theorem(prior_prob,likelihood_cancer,evidence)
   print("Prior Probability of Cancer:",likelihood_cancer)
   print("Likelihood of Positive Test Given No Cancer:",round(posterior_prob,2))
