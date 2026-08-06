package j$.time.format;

import com.intercom.twig.BuildConfig;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import java.text.ParsePosition;
import java.util.AbstractMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes2.dex */
public class t implements e {
    public static volatile Map.Entry c;
    public static volatile Map.Entry d;
    public final j$.time.e a;
    public final String b;

    public t(j$.time.e eVar, String str) {
        this.a = eVar;
        this.b = str;
    }

    public static int b(v vVar, CharSequence charSequence, int i, int i2, k kVar) {
        String upperCase = charSequence.subSequence(i, i2).toString().toUpperCase();
        if (i2 >= charSequence.length()) {
            vVar.f(ZoneId.of(upperCase));
            return i2;
        }
        if (charSequence.charAt(i2) == '0' || vVar.a(charSequence.charAt(i2), 'Z')) {
            vVar.f(ZoneId.of(upperCase));
            return i2;
        }
        v vVar2 = new v(vVar.a);
        vVar2.b = vVar.b;
        vVar2.c = vVar.c;
        int iE = kVar.E(vVar2, charSequence, i2);
        try {
            if (iE >= 0) {
                vVar.f(ZoneId.O(upperCase, ZoneOffset.ofTotalSeconds((int) vVar2.e(j$.time.temporal.a.OFFSET_SECONDS).longValue())));
                return iE;
            }
            if (kVar == k.e) {
                return ~i;
            }
            vVar.f(ZoneId.of(upperCase));
            return i2;
        } catch (j$.time.b unused) {
            return ~i;
        }
    }

    @Override // j$.time.format.e
    public final int E(v vVar, CharSequence charSequence, int i) {
        int i2;
        int length = charSequence.length();
        if (i > length) {
            throw new IndexOutOfBoundsException();
        }
        if (i == length) {
            return ~i;
        }
        char cCharAt = charSequence.charAt(i);
        if (cCharAt == '+' || cCharAt == '-') {
            return b(vVar, charSequence, i, i, k.e);
        }
        int i3 = i + 2;
        if (length >= i3) {
            char cCharAt2 = charSequence.charAt(i + 1);
            if (vVar.a(cCharAt, 'U') && vVar.a(cCharAt2, 'T')) {
                int i4 = i + 3;
                return (length < i4 || !vVar.a(charSequence.charAt(i3), 'C')) ? b(vVar, charSequence, i, i3, k.f) : b(vVar, charSequence, i, i4, k.f);
            }
            if (vVar.a(cCharAt, 'G') && length >= (i2 = i + 3) && vVar.a(cCharAt2, 'M') && vVar.a(charSequence.charAt(i3), 'T')) {
                int i5 = i + 4;
                if (length < i5 || !vVar.a(charSequence.charAt(i2), '0')) {
                    return b(vVar, charSequence, i, i2, k.f);
                }
                vVar.f(ZoneId.of("GMT0"));
                return i5;
            }
        }
        n nVarA = a(vVar);
        ParsePosition parsePosition = new ParsePosition(i);
        String strC = nVarA.c(charSequence, parsePosition);
        if (strC != null) {
            vVar.f(ZoneId.of(strC));
            return parsePosition.getIndex();
        }
        if (!vVar.a(cCharAt, 'Z')) {
            return ~i;
        }
        vVar.f(ZoneOffset.UTC);
        return i + 1;
    }

    public n a(v vVar) {
        Set<String> set = j$.time.zone.i.d;
        int size = set.size();
        Map.Entry simpleImmutableEntry = vVar.b ? c : d;
        if (simpleImmutableEntry == null || ((Integer) simpleImmutableEntry.getKey()).intValue() != size) {
            synchronized (this) {
                try {
                    simpleImmutableEntry = vVar.b ? c : d;
                    if (simpleImmutableEntry == null || ((Integer) simpleImmutableEntry.getKey()).intValue() != size) {
                        Integer numValueOf = Integer.valueOf(size);
                        n nVar = vVar.b ? new n(BuildConfig.FLAVOR, null, null) : new m(BuildConfig.FLAVOR, null, null);
                        for (String str : set) {
                            nVar.a(str, str);
                        }
                        simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry(numValueOf, nVar);
                        if (vVar.b) {
                            c = simpleImmutableEntry;
                        } else {
                            d = simpleImmutableEntry;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return (n) simpleImmutableEntry.getValue();
    }

    public final String toString() {
        return this.b;
    }

    @Override // j$.time.format.e
    public boolean z(x xVar, StringBuilder sb) {
        ZoneId zoneId = (ZoneId) xVar.b(this.a);
        if (zoneId == null) {
            return false;
        }
        sb.append(zoneId.getId());
        return true;
    }
}
