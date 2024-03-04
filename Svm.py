#SVMs
import numpy as np
import matplotlib.pyplot as plt
from sklearn import svm, datasets
iris = datasets.load_iris()
x = iris.data[:,:2]
y = iris.target
C= 1.0
svc = svm.SVC(kernel='linear', C = 1, gamma='scale').fit(x, y)
x_min, x_max = x[:, 0].min() -1, x[:, 0].max() + 1
y_min, y_max = x[:, 1].min() - 1, x[:, 1].max() + 1
h= (x_max / x_min)/100
xx,yy = np.meshgrid(np.arange(x_min,x_max,h),np.arange(y_min,y_max,h))
plt.subplot(1,1,1)
z= svc.predict(np.c_[xx.ravel(),yy.ravel()])
z=z.reshape(xx.shape)
plt.contour(xx, yy,z, cmap=plt.cm.Paired, alpha=0.8)
plt.scatter(x[:,0], x[:,1], c=y, cmap=plt.cm.Paired)
plt.xlabel('sepal length')
plt.ylabel('sepal width')
plt.xlim(xx.min(), xx.max())
plt.title('SVC with linear kernel')
plt.show()



#clustering

from numpy import where
from sklearn.datasets import make_classification
from matplotlib import pyplot
x, y = make_classification(n_samples=1000, n_features=2,
n_informative=2, n_redundant=0, n_clusters_per_class=1,
random_state=4)
for class_value in range(2):
    row_ix = where(y == class_value)
    pyplot.scatter(x[row_ix, 0], x[row_ix, 1])
    pyplot.show()


#Bot
import aiml
kernel = aiml.Kernel()
kernel.learn("D:/Flu.aiml")
while True:
    user_input = input("You: ")
    if user_input.lower() == "exit":
        print("Bot: Goodbye!")
        break
    bot_response = kernel.respond(user_input)
    print("Bot:", bot_response)
    bot_response = kernel.respond(user_input)
    print("Chatbot:", bot_response)



#:DESIGN AN EXPERT SYSTEM USING AIML
import aiml
def main():
kernel = aiml.Kernel()
kernel.learn("flu.aiml")
print("Welcome to the flu diag center")
while True:
user_input = input("You: ").strip().lower()
if user_input == 'exit':
print("Goodbye!")
break
response = kernel.respond(user_input)
print("Expert System: " + response)
if __name__ == "__main__":
main()
