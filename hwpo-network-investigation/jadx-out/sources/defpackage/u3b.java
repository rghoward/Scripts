package defpackage;

import j$.time.LocalDate;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class u3b extends g5b<a, z3b> {
    public final w5b a;

    public u3b(w5b w5bVar) {
        w5bVar.getClass();
        this.a = w5bVar;
    }

    @Override // defpackage.g5b
    public final Object a(Object obj, g5b.b bVar) {
        a aVar = (a) obj;
        return this.a.e(aVar.a, aVar.b, aVar.c, aVar.d, aVar.e, aVar.f, aVar.g, aVar.h, bVar);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public final String a;
        public final String b;
        public final uj4 c;
        public final String d;
        public final ylb e;
        public final n33 f;
        public final LocalDate g;
        public final s10 h;

        public a(String str, String str2, uj4 uj4Var, String str3, ylb ylbVar, n33 n33Var, LocalDate localDate, s10 s10Var, int i) {
            str = (i & 1) != 0 ? null : str;
            str2 = (i & 2) != 0 ? null : str2;
            uj4Var = (i & 4) != 0 ? null : uj4Var;
            str3 = (i & 8) != 0 ? null : str3;
            ylbVar = (i & 16) != 0 ? null : ylbVar;
            n33Var = (i & 32) != 0 ? null : n33Var;
            localDate = (i & 64) != 0 ? null : localDate;
            s10Var = (i & 128) != 0 ? null : s10Var;
            this.a = str;
            this.b = str2;
            this.c = uj4Var;
            this.d = str3;
            this.e = ylbVar;
            this.f = n33Var;
            this.g = localDate;
            this.h = s10Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return xj5.a(this.a, aVar.a) && xj5.a(this.b, aVar.b) && this.c == aVar.c && xj5.a(this.d, aVar.d) && this.e == aVar.e && this.f == aVar.f && xj5.a(this.g, aVar.g) && this.h == aVar.h;
        }

        public final int hashCode() {
            String str = this.a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            uj4 uj4Var = this.c;
            int iHashCode3 = (iHashCode2 + (uj4Var == null ? 0 : uj4Var.hashCode())) * 31;
            String str3 = this.d;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            ylb ylbVar = this.e;
            int iHashCode5 = (iHashCode4 + (ylbVar == null ? 0 : ylbVar.hashCode())) * 31;
            n33 n33Var = this.f;
            int iHashCode6 = (iHashCode5 + (n33Var == null ? 0 : n33Var.hashCode())) * 31;
            LocalDate localDate = this.g;
            int iHashCode7 = (iHashCode6 + (localDate == null ? 0 : localDate.hashCode())) * 31;
            s10 s10Var = this.h;
            return iHashCode7 + (s10Var != null ? s10Var.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbA = vb0.a("Params(firstName=", this.a, ", lastName=", this.b, ", gender=");
            sbA.append(this.c);
            sbA.append(", countryCode=");
            sbA.append(this.d);
            sbA.append(", weightUnits=");
            sbA.append(this.e);
            sbA.append(", distanceUnits=");
            sbA.append(this.f);
            sbA.append(", birthdate=");
            sbA.append(this.g);
            sbA.append(", appLanguage=");
            sbA.append(this.h);
            sbA.append(")");
            return sbA.toString();
        }

        public a() {
            this(null, null, null, null, null, null, null, null, 255);
        }
    }
}
