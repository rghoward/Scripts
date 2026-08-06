package j$.time.format;

import j$.time.chrono.Chronology;
import j$.time.temporal.TemporalField;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes2.dex */
public final class r implements e {
    public final TemporalField a;
    public final TextStyle b;
    public final a0 c;
    public volatile j d;

    public r(TemporalField temporalField, TextStyle textStyle, a0 a0Var) {
        this.a = temporalField;
        this.b = textStyle;
        this.c = a0Var;
    }

    @Override // j$.time.format.e
    public final int E(v vVar, CharSequence charSequence, int i) {
        a0 a0Var = this.c;
        TemporalField temporalField = this.a;
        int length = charSequence.length();
        if (i < 0 || i > length) {
            throw new IndexOutOfBoundsException();
        }
        boolean z = vVar.c;
        DateTimeFormatter dateTimeFormatter = vVar.a;
        TextStyle textStyle = z ? this.b : null;
        Chronology chronologyD = vVar.d();
        Iterator itE = (chronologyD == null || chronologyD == j$.time.chrono.p.d) ? a0Var.e(temporalField, textStyle, dateTimeFormatter.b) : a0Var.d(chronologyD, temporalField, textStyle, dateTimeFormatter.b);
        if (itE != null) {
            while (itE.hasNext()) {
                Map.Entry entry = (Map.Entry) itE.next();
                String str = (String) entry.getKey();
                if (vVar.h(str, 0, charSequence, i, str.length())) {
                    return vVar.g(this.a, ((Long) entry.getValue()).longValue(), i, str.length() + i);
                }
            }
            if (temporalField == j$.time.temporal.a.ERA && !vVar.c) {
                for (j$.time.chrono.j jVar : chronologyD.D()) {
                    String string = jVar.toString();
                    if (vVar.h(string, 0, charSequence, i, string.length())) {
                        return vVar.g(this.a, jVar.getValue(), i, string.length() + i);
                    }
                }
            }
            if (vVar.c) {
                return ~i;
            }
        }
        if (this.d == null) {
            this.d = new j(this.a, 1, 19, d0.NORMAL);
        }
        return this.d.E(vVar, charSequence, i);
    }

    public final String toString() {
        TextStyle textStyle = TextStyle.FULL;
        TextStyle textStyle2 = this.b;
        TemporalField temporalField = this.a;
        if (textStyle2 == textStyle) {
            return "Text(" + temporalField + ")";
        }
        return "Text(" + temporalField + "," + textStyle2 + ")";
    }

    @Override // j$.time.format.e
    public final boolean z(x xVar, StringBuilder sb) {
        Long lA = xVar.a(this.a);
        DateTimeFormatter dateTimeFormatter = xVar.b;
        if (lA == null) {
            return false;
        }
        Chronology chronology = (Chronology) xVar.a.d(j$.time.temporal.q.b);
        String strC = (chronology == null || chronology == j$.time.chrono.p.d) ? this.c.c(this.a, lA.longValue(), this.b, dateTimeFormatter.b) : this.c.b(chronology, this.a, lA.longValue(), this.b, dateTimeFormatter.b);
        if (strC != null) {
            sb.append(strC);
            return true;
        }
        if (this.d == null) {
            this.d = new j(this.a, 1, 19, d0.NORMAL);
        }
        return this.d.z(xVar, sb);
    }
}
