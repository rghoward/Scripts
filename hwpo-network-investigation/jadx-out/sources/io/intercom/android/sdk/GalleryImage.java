package io.intercom.android.sdk;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.os2;
import defpackage.qq2;
import defpackage.ru3;
import defpackage.uo2;
import defpackage.wu0;
import defpackage.xj5;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class GalleryImage implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<GalleryImage> CREATOR = new Creator();
    private final String attribution;
    private final String duration;
    private final String fileName;
    private final int fileSize;
    private final int imageHeight;
    private final int imageWidth;
    private final boolean isGif;
    private final boolean isVideo;
    private final String mimeType;
    private final String previewPath;
    private final Uri uri;

    public /* synthetic */ GalleryImage(String str, String str2, Uri uri, String str3, String str4, int i, int i2, int i3, boolean z, boolean z2, String str5, int i4, qq2 qq2Var) {
        this((i4 & 1) != 0 ? com.intercom.twig.BuildConfig.FLAVOR : str, (i4 & 2) != 0 ? com.intercom.twig.BuildConfig.FLAVOR : str2, (i4 & 4) != 0 ? Uri.EMPTY : uri, (i4 & 8) != 0 ? com.intercom.twig.BuildConfig.FLAVOR : str3, (i4 & 16) != 0 ? com.intercom.twig.BuildConfig.FLAVOR : str4, (i4 & 32) != 0 ? 0 : i, (i4 & 64) != 0 ? 0 : i2, (i4 & 128) != 0 ? 0 : i3, (i4 & 256) != 0 ? false : z, (i4 & 512) != 0 ? false : z2, (i4 & 1024) != 0 ? com.intercom.twig.BuildConfig.FLAVOR : str5);
    }

    public static /* synthetic */ GalleryImage copy$default(GalleryImage galleryImage, String str, String str2, Uri uri, String str3, String str4, int i, int i2, int i3, boolean z, boolean z2, String str5, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = galleryImage.fileName;
        }
        if ((i4 & 2) != 0) {
            str2 = galleryImage.mimeType;
        }
        if ((i4 & 4) != 0) {
            uri = galleryImage.uri;
        }
        if ((i4 & 8) != 0) {
            str3 = galleryImage.previewPath;
        }
        if ((i4 & 16) != 0) {
            str4 = galleryImage.attribution;
        }
        if ((i4 & 32) != 0) {
            i = galleryImage.imageWidth;
        }
        if ((i4 & 64) != 0) {
            i2 = galleryImage.imageHeight;
        }
        if ((i4 & 128) != 0) {
            i3 = galleryImage.fileSize;
        }
        if ((i4 & 256) != 0) {
            z = galleryImage.isGif;
        }
        if ((i4 & 512) != 0) {
            z2 = galleryImage.isVideo;
        }
        if ((i4 & 1024) != 0) {
            str5 = galleryImage.duration;
        }
        boolean z3 = z2;
        String str6 = str5;
        int i5 = i3;
        boolean z4 = z;
        int i6 = i;
        int i7 = i2;
        String str7 = str4;
        Uri uri2 = uri;
        return galleryImage.copy(str, str2, uri2, str3, str7, i6, i7, i5, z4, z3, str6);
    }

    public final String component1() {
        return this.fileName;
    }

    public final boolean component10() {
        return this.isVideo;
    }

    public final String component11() {
        return this.duration;
    }

    public final String component2() {
        return this.mimeType;
    }

    public final Uri component3() {
        return this.uri;
    }

    public final String component4() {
        return this.previewPath;
    }

    public final String component5() {
        return this.attribution;
    }

    public final int component6() {
        return this.imageWidth;
    }

    public final int component7() {
        return this.imageHeight;
    }

    public final int component8() {
        return this.fileSize;
    }

    public final boolean component9() {
        return this.isGif;
    }

    public final GalleryImage copy(String str, String str2, Uri uri, String str3, String str4, int i, int i2, int i3, boolean z, boolean z2, String str5) {
        str.getClass();
        str2.getClass();
        uri.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        return new GalleryImage(str, str2, uri, str3, str4, i, i2, i3, z, z2, str5);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GalleryImage)) {
            return false;
        }
        GalleryImage galleryImage = (GalleryImage) obj;
        return xj5.a(this.fileName, galleryImage.fileName) && xj5.a(this.mimeType, galleryImage.mimeType) && xj5.a(this.uri, galleryImage.uri) && xj5.a(this.previewPath, galleryImage.previewPath) && xj5.a(this.attribution, galleryImage.attribution) && this.imageWidth == galleryImage.imageWidth && this.imageHeight == galleryImage.imageHeight && this.fileSize == galleryImage.fileSize && this.isGif == galleryImage.isGif && this.isVideo == galleryImage.isVideo && xj5.a(this.duration, galleryImage.duration);
    }

    public final String getAttribution() {
        return this.attribution;
    }

    public final String getDuration() {
        return this.duration;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final int getFileSize() {
        return this.fileSize;
    }

    public final int getImageHeight() {
        return this.imageHeight;
    }

    public final int getImageWidth() {
        return this.imageWidth;
    }

    public final String getImageWidthXHeight() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.imageWidth);
        sb.append('x');
        sb.append(this.imageHeight);
        return sb.toString();
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    public final String getPreviewPath() {
        return this.previewPath;
    }

    public final Uri getUri() {
        return this.uri;
    }

    public int hashCode() {
        return this.duration.hashCode() + uo2.a(uo2.a(os2.a(this.fileSize, os2.a(this.imageHeight, os2.a(this.imageWidth, ru3.c(ru3.c((this.uri.hashCode() + ru3.c(this.fileName.hashCode() * 31, 31, this.mimeType)) * 31, 31, this.previewPath), 31, this.attribution), 31), 31), 31), this.isGif, 31), this.isVideo, 31);
    }

    public final boolean isGif() {
        return this.isGif;
    }

    public final boolean isVideo() {
        return this.isVideo;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GalleryImage(fileName=");
        sb.append(this.fileName);
        sb.append(", mimeType=");
        sb.append(this.mimeType);
        sb.append(", uri=");
        sb.append(this.uri);
        sb.append(", previewPath=");
        sb.append(this.previewPath);
        sb.append(", attribution=");
        sb.append(this.attribution);
        sb.append(", imageWidth=");
        sb.append(this.imageWidth);
        sb.append(", imageHeight=");
        sb.append(this.imageHeight);
        sb.append(", fileSize=");
        sb.append(this.fileSize);
        sb.append(", isGif=");
        sb.append(this.isGif);
        sb.append(", isVideo=");
        sb.append(this.isVideo);
        sb.append(", duration=");
        return wu0.a(sb, this.duration, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.fileName);
        parcel.writeString(this.mimeType);
        parcel.writeParcelable(this.uri, i);
        parcel.writeString(this.previewPath);
        parcel.writeString(this.attribution);
        parcel.writeInt(this.imageWidth);
        parcel.writeInt(this.imageHeight);
        parcel.writeInt(this.fileSize);
        parcel.writeInt(this.isGif ? 1 : 0);
        parcel.writeInt(this.isVideo ? 1 : 0);
        parcel.writeString(this.duration);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Creator implements Parcelable.Creator<GalleryImage> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GalleryImage createFromParcel(Parcel parcel) {
            parcel.getClass();
            String string = parcel.readString();
            String string2 = parcel.readString();
            Uri uri = (Uri) parcel.readParcelable(GalleryImage.class.getClassLoader());
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            int i3 = parcel.readInt();
            boolean z = false;
            if (parcel.readInt() != 0) {
                z = true;
            }
            return new GalleryImage(string, string2, uri, string3, string4, i, i2, i3, z, parcel.readInt() != 0, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GalleryImage[] newArray(int i) {
            return new GalleryImage[i];
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GalleryImage(String str) {
        this(str, null, null, null, null, 0, 0, 0, false, false, null, 2046, null);
        str.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GalleryImage(String str, String str2) {
        this(str, str2, null, null, null, 0, 0, 0, false, false, null, 2044, null);
        str.getClass();
        str2.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GalleryImage(String str, String str2, Uri uri) {
        this(str, str2, uri, null, null, 0, 0, 0, false, false, null, 2040, null);
        str.getClass();
        str2.getClass();
        uri.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GalleryImage(String str, String str2, Uri uri, String str3) {
        this(str, str2, uri, str3, null, 0, 0, 0, false, false, null, 2032, null);
        str.getClass();
        str2.getClass();
        uri.getClass();
        str3.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GalleryImage(String str, String str2, Uri uri, String str3, String str4) {
        this(str, str2, uri, str3, str4, 0, 0, 0, false, false, null, 2016, null);
        str.getClass();
        str2.getClass();
        uri.getClass();
        str3.getClass();
        str4.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GalleryImage(String str, String str2, Uri uri, String str3, String str4, int i) {
        this(str, str2, uri, str3, str4, i, 0, 0, false, false, null, 1984, null);
        str.getClass();
        str2.getClass();
        uri.getClass();
        str3.getClass();
        str4.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GalleryImage(String str, String str2, Uri uri, String str3, String str4, int i, int i2) {
        this(str, str2, uri, str3, str4, i, i2, 0, false, false, null, 1920, null);
        str.getClass();
        str2.getClass();
        uri.getClass();
        str3.getClass();
        str4.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GalleryImage(String str, String str2, Uri uri, String str3, String str4, int i, int i2, int i3) {
        this(str, str2, uri, str3, str4, i, i2, i3, false, false, null, 1792, null);
        str.getClass();
        str2.getClass();
        uri.getClass();
        str3.getClass();
        str4.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GalleryImage(String str, String str2, Uri uri, String str3, String str4, int i, int i2, int i3, boolean z) {
        this(str, str2, uri, str3, str4, i, i2, i3, z, false, null, 1536, null);
        str.getClass();
        str2.getClass();
        uri.getClass();
        str3.getClass();
        str4.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GalleryImage(String str, String str2, Uri uri, String str3, String str4, int i, int i2, int i3, boolean z, boolean z2) {
        this(str, str2, uri, str3, str4, i, i2, i3, z, z2, null, 1024, null);
        str.getClass();
        str2.getClass();
        uri.getClass();
        str3.getClass();
        str4.getClass();
    }

    public GalleryImage(String str, String str2, Uri uri, String str3, String str4, int i, int i2, int i3, boolean z, boolean z2, String str5) {
        str.getClass();
        str2.getClass();
        uri.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        this.fileName = str;
        this.mimeType = str2;
        this.uri = uri;
        this.previewPath = str3;
        this.attribution = str4;
        this.imageWidth = i;
        this.imageHeight = i2;
        this.fileSize = i3;
        this.isGif = z;
        this.isVideo = z2;
        this.duration = str5;
    }

    public GalleryImage() {
        this(null, null, null, null, null, 0, 0, 0, false, false, null, 2047, null);
    }
}
