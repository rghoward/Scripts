package defpackage;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class sk1 implements v23 {
    public final long a;
    public final boolean b;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    /* JADX INFO: loaded from: classes3.dex */
    public static final class a extends sk1 {
        public final long c;
        public final boolean d;
        public final boolean e;
        public final String f;
        public final String g;
        public final String h;
        public final String i;
        public final CharSequence j;
        public final List<w60> k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(long j, boolean z, boolean z2, String str, String str2, String str3, String str4, CharSequence charSequence, List<? extends w60> list) {
            super(j, z2);
            str2.getClass();
            str4.getClass();
            this.c = j;
            this.d = z;
            this.e = z2;
            this.f = str;
            this.g = str2;
            this.h = str3;
            this.i = str4;
            this.j = charSequence;
            this.k = list;
        }

        @Override // defpackage.sk1
        public final long a() {
            return this.c;
        }

        @Override // defpackage.sk1
        public final boolean b() {
            return this.e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!a.class.equals(obj != null ? obj.getClass() : null)) {
                return false;
            }
            obj.getClass();
            a aVar = (a) obj;
            return this.c == aVar.c && this.d == aVar.d && this.e == aVar.e && this.f.equals(aVar.f) && xj5.a(this.g, aVar.g) && xj5.a(this.h, aVar.h) && xj5.a(this.i, aVar.i) && xj5.a(this.j.toString(), aVar.j.toString()) && this.k.equals(aVar.k);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Long.valueOf(this.c), Boolean.valueOf(this.d), Boolean.valueOf(this.e), this.f, this.g, this.h, this.i, this.j, this.k});
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MediaCommentUiEntity(id=");
            sb.append(this.c);
            sb.append(", isRead=");
            sb.append(this.d);
            sb.append(", isMine=");
            sb.append(this.e);
            sb.append(", sentTimeText=");
            sb.append(this.f);
            ux1.b(sb, ", authorName=", this.g, ", authorAvatarUrl=", this.h);
            sb.append(", authorAvatarLetter=");
            sb.append(this.i);
            sb.append(", text=");
            sb.append((Object) this.j);
            sb.append(", attachments=");
            sb.append(this.k);
            sb.append(")");
            return sb.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b extends sk1 {
        public final long c;
        public final boolean d;
        public final boolean e;
        public final String f;
        public final String g;
        public final String h;
        public final String i;
        public final CharSequence j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j, boolean z, boolean z2, String str, String str2, String str3, String str4, CharSequence charSequence) {
            super(j, z2);
            str2.getClass();
            str4.getClass();
            this.c = j;
            this.d = z;
            this.e = z2;
            this.f = str;
            this.g = str2;
            this.h = str3;
            this.i = str4;
            this.j = charSequence;
        }

        @Override // defpackage.sk1
        public final long a() {
            return this.c;
        }

        @Override // defpackage.sk1
        public final boolean b() {
            return this.e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!b.class.equals(obj != null ? obj.getClass() : null)) {
                return false;
            }
            obj.getClass();
            b bVar = (b) obj;
            return this.c == bVar.c && this.d == bVar.d && this.e == bVar.e && this.f.equals(bVar.f) && xj5.a(this.g, bVar.g) && xj5.a(this.h, bVar.h) && xj5.a(this.i, bVar.i) && xj5.a(this.j.toString(), bVar.j.toString());
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Long.valueOf(this.c), Boolean.valueOf(this.d), Boolean.valueOf(this.e), this.f, this.g, this.h, this.i, this.j});
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TextCommentUiEntity(id=");
            sb.append(this.c);
            sb.append(", isRead=");
            sb.append(this.d);
            sb.append(", isMine=");
            sb.append(this.e);
            sb.append(", sentTimeText=");
            sb.append(this.f);
            ux1.b(sb, ", authorName=", this.g, ", authorAvatarUrl=", this.h);
            sb.append(", authorAvatarLetter=");
            sb.append(this.i);
            sb.append(", text=");
            sb.append((Object) this.j);
            sb.append(")");
            return sb.toString();
        }
    }

    public sk1(long j, boolean z) {
        this.a = j;
        this.b = z;
    }

    public long a() {
        return this.a;
    }

    public boolean b() {
        return this.b;
    }
}
