
## Objetivo
- Fazer a autenticação com a API do Spotify e futuramente consumir dados como álbuns, músicas e artistas.

## Inicialização do Projeto
- Criado com Spring Initializr
- Group: `com.ufrn.dimap`
- Artifact: `spotify`
- Dependências: Spring Web, DevTools, OpenFeign
- versão java: 21

## Organização do projeto
- `controller`
  - `AlbumController.java` — controlador REST.
- `client`
  - `GoogleClient.java` — exemplo de outro client HTTP.
  - `AuthSpotifyClient.java` — interface Feign que faz a autenticação com a API do Spotify.
  - `LoginRequest.java` — modelo da requisição de autenticação.
  - `LoginResponse.java` — modelo da resposta da autenticação.

## Autenticação com o Spotify (não finalizado)

- Implementado o fluxo **Client Credentials** com:
  - `grant_type=client_credentials`
  - `client_id=...`
  - `client_secret=...`

- Utilizando FeignClient para enviar o `POST` para `https://accounts.spotify.com/api/token`.

## Próximos passos

- Consumir endpoints protegidos da API do Spotify.
- Criar modelos de resposta como AlbumResponse, ArtistResponse, etc.
### opcionais:
- Adicionar Swagger/OpenAPI para documentação.
- Criar testes automatizados.