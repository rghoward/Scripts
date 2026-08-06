package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class w60 {
    public final long a;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends w60 implements c {
        public final long b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;
        public final String g;
        public final long h;
        public final String i;
        public final s60 j;
        public final xc9 k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j, String str, String str2, String str3, String str4, String str5, long j2, String str6, s60 s60Var, xc9 xc9Var) {
            super(j);
            str.getClass();
            str4.getClass();
            str6.getClass();
            s60Var.getClass();
            this.b = j;
            this.c = str;
            this.d = str2;
            this.e = str3;
            this.f = str4;
            this.g = str5;
            this.h = j2;
            this.i = str6;
            this.j = s60Var;
            this.k = xc9Var;
        }

        @Override // w60.c
        public final xc9 a() {
            return this.k;
        }

        @Override // defpackage.w60
        public final long b() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.b == aVar.b && xj5.a(this.c, aVar.c) && this.d.equals(aVar.d) && this.e.equals(aVar.e) && xj5.a(this.f, aVar.f) && this.g.equals(aVar.g) && this.h == aVar.h && xj5.a(this.i, aVar.i) && this.j == aVar.j && this.k == aVar.k;
        }

        @Override // defpackage.w60
        public final int hashCode() {
            return this.k.hashCode() + ((this.j.hashCode() + ru3.c(al.c(this.h, ru3.c(ru3.c(ru3.c(ru3.c(ru3.c(Long.hashCode(this.b) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31), 31, this.i)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("FileAttachment(id=");
            sb.append(this.b);
            sb.append(", title=");
            sb.append(this.c);
            ux1.b(sb, ", extension=", this.d, ", size=", this.e);
            ux1.b(sb, ", sourceUrl=", this.f, ", localFilePath=", this.g);
            sb.append(", fileSizeInBytes=");
            sb.append(this.h);
            sb.append(", contentType=");
            sb.append(this.i);
            sb.append(", downloadingStatus=");
            sb.append(this.j);
            sb.append(", sendingStatus=");
            sb.append(this.k);
            sb.append(")");
            return sb.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b extends w60 implements c {
        public final long b;
        public final u60 c;
        public final String d;
        public final String e;
        public final String f;
        public final String g;
        public final String h;
        public final xc9 i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j, u60 u60Var, String str, String str2, String str3, String str4, String str5, xc9 xc9Var) {
            super(j);
            u60Var.getClass();
            str3.getClass();
            this.b = j;
            this.c = u60Var;
            this.d = str;
            this.e = str2;
            this.f = str3;
            this.g = str4;
            this.h = str5;
            this.i = xc9Var;
        }

        @Override // w60.c
        public final xc9 a() {
            return this.i;
        }

        @Override // defpackage.w60
        public final long b() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.b == bVar.b && this.c == bVar.c && this.d.equals(bVar.d) && this.e.equals(bVar.e) && xj5.a(this.f, bVar.f) && xj5.a(this.g, bVar.g) && xj5.a(this.h, bVar.h) && this.i == bVar.i;
        }

        @Override // defpackage.w60
        public final int hashCode() {
            int iC = ru3.c(ru3.c(ru3.c((this.c.hashCode() + (Long.hashCode(this.b) * 31)) * 31, 31, this.d), 31, this.e), 31, this.f);
            String str = this.g;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.h;
            return this.i.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MediaAttachment(id=");
            sb.append(this.b);
            sb.append(", type=");
            sb.append(this.c);
            ux1.b(sb, ", thumbnail=", this.d, ", thumbnailMedium=", this.e);
            ux1.b(sb, ", sourceUrl=", this.f, ", streamSource=", this.g);
            sb.append(", youtubeVideoId=");
            sb.append(this.h);
            sb.append(", sendingStatus=");
            sb.append(this.i);
            sb.append(")");
            return sb.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface c {
        xc9 a();
    }

    public w60(long j) {
        this.a = j;
    }

    public long b() {
        return this.a;
    }

    public abstract int hashCode();
}
