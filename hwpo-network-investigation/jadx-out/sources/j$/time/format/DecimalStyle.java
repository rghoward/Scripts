package j$.time.format;

import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes2.dex */
public final class DecimalStyle {
    public static final DecimalStyle d = new DecimalStyle('0', '-', '.');
    public static final ConcurrentMap e = new ConcurrentHashMap(16, 0.75f, 2);
    public final char a;
    public final char b;
    public final char c;

    public DecimalStyle(char c, char c2, char c3) {
        this.a = c;
        this.b = c2;
        this.c = c3;
    }

    public static DecimalStyle of(Locale locale) {
        Objects.requireNonNull(locale, "locale");
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) e;
        DecimalStyle decimalStyle = (DecimalStyle) concurrentHashMap.get(locale);
        if (decimalStyle != null) {
            return decimalStyle;
        }
        DecimalFormatSymbols decimalFormatSymbols = DecimalFormatSymbols.getInstance(locale);
        char zeroDigit = decimalFormatSymbols.getZeroDigit();
        char minusSign = decimalFormatSymbols.getMinusSign();
        char decimalSeparator = decimalFormatSymbols.getDecimalSeparator();
        concurrentHashMap.putIfAbsent(locale, (zeroDigit == '0' && minusSign == '-' && decimalSeparator == '.') ? d : new DecimalStyle(zeroDigit, minusSign, decimalSeparator));
        return (DecimalStyle) concurrentHashMap.get(locale);
    }

    public final String a(String str) {
        char c = this.a;
        if (c == '0') {
            return str;
        }
        int i = c - '0';
        char[] charArray = str.toCharArray();
        for (int i2 = 0; i2 < charArray.length; i2++) {
            charArray[i2] = (char) (charArray[i2] + i);
        }
        return new String(charArray);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DecimalStyle)) {
            return false;
        }
        DecimalStyle decimalStyle = (DecimalStyle) obj;
        return this.a == decimalStyle.a && this.b == decimalStyle.b && this.c == decimalStyle.c;
    }

    public final int hashCode() {
        return this.a + '+' + this.b + this.c;
    }

    public final String toString() {
        return "DecimalStyle[" + this.a + '+' + this.b + this.c + "]";
    }
}
