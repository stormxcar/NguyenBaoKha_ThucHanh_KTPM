# Sử dụng Node.js 18 làm base image
FROM node:18

# Đặt thư mục làm việc trong container
WORKDIR /app

# Copy file package.json và package-lock.json (nếu có)
COPY package.json ./

# Cài đặt các dependencies
RUN npm install

# Copy toàn bộ source code vào container
COPY . .

# Expose cổng 3000
EXPOSE 3000

# Chạy ứng dụng khi container khởi động
CMD ["npm", "start"]
