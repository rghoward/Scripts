package io.intercom.android.sdk.m5.preview.data;

import android.content.Context;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Patterns;
import defpackage.qq2;
import defpackage.u;
import defpackage.wu0;
import defpackage.xj5;
import defpackage.z2a;
import io.intercom.android.sdk.models.carousel.AppearanceType;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class IntercomPreviewFile implements Parcelable {
    private final Uri uri;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    private IntercomPreviewFile(Uri uri) {
        this.uri = uri;
    }

    public final String getMimeType(Context context) {
        context.getClass();
        if (this instanceof LocalFile) {
            String type = context.getContentResolver().getType(this.uri);
            return type == null ? "application/*" : type;
        }
        if (this instanceof NetworkFile) {
            return ((NetworkFile) this).getMimeType();
        }
        u.b();
        return null;
    }

    public final Uri getUri() {
        return this.uri;
    }

    public final boolean isImage(Context context) {
        context.getClass();
        return z2a.o(getMimeType(context), AppearanceType.IMAGE, false);
    }

    public final boolean isVideo(Context context) {
        context.getClass();
        return z2a.o(getMimeType(context), "video", false);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public /* synthetic */ Companion(qq2 qq2Var) {
            this();
        }

        private final boolean isRemoteUrl(String str) {
            return Patterns.WEB_URL.matcher(str).matches();
        }

        public final IntercomPreviewFile fromUrl(String str, String str2) {
            str.getClass();
            str2.getClass();
            return isRemoteUrl(str) ? new NetworkFile(str, str2) : new LocalFile(Uri.parse(str));
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class LocalFile extends IntercomPreviewFile {
        public static final int $stable = 8;
        public static final Parcelable.Creator<LocalFile> CREATOR = new Creator();
        private final Uri fileUri;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LocalFile(Uri uri) {
            super(uri, null);
            uri.getClass();
            this.fileUri = uri;
        }

        public static /* synthetic */ LocalFile copy$default(LocalFile localFile, Uri uri, int i, Object obj) {
            if ((i & 1) != 0) {
                uri = localFile.fileUri;
            }
            return localFile.copy(uri);
        }

        public final Uri component1() {
            return this.fileUri;
        }

        public final LocalFile copy(Uri uri) {
            uri.getClass();
            return new LocalFile(uri);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LocalFile) && xj5.a(this.fileUri, ((LocalFile) obj).fileUri);
        }

        public final Uri getFileUri() {
            return this.fileUri;
        }

        public int hashCode() {
            return this.fileUri.hashCode();
        }

        public String toString() {
            return "LocalFile(fileUri=" + this.fileUri + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.fileUri, i);
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class Creator implements Parcelable.Creator<LocalFile> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LocalFile createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new LocalFile((Uri) parcel.readParcelable(LocalFile.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LocalFile[] newArray(int i) {
                return new LocalFile[i];
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class NetworkFile extends IntercomPreviewFile {
        public static final int $stable = 0;
        public static final Parcelable.Creator<NetworkFile> CREATOR = new Creator();
        private final String mimeType;
        private final String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NetworkFile(String str, String str2) {
            super(Uri.parse(str), null);
            str.getClass();
            str2.getClass();
            this.url = str;
            this.mimeType = str2;
        }

        public static /* synthetic */ NetworkFile copy$default(NetworkFile networkFile, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = networkFile.url;
            }
            if ((i & 2) != 0) {
                str2 = networkFile.mimeType;
            }
            return networkFile.copy(str, str2);
        }

        public final String component1() {
            return this.url;
        }

        public final String component2() {
            return this.mimeType;
        }

        public final NetworkFile copy(String str, String str2) {
            str.getClass();
            str2.getClass();
            return new NetworkFile(str, str2);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NetworkFile)) {
                return false;
            }
            NetworkFile networkFile = (NetworkFile) obj;
            return xj5.a(this.url, networkFile.url) && xj5.a(this.mimeType, networkFile.mimeType);
        }

        public final String getMimeType() {
            return this.mimeType;
        }

        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return this.mimeType.hashCode() + (this.url.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("NetworkFile(url=");
            sb.append(this.url);
            sb.append(", mimeType=");
            return wu0.a(sb, this.mimeType, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.url);
            parcel.writeString(this.mimeType);
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class Creator implements Parcelable.Creator<NetworkFile> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NetworkFile createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new NetworkFile(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NetworkFile[] newArray(int i) {
                return new NetworkFile[i];
            }
        }
    }

    public /* synthetic */ IntercomPreviewFile(Uri uri, qq2 qq2Var) {
        this(uri);
    }
}
