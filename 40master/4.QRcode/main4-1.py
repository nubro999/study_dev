import qrcode

qr_data = 'www.naver.com'
qr_img = qrcode.make(qr_data)

save_path = '4.QRcode\\' + qr_data + '.png'
qr_img.save(save_path) 