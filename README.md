# zuhause-api

Nano Java API Server for IoT to Raspberry Pi

[![Codacy Badge](https://api.codacy.com/project/badge/Grade/09740a7075f841989c23f9eade1ff473)](https://www.codacy.com/app/edufolly/zuhause-api?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=edufolly/zuhause-api&amp;utm_campaign=Badge_Grade)

###### Chaves
**monitora_mac**
MAC Address que são monitorados.

**mac_status**
Status dos dispositivos monitorados pelo MAC Address.

**resolve_mac**
Apelidos para resolver o MAC Address.

**telegram_bot**
*zuhause_iot_bot* -> Offset das mensagens.
*send_to* -> Para onde enviar.

**temp**
Registro de temperatura.

**ignore_device**
*name* -> Ignora através do nome.
*mac* -> Ignora através do MAC Address.

**sunrise_sunset**
*lat* -> Latitude
*lng* -> Longitude
*name* -> Nome na mensagem e controle de ligado e desligado do Arduino.
*pin* -> Pino referente ao acionamento no arduino.