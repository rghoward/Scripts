package defpackage;

import android.content.ContentResolver;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import io.intercom.android.sdk.models.carousel.AppearanceType;
import java.io.ByteArrayOutputStream;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class rk4 extends g5b<Uri, a> {
    public final ContentResolver a;
    public final dq0 b;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public final ByteArrayOutputStream a;
        public final String b;
        public final String c;

        public a(ByteArrayOutputStream byteArrayOutputStream, String str, String str2) {
            this.a = byteArrayOutputStream;
            this.b = str;
            this.c = str2;
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
            StringBuilder sb = new StringBuilder("OutputParams(bitmapStream=");
            sb.append(this.a);
            sb.append(", fileName=");
            sb.append(this.b);
            sb.append(", mimeType=");
            return av.a(sb, this.c, ")");
        }
    }

    public rk4(ContentResolver contentResolver, dq0 dq0Var) {
        this.a = contentResolver;
        this.b = dq0Var;
    }

    @Override // defpackage.g5b
    public final Object a(Object obj, g5b.b bVar) {
        String string;
        Uri uri = (Uri) obj;
        String type = this.a.getType(uri);
        if (type == null) {
            type = AppearanceType.IMAGE;
        }
        String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(type);
        if (extensionFromMimeType == null) {
            extensionFromMimeType = "jpg";
        }
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment != null) {
            string = w2a.l(lastPathSegment, ":", "_");
        } else {
            string = UUID.randomUUID().toString();
            string.getClass();
        }
        if (!w2a.h(string, extensionFromMimeType, false)) {
            string = cj2.a(string, ".", extensionFromMimeType);
        }
        return new a(this.b.a(uri), string, type);
    }
}
