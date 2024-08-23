# REact Project Setup Guide

This guide provides step-by-step instructions for setting up an React project from scratch on an Ubuntu machine.

## Step 1: Install Node.js and npm

```bash
sudo apt update
sudo apt install nodejs npm
```

## Step 2: Check Node.js and npm versions

```bash
node -v
npm -v
```

## Step 3: Update the .env file with backend instance IP 

```bash
REACT_APP_BACKEND=http://<BAckend_IP>:8082
PORT=8082
```

## Step 4: Install project dependencies (if needed)

```bash
npm install
npm run build 
```

## Step 5: Install the NGINX Server

```bash
apt update
apt install nginx -y
systemctl start nginx
systemctl enable nginx
systemctl status nginx
```

## Step 6: Copy the /build folder to nginx default directory

```bash
 mv /build /var/www/html
```

## Step 7: Update the nginx server file with the following content

```bash
 vi /etc/nginx/sites-available/default
```

```bash
server {
        listen 3000 default_server;
        listen [::]:3000 default_server;

     

        root /var/www/html;

        #### Add index.php to the list if you are using PHP
        index index.html index.htm index.nginx-debian.html;

        server_name _;

        location / {
                root /var/www/html/build;
                index index.html;
                # First attempt to serve request as file, then
		                try_files $uri /index.html;
        }

        location /api/ {
    proxy_pass http://<Backend_IP>:8082/;
    proxy_set_header Host $host;
    proxy_set_header X-Real-IP $remote_addr;
    proxy_set_header X-Forwarded-For $proxy_add_x_forwarded_for;
    proxy_set_header X-Forwarded-Proto $scheme;

    #### Allow requests from your React frontend
    add_header Access-Control-Allow-Origin *;

    #### Allow common HTTP methods
    add_header Access-Control-Allow-Methods "GET, POST, OPTIONS, PUT, DELETE";

    #### Allow specified headers from the client
    add_header Access-Control-Allow-Headers "Content-Type, Authorization";

    #### Handle preflight requests (OPTIONS)
    if ($request_method = 'OPTIONS') {
        add_header Access-Control-Allow-Origin *;
        add_header Access-Control-Allow-Methods "GET, POST, OPTIONS, PUT, DELETE";
        add_header Access-Control-Allow-Headers "Content-Type, Authorization";
        add_header Content-Length 0;
        add_header Content-Type text/plain;
        return 204;
    }
}
```

## Step 8: REstart the nginx server
```bash
 systemctl restart nginx
```
