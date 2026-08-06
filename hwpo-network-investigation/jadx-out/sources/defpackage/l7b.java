package defpackage;

import com.hwpo_training_app.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class l7b extends g5b<a, b> {
    public final String a;
    public final String b;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public final String a;
        public final String b;
        public final String c;

        public a(String str, String str2, String str3) {
            this.a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && this.b.equals(aVar.b) && this.c.equals(aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + ru3.c(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return av.a(vb0.a("InputParams(currentPassword=", this.a, ", newPassword=", this.b, ", newConfirmedPassword="), this.c, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b {
        public final boolean a;
        public final String b;
        public final String c;
        public final String d;

        public b(String str, String str2, String str3, boolean z) {
            this.a = z;
            this.b = str;
            this.c = str2;
            this.d = str3;
        }

        public static b a(b bVar, String str, String str2, String str3, int i) {
            if ((i & 2) != 0) {
                str = bVar.b;
            }
            if ((i & 4) != 0) {
                str2 = bVar.c;
            }
            if ((i & 8) != 0) {
                str3 = bVar.d;
            }
            return new b(str, str2, str3, false);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && xj5.a(this.b, bVar.b) && xj5.a(this.c, bVar.c) && xj5.a(this.d, bVar.d);
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.a) * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.c;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.d;
            return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OutputParams(isValid=");
            sb.append(this.a);
            sb.append(", currentPasswordError=");
            sb.append(this.b);
            sb.append(", newPasswordError=");
            return ao2.a(sb, this.c, ", newConfirmedPasswordError=", this.d, ")");
        }
    }

    public l7b(bu8 bu8Var) {
        bu8Var.getClass();
        this.a = bu8Var.b(R.string.password_must_be_at_least, 6);
        this.b = bu8Var.b(R.string.password_mismatch, new Object[0]);
    }

    @Override // defpackage.g5b
    public final Object a(Object obj, g5b.b bVar) {
        a aVar = (a) obj;
        b bVar2 = new b(null, null, null, true);
        String str = aVar.a;
        String str2 = aVar.c;
        String str3 = aVar.b;
        int length = str.length();
        String str4 = this.a;
        if (length < 6) {
            bVar2 = b.a(bVar2, str4, null, null, 12);
        }
        if (!z2a.w(str3) && str3.length() < 6) {
            bVar2 = b.a(bVar2, null, str4, null, 10);
        }
        if (!z2a.w(str2) && str2.length() < 6) {
            bVar2 = b.a(bVar2, null, null, str4, 6);
        }
        if (!bVar2.a || str3.equals(str2)) {
            return bVar2;
        }
        String str5 = this.b;
        return b.a(bVar2, null, str5, str5, 2);
    }
}
