package io.intercom.android.sdk.m5.upload.data;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.intercom.twig.BuildConfig;
import defpackage.al;
import defpackage.if3;
import defpackage.os2;
import defpackage.qq2;
import defpackage.ru3;
import defpackage.wu0;
import defpackage.xj5;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public interface MediaData extends Parcelable {
    Object getDataSource();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface Media extends MediaData {
        public static final Companion Companion = Companion.$$INSTANCE;

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();

            private Companion() {
            }

            public final Image empty() {
                Uri uri = Uri.EMPTY;
                uri.getClass();
                return new Image(BuildConfig.FLAVOR, 0, 0, 0L, BuildConfig.FLAVOR, uri, if3.t);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class DefaultImpls {
            public static Uri getDataSource(Media media) {
                return media.getUri();
            }
        }

        @Override // io.intercom.android.sdk.m5.upload.data.MediaData
        Uri getDataSource();

        String getFileName();

        String getMimeType();

        long getSize();

        Uri getUri();

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class Image implements Media {
            public static final int $stable = 8;
            public static final Parcelable.Creator<Image> CREATOR = new Creator();
            private final Map<String, String> exifData;
            private final String fileName;
            private final int height;
            private final String mimeType;
            private final long size;
            private final Uri uri;
            private final int width;

            public Image(String str, int i, int i2, long j, String str2, Uri uri, Map<String, String> map) {
                str.getClass();
                str2.getClass();
                uri.getClass();
                map.getClass();
                this.mimeType = str;
                this.width = i;
                this.height = i2;
                this.size = j;
                this.fileName = str2;
                this.uri = uri;
                this.exifData = map;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Image copy$default(Image image, String str, int i, int i2, long j, String str2, Uri uri, Map map, int i3, Object obj) {
                if ((i3 & 1) != 0) {
                    str = image.mimeType;
                }
                if ((i3 & 2) != 0) {
                    i = image.width;
                }
                if ((i3 & 4) != 0) {
                    i2 = image.height;
                }
                if ((i3 & 8) != 0) {
                    j = image.size;
                }
                if ((i3 & 16) != 0) {
                    str2 = image.fileName;
                }
                if ((i3 & 32) != 0) {
                    uri = image.uri;
                }
                if ((i3 & 64) != 0) {
                    map = image.exifData;
                }
                Map map2 = map;
                String str3 = str2;
                long j2 = j;
                int i4 = i2;
                return image.copy(str, i, i4, j2, str3, uri, map2);
            }

            public final String component1() {
                return this.mimeType;
            }

            public final int component2() {
                return this.width;
            }

            public final int component3() {
                return this.height;
            }

            public final long component4() {
                return this.size;
            }

            public final String component5() {
                return this.fileName;
            }

            public final Uri component6() {
                return this.uri;
            }

            public final Map<String, String> component7() {
                return this.exifData;
            }

            public final Image copy(String str, int i, int i2, long j, String str2, Uri uri, Map<String, String> map) {
                str.getClass();
                str2.getClass();
                uri.getClass();
                map.getClass();
                return new Image(str, i, i2, j, str2, uri, map);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Image)) {
                    return false;
                }
                Image image = (Image) obj;
                return xj5.a(this.mimeType, image.mimeType) && this.width == image.width && this.height == image.height && this.size == image.size && xj5.a(this.fileName, image.fileName) && xj5.a(this.uri, image.uri) && xj5.a(this.exifData, image.exifData);
            }

            @Override // io.intercom.android.sdk.m5.upload.data.MediaData
            public Uri getDataSource() {
                return DefaultImpls.getDataSource(this);
            }

            public final Map<String, String> getExifData() {
                return this.exifData;
            }

            @Override // io.intercom.android.sdk.m5.upload.data.MediaData.Media
            public String getFileName() {
                return this.fileName;
            }

            public final int getHeight() {
                return this.height;
            }

            @Override // io.intercom.android.sdk.m5.upload.data.MediaData.Media
            public String getMimeType() {
                return this.mimeType;
            }

            @Override // io.intercom.android.sdk.m5.upload.data.MediaData.Media
            public long getSize() {
                return this.size;
            }

            @Override // io.intercom.android.sdk.m5.upload.data.MediaData.Media
            public Uri getUri() {
                return this.uri;
            }

            public final int getWidth() {
                return this.width;
            }

            public int hashCode() {
                return this.exifData.hashCode() + ((this.uri.hashCode() + ru3.c(al.c(this.size, os2.a(this.height, os2.a(this.width, this.mimeType.hashCode() * 31, 31), 31), 31), 31, this.fileName)) * 31);
            }

            public String toString() {
                return "Image(mimeType=" + this.mimeType + ", width=" + this.width + ", height=" + this.height + ", size=" + this.size + ", fileName=" + this.fileName + ", uri=" + this.uri + ", exifData=" + this.exifData + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeString(this.mimeType);
                parcel.writeInt(this.width);
                parcel.writeInt(this.height);
                parcel.writeLong(this.size);
                parcel.writeString(this.fileName);
                parcel.writeParcelable(this.uri, i);
                Map<String, String> map = this.exifData;
                parcel.writeInt(map.size());
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    parcel.writeString(entry.getKey());
                    parcel.writeString(entry.getValue());
                }
            }

            /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
            public static final class Creator implements Parcelable.Creator<Image> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Image createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    String string = parcel.readString();
                    int i = parcel.readInt();
                    int i2 = parcel.readInt();
                    long j = parcel.readLong();
                    String string2 = parcel.readString();
                    Uri uri = (Uri) parcel.readParcelable(Image.class.getClassLoader());
                    int i3 = parcel.readInt();
                    LinkedHashMap linkedHashMap = new LinkedHashMap(i3);
                    for (int i4 = 0; i4 != i3; i4++) {
                        linkedHashMap.put(parcel.readString(), parcel.readString());
                    }
                    return new Image(string, i, i2, j, string2, uri, linkedHashMap);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Image[] newArray(int i) {
                    return new Image[i];
                }
            }

            public /* synthetic */ Image(String str, int i, int i2, long j, String str2, Uri uri, Map map, int i3, qq2 qq2Var) {
                this(str, i, i2, j, str2, uri, (i3 & 64) != 0 ? if3.t : map);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class Other implements Media {
            public static final int $stable = 8;
            public static final Parcelable.Creator<Other> CREATOR = new Creator();
            private final String fileName;
            private final String mimeType;
            private final long size;
            private final Uri uri;

            public Other(String str, long j, String str2, Uri uri) {
                str.getClass();
                str2.getClass();
                uri.getClass();
                this.mimeType = str;
                this.size = j;
                this.fileName = str2;
                this.uri = uri;
            }

            public static /* synthetic */ Other copy$default(Other other, String str, long j, String str2, Uri uri, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = other.mimeType;
                }
                if ((i & 2) != 0) {
                    j = other.size;
                }
                if ((i & 4) != 0) {
                    str2 = other.fileName;
                }
                if ((i & 8) != 0) {
                    uri = other.uri;
                }
                return other.copy(str, j, str2, uri);
            }

            public final String component1() {
                return this.mimeType;
            }

            public final long component2() {
                return this.size;
            }

            public final String component3() {
                return this.fileName;
            }

            public final Uri component4() {
                return this.uri;
            }

            public final Other copy(String str, long j, String str2, Uri uri) {
                str.getClass();
                str2.getClass();
                uri.getClass();
                return new Other(str, j, str2, uri);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Other)) {
                    return false;
                }
                Other other = (Other) obj;
                return xj5.a(this.mimeType, other.mimeType) && this.size == other.size && xj5.a(this.fileName, other.fileName) && xj5.a(this.uri, other.uri);
            }

            @Override // io.intercom.android.sdk.m5.upload.data.MediaData
            public Uri getDataSource() {
                return DefaultImpls.getDataSource(this);
            }

            @Override // io.intercom.android.sdk.m5.upload.data.MediaData.Media
            public String getFileName() {
                return this.fileName;
            }

            @Override // io.intercom.android.sdk.m5.upload.data.MediaData.Media
            public String getMimeType() {
                return this.mimeType;
            }

            @Override // io.intercom.android.sdk.m5.upload.data.MediaData.Media
            public long getSize() {
                return this.size;
            }

            @Override // io.intercom.android.sdk.m5.upload.data.MediaData.Media
            public Uri getUri() {
                return this.uri;
            }

            public int hashCode() {
                return this.uri.hashCode() + ru3.c(al.c(this.size, this.mimeType.hashCode() * 31, 31), 31, this.fileName);
            }

            public String toString() {
                return "Other(mimeType=" + this.mimeType + ", size=" + this.size + ", fileName=" + this.fileName + ", uri=" + this.uri + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeString(this.mimeType);
                parcel.writeLong(this.size);
                parcel.writeString(this.fileName);
                parcel.writeParcelable(this.uri, i);
            }

            /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
            public static final class Creator implements Parcelable.Creator<Other> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Other createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    return new Other(parcel.readString(), parcel.readLong(), parcel.readString(), (Uri) parcel.readParcelable(Other.class.getClassLoader()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Other[] newArray(int i) {
                    return new Other[i];
                }
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class Video implements Media {
            public static final int $stable = 8;
            public static final Parcelable.Creator<Video> CREATOR = new Creator();
            private final long duration;
            private final String fileName;
            private final int height;
            private final String mimeType;
            private final long size;
            private final Image thumbnail;
            private final Uri uri;
            private final int width;

            public Video(String str, int i, int i2, long j, String str2, Uri uri, long j2, Image image) {
                str.getClass();
                str2.getClass();
                uri.getClass();
                this.mimeType = str;
                this.width = i;
                this.height = i2;
                this.size = j;
                this.fileName = str2;
                this.uri = uri;
                this.duration = j2;
                this.thumbnail = image;
            }

            public static /* synthetic */ Video copy$default(Video video, String str, int i, int i2, long j, String str2, Uri uri, long j2, Image image, int i3, Object obj) {
                if ((i3 & 1) != 0) {
                    str = video.mimeType;
                }
                if ((i3 & 2) != 0) {
                    i = video.width;
                }
                if ((i3 & 4) != 0) {
                    i2 = video.height;
                }
                if ((i3 & 8) != 0) {
                    j = video.size;
                }
                if ((i3 & 16) != 0) {
                    str2 = video.fileName;
                }
                if ((i3 & 32) != 0) {
                    uri = video.uri;
                }
                if ((i3 & 64) != 0) {
                    j2 = video.duration;
                }
                if ((i3 & 128) != 0) {
                    image = video.thumbnail;
                }
                Image image2 = image;
                long j3 = j;
                int i4 = i2;
                return video.copy(str, i, i4, j3, str2, uri, j2, image2);
            }

            public final String component1() {
                return this.mimeType;
            }

            public final int component2() {
                return this.width;
            }

            public final int component3() {
                return this.height;
            }

            public final long component4() {
                return this.size;
            }

            public final String component5() {
                return this.fileName;
            }

            public final Uri component6() {
                return this.uri;
            }

            public final long component7() {
                return this.duration;
            }

            public final Image component8() {
                return this.thumbnail;
            }

            public final Video copy(String str, int i, int i2, long j, String str2, Uri uri, long j2, Image image) {
                str.getClass();
                str2.getClass();
                uri.getClass();
                return new Video(str, i, i2, j, str2, uri, j2, image);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Video)) {
                    return false;
                }
                Video video = (Video) obj;
                return xj5.a(this.mimeType, video.mimeType) && this.width == video.width && this.height == video.height && this.size == video.size && xj5.a(this.fileName, video.fileName) && xj5.a(this.uri, video.uri) && this.duration == video.duration && xj5.a(this.thumbnail, video.thumbnail);
            }

            @Override // io.intercom.android.sdk.m5.upload.data.MediaData
            public Uri getDataSource() {
                return DefaultImpls.getDataSource(this);
            }

            public final long getDuration() {
                return this.duration;
            }

            @Override // io.intercom.android.sdk.m5.upload.data.MediaData.Media
            public String getFileName() {
                return this.fileName;
            }

            public final int getHeight() {
                return this.height;
            }

            @Override // io.intercom.android.sdk.m5.upload.data.MediaData.Media
            public String getMimeType() {
                return this.mimeType;
            }

            @Override // io.intercom.android.sdk.m5.upload.data.MediaData.Media
            public long getSize() {
                return this.size;
            }

            public final Image getThumbnail() {
                return this.thumbnail;
            }

            @Override // io.intercom.android.sdk.m5.upload.data.MediaData.Media
            public Uri getUri() {
                return this.uri;
            }

            public final int getWidth() {
                return this.width;
            }

            public int hashCode() {
                int iC = al.c(this.duration, (this.uri.hashCode() + ru3.c(al.c(this.size, os2.a(this.height, os2.a(this.width, this.mimeType.hashCode() * 31, 31), 31), 31), 31, this.fileName)) * 31, 31);
                Image image = this.thumbnail;
                return iC + (image == null ? 0 : image.hashCode());
            }

            public String toString() {
                return "Video(mimeType=" + this.mimeType + ", width=" + this.width + ", height=" + this.height + ", size=" + this.size + ", fileName=" + this.fileName + ", uri=" + this.uri + ", duration=" + this.duration + ", thumbnail=" + this.thumbnail + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeString(this.mimeType);
                parcel.writeInt(this.width);
                parcel.writeInt(this.height);
                parcel.writeLong(this.size);
                parcel.writeString(this.fileName);
                parcel.writeParcelable(this.uri, i);
                parcel.writeLong(this.duration);
                Image image = this.thumbnail;
                if (image == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    image.writeToParcel(parcel, i);
                }
            }

            /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
            public static final class Creator implements Parcelable.Creator<Video> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Video createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    return new Video(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readLong(), parcel.readString(), (Uri) parcel.readParcelable(Video.class.getClassLoader()), parcel.readLong(), parcel.readInt() == 0 ? null : Image.CREATOR.createFromParcel(parcel));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Video[] newArray(int i) {
                    return new Video[i];
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Gif implements MediaData {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Gif> CREATOR = new Creator();
        private final String attribution;
        private final int height;
        private final String url;
        private final int width;

        public Gif(int i, int i2, String str, String str2) {
            str.getClass();
            str2.getClass();
            this.width = i;
            this.height = i2;
            this.url = str;
            this.attribution = str2;
        }

        public static /* synthetic */ Gif copy$default(Gif gif, int i, int i2, String str, String str2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = gif.width;
            }
            if ((i3 & 2) != 0) {
                i2 = gif.height;
            }
            if ((i3 & 4) != 0) {
                str = gif.url;
            }
            if ((i3 & 8) != 0) {
                str2 = gif.attribution;
            }
            return gif.copy(i, i2, str, str2);
        }

        public final int component1() {
            return this.width;
        }

        public final int component2() {
            return this.height;
        }

        public final String component3() {
            return this.url;
        }

        public final String component4() {
            return this.attribution;
        }

        public final Gif copy(int i, int i2, String str, String str2) {
            str.getClass();
            str2.getClass();
            return new Gif(i, i2, str, str2);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Gif)) {
                return false;
            }
            Gif gif = (Gif) obj;
            return this.width == gif.width && this.height == gif.height && xj5.a(this.url, gif.url) && xj5.a(this.attribution, gif.attribution);
        }

        public final String getAttribution() {
            return this.attribution;
        }

        public final int getHeight() {
            return this.height;
        }

        public final String getUrl() {
            return this.url;
        }

        public final int getWidth() {
            return this.width;
        }

        public int hashCode() {
            return this.attribution.hashCode() + ru3.c(os2.a(this.height, Integer.hashCode(this.width) * 31, 31), 31, this.url);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Gif(width=");
            sb.append(this.width);
            sb.append(", height=");
            sb.append(this.height);
            sb.append(", url=");
            sb.append(this.url);
            sb.append(", attribution=");
            return wu0.a(sb, this.attribution, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(this.width);
            parcel.writeInt(this.height);
            parcel.writeString(this.url);
            parcel.writeString(this.attribution);
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class Creator implements Parcelable.Creator<Gif> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Gif createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new Gif(parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Gif[] newArray(int i) {
                return new Gif[i];
            }
        }

        @Override // io.intercom.android.sdk.m5.upload.data.MediaData
        public String getDataSource() {
            return this.url;
        }
    }
}
