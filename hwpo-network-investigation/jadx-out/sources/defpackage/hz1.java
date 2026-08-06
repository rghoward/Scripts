package defpackage;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import com.intercom.twig.BuildConfig;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class hz1 {
    public final e a;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements b {
        public final ContentInfo.Builder a;

        public a(ClipData clipData, int i) {
            this.a = gz1.a(clipData, i);
        }

        @Override // hz1.b
        public final void a(Uri uri) {
            this.a.setLinkUri(uri);
        }

        @Override // hz1.b
        public final void b(int i) {
            this.a.setFlags(i);
        }

        @Override // hz1.b
        public final hz1 build() {
            return new hz1(new d(this.a.build()));
        }

        @Override // hz1.b
        public final void setExtras(Bundle bundle) {
            this.a.setExtras(bundle);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface b {
        void a(Uri uri);

        void b(int i);

        hz1 build();

        void setExtras(Bundle bundle);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c implements b {
        public ClipData a;
        public int b;
        public int c;
        public Uri d;
        public Bundle e;

        @Override // hz1.b
        public final void a(Uri uri) {
            this.d = uri;
        }

        @Override // hz1.b
        public final void b(int i) {
            this.c = i;
        }

        @Override // hz1.b
        public final hz1 build() {
            return new hz1(new f(this));
        }

        @Override // hz1.b
        public final void setExtras(Bundle bundle) {
            this.e = bundle;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class d implements e {
        public final ContentInfo a;

        public d(ContentInfo contentInfo) {
            contentInfo.getClass();
            this.a = contentInfo;
        }

        @Override // hz1.e
        public final int a() {
            return this.a.getSource();
        }

        @Override // hz1.e
        public final ClipData b() {
            return this.a.getClip();
        }

        @Override // hz1.e
        public final ContentInfo c() {
            return this.a;
        }

        @Override // hz1.e
        public final int d() {
            return this.a.getFlags();
        }

        public final String toString() {
            return "ContentInfoCompat{" + this.a + "}";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface e {
        int a();

        ClipData b();

        ContentInfo c();

        int d();
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class f implements e {
        public final ClipData a;
        public final int b;
        public final int c;
        public final Uri d;
        public final Bundle e;

        public f(c cVar) {
            ClipData clipData = cVar.a;
            clipData.getClass();
            this.a = clipData;
            int i = cVar.b;
            if (i < 0) {
                Locale locale = Locale.US;
                z90.a("source is out of range of [0, 5] (too low)");
                throw null;
            }
            if (i > 5) {
                Locale locale2 = Locale.US;
                z90.a("source is out of range of [0, 5] (too high)");
                throw null;
            }
            this.b = i;
            int i2 = cVar.c;
            if ((i2 & 1) == i2) {
                this.c = i2;
                this.d = cVar.d;
                this.e = cVar.e;
                return;
            }
            throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i2) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
        }

        @Override // hz1.e
        public final int a() {
            return this.b;
        }

        @Override // hz1.e
        public final ClipData b() {
            return this.a;
        }

        @Override // hz1.e
        public final ContentInfo c() {
            return null;
        }

        @Override // hz1.e
        public final int d() {
            return this.c;
        }

        public final String toString() {
            String strValueOf;
            String str;
            StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
            sb.append(this.a.getDescription());
            sb.append(", source=");
            int i = this.b;
            if (i == 0) {
                strValueOf = "SOURCE_APP";
            } else if (i == 1) {
                strValueOf = "SOURCE_CLIPBOARD";
            } else if (i == 2) {
                strValueOf = "SOURCE_INPUT_METHOD";
            } else if (i == 3) {
                strValueOf = "SOURCE_DRAG_AND_DROP";
            } else if (i != 4) {
                strValueOf = i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT";
            } else {
                strValueOf = "SOURCE_AUTOFILL";
            }
            sb.append(strValueOf);
            sb.append(", flags=");
            int i2 = this.c;
            sb.append((i2 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i2));
            String str2 = BuildConfig.FLAVOR;
            Uri uri = this.d;
            if (uri == null) {
                str = BuildConfig.FLAVOR;
            } else {
                str = ", hasLinkUri(" + uri.toString().length() + ")";
            }
            sb.append(str);
            if (this.e != null) {
                str2 = ", hasExtras";
            }
            return av.a(sb, str2, "}");
        }
    }

    public hz1(e eVar) {
        this.a = eVar;
    }

    public final String toString() {
        return this.a.toString();
    }
}
