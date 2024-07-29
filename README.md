# Projeto: Representação de iPhone em Java

## Descrição
Este projeto tem como objetivo representar um iPhone que possui três funcionalidades principais: reprodutor de música, aparelho telefônico e navegador na internet. Para isso, são utilizadas interfaces em Java

## Estrutura do Projeto

### Diagrama


![iPhone](https://i.imgur.com/K7gZjfE.png)

### Interfaces

#### `Music`
Interface responsável pelas funcionalidades de reprodutor de música

```java
public interface Music {
    public void play();
    public void stop();
    public void selectMusic(String music);
}
```

#### `Phone`
Interface responsável pelas funcionalidades de aparelho telefônico

```java
public interface Phone {
    public void call(String number);
    public void answer();
    public void startVoiceMail();
}
```

#### `Browser`
Interface responsável pelas funcionalidades de reprodutor de navegar na internet

```java
public interface Browser {
    public void showPage(String url);
    public void addNewTab();
    public void refreshPage();
}
```

## Funcionalidades Demonstradas
+ **Reprodutor de Música**: Iniciar e parar a reprodução de música.
+ **Aparelho Telefônico**: Fazer e receber chamadas.
+ **Navegador na Internet**: Navegar em um URL especificado.
