package j$.time.format;

import j$.time.temporal.TemporalField;
import j$.time.temporal.WeekFields;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes2.dex */
public final class s extends j {
    public final char g;
    public final int h;

    public s(char c, int i, int i2, int i3, int i4) {
        super(null, i2, i3, d0.NOT_NEGATIVE, i4);
        this.g = c;
        this.h = i;
    }

    @Override // j$.time.format.j, j$.time.format.e
    public final int E(v vVar, CharSequence charSequence, int i) {
        return f(vVar.a.b).E(vVar, charSequence, i);
    }

    @Override // j$.time.format.j
    public final j d() {
        if (this.e == -1) {
            return this;
        }
        return new s(this.g, this.h, this.b, this.c, -1);
    }

    @Override // j$.time.format.j
    public final j e(int i) {
        return new s(this.g, this.h, this.b, this.c, this.e + i);
    }

    public final j f(Locale locale) {
        TemporalField temporalFieldDayOfWeek;
        WeekFields weekFieldsOf = WeekFields.of(locale);
        char c = this.g;
        if (c == 'W') {
            temporalFieldDayOfWeek = weekFieldsOf.d;
        } else {
            if (c == 'Y') {
                j$.time.temporal.u uVar = weekFieldsOf.f;
                int i = this.h;
                if (i == 2) {
                    return new p(uVar, 2, 2, p.h, this.e);
                }
                return new j(uVar, i, 19, i < 4 ? d0.NORMAL : d0.EXCEEDS_PAD, this.e);
            }
            if (c == 'c' || c == 'e') {
                temporalFieldDayOfWeek = weekFieldsOf.dayOfWeek();
            } else {
                if (c != 'w') {
                    throw new IllegalStateException("unreachable");
                }
                temporalFieldDayOfWeek = weekFieldsOf.e;
            }
        }
        return new j(temporalFieldDayOfWeek, this.b, this.c, d0.NOT_NEGATIVE, this.e);
    }

    @Override // j$.time.format.j
    public final String toString() {
        StringBuilder sb = new StringBuilder(30);
        sb.append("Localized(");
        int i = this.h;
        char c = this.g;
        if (c != 'Y') {
            if (c == 'W') {
                sb.append("WeekOfMonth");
            } else if (c == 'c' || c == 'e') {
                sb.append("DayOfWeek");
            } else if (c == 'w') {
                sb.append("WeekOfWeekBasedYear");
            }
            sb.append(",");
            sb.append(i);
        } else if (i == 1) {
            sb.append("WeekBasedYear");
        } else if (i == 2) {
            sb.append("ReducedValue(WeekBasedYear,2,2,2000-01-01)");
        } else {
            sb.append("WeekBasedYear,");
            sb.append(i);
            sb.append(",19,");
            sb.append(i < 4 ? d0.NORMAL : d0.EXCEEDS_PAD);
        }
        sb.append(")");
        return sb.toString();
    }

    @Override // j$.time.format.j, j$.time.format.e
    public final boolean z(x xVar, StringBuilder sb) {
        return f(xVar.b.b).z(xVar, sb);
    }
}
