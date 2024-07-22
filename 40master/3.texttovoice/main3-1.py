from gtts import gTTS

text = "안녕하세요. 신형섭입니다."

tts = gTTS(text=text, lang='ko')
tts.save(r"3.texttovoice\hi.mp3")