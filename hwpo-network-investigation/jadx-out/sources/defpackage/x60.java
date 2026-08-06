package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class x60 {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends x60 {
        public final long a;
        public final String b;
        public final boolean c;
        public final m89 d;

        public a(long j, String str, boolean z, m89 m89Var) {
            str.getClass();
            m89Var.getClass();
            this.a = j;
            this.b = str;
            this.c = z;
            this.d = m89Var;
        }

        @Override // defpackage.x60
        public final long b() {
            return this.a;
        }

        @Override // defpackage.x60
        public final m89 c() {
            return this.d;
        }

        @Override // defpackage.x60
        public final boolean d() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && xj5.a(this.b, aVar.b) && this.c == aVar.c && xj5.a(this.d, aVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + uo2.a(ru3.c(Long.hashCode(this.a) * 31, 31, this.b), this.c, 31);
        }

        public final String toString() {
            return "FileAttachmentUiEntity(id=" + this.a + ", fileName=" + this.b + ", isSelected=" + this.c + ", originalData=" + this.d + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b extends x60 {
        public final long a;
        public final String b;
        public final boolean c;
        public final m89 d;
        public final String e;

        public b(long j, String str, boolean z, m89 m89Var, String str2) {
            str.getClass();
            m89Var.getClass();
            str2.getClass();
            this.a = j;
            this.b = str;
            this.c = z;
            this.d = m89Var;
            this.e = str2;
        }

        @Override // defpackage.x60
        public final long b() {
            return this.a;
        }

        @Override // defpackage.x60
        public final m89 c() {
            return this.d;
        }

        @Override // defpackage.x60
        public final boolean d() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && xj5.a(this.b, bVar.b) && this.c == bVar.c && xj5.a(this.d, bVar.d) && xj5.a(this.e, bVar.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + ((this.d.hashCode() + uo2.a(ru3.c(Long.hashCode(this.a) * 31, 31, this.b), this.c, 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ImageAttachmentUiEntity(id=");
            sb.append(this.a);
            sb.append(", fileName=");
            sb.append(this.b);
            sb.append(", isSelected=");
            sb.append(this.c);
            sb.append(", originalData=");
            sb.append(this.d);
            return w27.a(sb, ", sourceUrl=", this.e, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c extends x60 {
        public final long a;
        public final String b;
        public final boolean c;
        public final m89 d;
        public final String e;

        public c(long j, String str, boolean z, m89 m89Var, String str2) {
            str.getClass();
            m89Var.getClass();
            str2.getClass();
            this.a = j;
            this.b = str;
            this.c = z;
            this.d = m89Var;
            this.e = str2;
        }

        @Override // defpackage.x60
        public final long b() {
            return this.a;
        }

        @Override // defpackage.x60
        public final m89 c() {
            return this.d;
        }

        @Override // defpackage.x60
        public final boolean d() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && xj5.a(this.b, cVar.b) && this.c == cVar.c && xj5.a(this.d, cVar.d) && xj5.a(this.e, cVar.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + ((this.d.hashCode() + uo2.a(ru3.c(Long.hashCode(this.a) * 31, 31, this.b), this.c, 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("VideoAttachmentUiEntity(id=");
            sb.append(this.a);
            sb.append(", fileName=");
            sb.append(this.b);
            sb.append(", isSelected=");
            sb.append(this.c);
            sb.append(", originalData=");
            sb.append(this.d);
            return w27.a(sb, ", sourceUrl=", this.e, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class d extends x60 {
        public final long a;
        public final String b;
        public final boolean c;
        public final m89 d;
        public final String e;

        public d(long j, String str, boolean z, m89 m89Var, String str2) {
            str.getClass();
            m89Var.getClass();
            str2.getClass();
            this.a = j;
            this.b = str;
            this.c = z;
            this.d = m89Var;
            this.e = str2;
        }

        @Override // defpackage.x60
        public final long b() {
            return this.a;
        }

        @Override // defpackage.x60
        public final m89 c() {
            return this.d;
        }

        @Override // defpackage.x60
        public final boolean d() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.a == dVar.a && xj5.a(this.b, dVar.b) && this.c == dVar.c && xj5.a(this.d, dVar.d) && xj5.a(this.e, dVar.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + ((this.d.hashCode() + uo2.a(ru3.c(Long.hashCode(this.a) * 31, 31, this.b), this.c, 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("YoutubeAttachmentUiEntity(id=");
            sb.append(this.a);
            sb.append(", fileName=");
            sb.append(this.b);
            sb.append(", isSelected=");
            sb.append(this.c);
            sb.append(", originalData=");
            sb.append(this.d);
            return w27.a(sb, ", sourceUrl=", this.e, ")");
        }
    }

    public final x60 a(boolean z) {
        if (this instanceof a) {
            a aVar = (a) this;
            String str = aVar.b;
            str.getClass();
            m89 m89Var = aVar.d;
            m89Var.getClass();
            return new a(aVar.a, str, z, m89Var);
        }
        if (this instanceof b) {
            b bVar = (b) this;
            String str2 = bVar.b;
            str2.getClass();
            m89 m89Var2 = bVar.d;
            m89Var2.getClass();
            String str3 = bVar.e;
            str3.getClass();
            return new b(bVar.a, str2, z, m89Var2, str3);
        }
        if (this instanceof c) {
            c cVar = (c) this;
            String str4 = cVar.b;
            str4.getClass();
            m89 m89Var3 = cVar.d;
            m89Var3.getClass();
            String str5 = cVar.e;
            str5.getClass();
            return new c(cVar.a, str4, z, m89Var3, str5);
        }
        if (!(this instanceof d)) {
            u.b();
            return null;
        }
        d dVar = (d) this;
        String str6 = dVar.b;
        str6.getClass();
        m89 m89Var4 = dVar.d;
        m89Var4.getClass();
        String str7 = dVar.e;
        str7.getClass();
        return new d(dVar.a, str6, z, m89Var4, str7);
    }

    public abstract long b();

    public abstract m89 c();

    public abstract boolean d();
}
