# 

## Model
www.msaez.io/#/storming/18529b03f1efbe987c81f03a3bd18d63

## Before Running Services
### Make sure there is a Kafka server running
```
cd kafka
docker-compose up
```
- Check the Kafka messages:
```
cd kafka
docker-compose exec -it kafka /bin/bash
cd /bin
./kafka-console-consumer --bootstrap-server localhost:9092 --topic
```

## Run the backend micro-services
See the README.md files inside the each microservices directory:

- Food Delivery App
- Store
- Payment
- Customer
- Rider


## Run API Gateway (Spring Gateway)
```
cd gateway
mvn spring-boot:run
```

## Test by API
- Food Delivery App
```
 http :8088/orders id="id" orderId="orderId" customerId="customerId" menuId="menuId" amount="amount" quantity="quantity" storeId="storeId" options="options" 
 http :8088/users userId="userId" userName="userName" email="email" homeAddress="homeAddress" cardNumber="cardNumber" phoneNumber="phoneNumber" 
```
- Store
```
 http :8088/orderProcessings id="id" orderId="orderId" menuId="menuId" orderStatus="orderStatus" options="options" 
```
- Payment
```
 http :8088/paymentHistories id="id" orderId="orderId" amount="amount" status="status" paymentMeothod="paymentMeothod" 
```
- Customer
```
```
- Rider
```
 http :8088/deliveries id="id" orderId="orderId" deliveryStatus="deliveryStatus" deliveryAddress="deliveryAddress" 
```


## Run the frontend
```
cd frontend
npm i
npm run serve
```

## Test by UI
Open a browser to localhost:8088

## Required Utilities

- httpie (alternative for curl / POSTMAN) and network utils
```
sudo apt-get update
sudo apt-get install net-tools
sudo apt install iputils-ping
pip install httpie
```

- kubernetes utilities (kubectl)
```
curl -LO "https://dl.k8s.io/release/$(curl -L -s https://dl.k8s.io/release/stable.txt)/bin/linux/amd64/kubectl"
sudo install -o root -g root -m 0755 kubectl /usr/local/bin/kubectl
```

- aws cli (aws)
```
curl "https://awscli.amazonaws.com/awscli-exe-linux-x86_64.zip" -o "awscliv2.zip"
unzip awscliv2.zip
sudo ./aws/install
```

- eksctl 
```
curl --silent --location "https://github.com/weaveworks/eksctl/releases/latest/download/eksctl_$(uname -s)_amd64.tar.gz" | tar xz -C /tmp
sudo mv /tmp/eksctl /usr/local/bin
```

