# projet_ecom_microservice

# 1. Config-service :
## dependencies :
* Config Server 
* Spring Boot Actuator
* Consul Discovery

# 2. Gateway-service :
## dependencies :
* Gateway
* Spring Boot Actuator
* Consul Discovery
* Config Client

# 3. Discovery-service :
## dependencies :
* Config Server
* Spring Boot Actuator
* Consul Discovery

# 4. Customer-service 
## dependencies :
* Spring web
* Spring Data JPA
* H2 Database
* Lombok
* Rest Repositories 
* Consul Discovery
* Config Client
* Spring Boot Actuator

# 5. Inventory-service
## dependencies :
* Spring web
* Spring Data JPA
* H2 Database
* Lombok
* Rest Repositories
* Consul Discovery
* Config Client
* Spring Boot Actuator

# 6. Order-service
## dependencies :
* Spring web
* Spring Data JPA
* H2 Database
* Lombok
* Rest Repositories
* Consul Discovery
* Config Client
* Spring Boot Actuator
* OpenFeign
* Spring HATEOAS

# 7. Facturation-service
* Spring Web
* Consul Discovery
* Lombok 
* Consul Configuration
* Spring Boot Actuator
* Vault Configuration

# links 
## Download : 
* Consul : `https://www.consul.io/`
* Vault : `https://developer.hashicorp.com/vault/downloads`

# List Command Tool : Vault :
in command line;
in dev-mode
Run : `vault server -dev`
## use le token generated token in console for login
## add vault-address in environment
### PowerShell
Run : `$env:VAULT_ADDR="http://127.0.0.1:8200"`
### Command line :
* Run : `set VAULT_ADDR=http://127.0.0.1:8200`
* Run : `vault kv put secret/facturation-service user.username=rachid user.password=1234`
* Run : `vault kv get secret/facturation-service`




