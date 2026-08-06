package io.intercom.android.sdk.blocks.lib.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.intercom.twig.BuildConfig;
import defpackage.al;
import defpackage.fh0;
import defpackage.fk;
import defpackage.qq2;
import defpackage.xj5;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class BlockAttachment implements Parcelable {
    public static final int $stable = 0;

    @SerializedName("contentType")
    private final String _contentType;

    @SerializedName("humanFileSize")
    private final String _humanFileSize;

    @SerializedName("name")
    private final String _name;

    @SerializedName("url")
    private final String _url;

    @SerializedName("id")
    private final long id;

    @SerializedName("size")
    private final long size;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<BlockAttachment> CREATOR = new Creator();

    public /* synthetic */ BlockAttachment(String str, String str2, String str3, String str4, long j, long j2, int i, qq2 qq2Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? 0L : j, (i & 32) != 0 ? 0L : j2);
    }

    private final String component1() {
        return this._name;
    }

    private final String component2() {
        return this._url;
    }

    private final String component3() {
        return this._contentType;
    }

    private final String component4() {
        return this._humanFileSize;
    }

    public static /* synthetic */ BlockAttachment copy$default(BlockAttachment blockAttachment, String str, String str2, String str3, String str4, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = blockAttachment._name;
        }
        if ((i & 2) != 0) {
            str2 = blockAttachment._url;
        }
        if ((i & 4) != 0) {
            str3 = blockAttachment._contentType;
        }
        if ((i & 8) != 0) {
            str4 = blockAttachment._humanFileSize;
        }
        if ((i & 16) != 0) {
            j = blockAttachment.size;
        }
        if ((i & 32) != 0) {
            j2 = blockAttachment.id;
        }
        long j3 = j2;
        long j4 = j;
        return blockAttachment.copy(str, str2, str3, str4, j4, j3);
    }

    public static final BlockAttachment create(String str, String str2, String str3, String str4, long j, long j2) {
        return Companion.create(str, str2, str3, str4, j, j2);
    }

    public final long component5() {
        return this.size;
    }

    public final long component6() {
        return this.id;
    }

    public final BlockAttachment copy(String str, String str2, String str3, String str4, long j, long j2) {
        return new BlockAttachment(str, str2, str3, str4, j, j2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BlockAttachment)) {
            return false;
        }
        BlockAttachment blockAttachment = (BlockAttachment) obj;
        return xj5.a(this._name, blockAttachment._name) && xj5.a(this._url, blockAttachment._url) && xj5.a(this._contentType, blockAttachment._contentType) && xj5.a(this._humanFileSize, blockAttachment._humanFileSize) && this.size == blockAttachment.size && this.id == blockAttachment.id;
    }

    public final String getContentType() {
        String str = this._contentType;
        return str == null ? BuildConfig.FLAVOR : str;
    }

    public final String getHumanFileSize() {
        String str = this._humanFileSize;
        return str == null ? BuildConfig.FLAVOR : str;
    }

    public final long getId() {
        return this.id;
    }

    public final String getName() {
        String str = this._name;
        return str == null ? BuildConfig.FLAVOR : str;
    }

    public final long getSize() {
        return this.size;
    }

    public final String getUrl() {
        String str = this._url;
        return str == null ? BuildConfig.FLAVOR : str;
    }

    public int hashCode() {
        String str = this._name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this._url;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this._contentType;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this._humanFileSize;
        return Long.hashCode(this.id) + al.c(this.size, (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31, 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BlockAttachment(_name=");
        sb.append(this._name);
        sb.append(", _url=");
        sb.append(this._url);
        sb.append(", _contentType=");
        sb.append(this._contentType);
        sb.append(", _humanFileSize=");
        sb.append(this._humanFileSize);
        sb.append(", size=");
        sb.append(this.size);
        sb.append(", id=");
        return fh0.b(sb, this.id, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this._name);
        parcel.writeString(this._url);
        parcel.writeString(this._contentType);
        parcel.writeString(this._humanFileSize);
        parcel.writeLong(this.size);
        parcel.writeLong(this.id);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public /* synthetic */ Companion(qq2 qq2Var) {
            this();
        }

        public static /* synthetic */ BlockAttachment create$default(Companion companion, String str, String str2, String str3, String str4, long j, long j2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = BuildConfig.FLAVOR;
            }
            if ((i & 2) != 0) {
                str2 = BuildConfig.FLAVOR;
            }
            if ((i & 4) != 0) {
                str3 = BuildConfig.FLAVOR;
            }
            if ((i & 8) != 0) {
                str4 = BuildConfig.FLAVOR;
            }
            if ((i & 16) != 0) {
                j = 0;
            }
            if ((i & 32) != 0) {
                j2 = 0;
            }
            return companion.create(str, str2, str3, str4, j, j2);
        }

        public final BlockAttachment create(String str, String str2, String str3, String str4) {
            str.getClass();
            str2.getClass();
            str3.getClass();
            str4.getClass();
            return create$default(this, str, str2, str3, str4, 0L, 0L, 48, null);
        }

        private Companion() {
        }

        public final BlockAttachment create(String str) {
            str.getClass();
            return create$default(this, str, null, null, null, 0L, 0L, 62, null);
        }

        public final BlockAttachment create(String str, String str2) {
            str.getClass();
            str2.getClass();
            return create$default(this, str, str2, null, null, 0L, 0L, 60, null);
        }

        public final BlockAttachment create(String str, String str2, String str3) {
            fk.b(str, str2, str3);
            return create$default(this, str, str2, str3, null, 0L, 0L, 56, null);
        }

        public final BlockAttachment create() {
            return create$default(this, null, null, null, null, 0L, 0L, 63, null);
        }

        public final BlockAttachment create(String str, String str2, String str3, String str4, long j) {
            str.getClass();
            str2.getClass();
            str3.getClass();
            str4.getClass();
            return create$default(this, str, str2, str3, str4, j, 0L, 32, null);
        }

        public final BlockAttachment create(String str, String str2, String str3, String str4, long j, long j2) {
            str.getClass();
            str2.getClass();
            str3.getClass();
            str4.getClass();
            return new BlockAttachment(str, str2, str3, str4, j, j2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Creator implements Parcelable.Creator<BlockAttachment> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BlockAttachment createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new BlockAttachment(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readLong());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BlockAttachment[] newArray(int i) {
            return new BlockAttachment[i];
        }
    }

    public static final BlockAttachment create(String str) {
        return Companion.create(str);
    }

    public static final BlockAttachment create(String str, String str2) {
        return Companion.create(str, str2);
    }

    public static final BlockAttachment create(String str, String str2, String str3) {
        return Companion.create(str, str2, str3);
    }

    public static final BlockAttachment create(String str, String str2, String str3, String str4) {
        return Companion.create(str, str2, str3, str4);
    }

    public static final BlockAttachment create(String str, String str2, String str3, String str4, long j) {
        return Companion.create(str, str2, str3, str4, j);
    }

    public static final BlockAttachment create() {
        return Companion.create();
    }

    public BlockAttachment(String str) {
        this(str, null, null, null, 0L, 0L, 62, null);
    }

    public BlockAttachment(String str, String str2) {
        this(str, str2, null, null, 0L, 0L, 60, null);
    }

    public BlockAttachment(String str, String str2, String str3) {
        this(str, str2, str3, null, 0L, 0L, 56, null);
    }

    public BlockAttachment(String str, String str2, String str3, String str4) {
        this(str, str2, str3, str4, 0L, 0L, 48, null);
    }

    public BlockAttachment(String str, String str2, String str3, String str4, long j) {
        this(str, str2, str3, str4, j, 0L, 32, null);
    }

    public BlockAttachment(String str, String str2, String str3, String str4, long j, long j2) {
        this._name = str;
        this._url = str2;
        this._contentType = str3;
        this._humanFileSize = str4;
        this.size = j;
        this.id = j2;
    }

    public BlockAttachment() {
        this(null, null, null, null, 0L, 0L, 63, null);
    }
}
