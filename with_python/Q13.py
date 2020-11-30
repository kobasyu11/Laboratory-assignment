import MeCab


def print_words_and_results(raw_text: str = 'すもももももももものうち'):
    tagger = MeCab.Tagger()
    parse = tagger.parse(raw_text)
    print(parse)


def print_morpheme(raw_text: str = 'すもももももももものうち'):
    tagger = MeCab.Tagger("-Ochasen")

    nouns = [line for line in tagger.parse(raw_text).splitlines()
             if "名詞" in line.split()[-1]]

    for str in nouns:
        print(str.split())


if __name__ == '__main__':
    print_words_and_results()
    print_morpheme()