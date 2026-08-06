package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class o implements Parcelable {
    public static final Parcelable.Creator<o> CREATOR = new a();
    public final boolean A;
    public final boolean B;
    public final boolean C;
    public final boolean D;
    public final int E;
    public final String F;
    public final int G;
    public final boolean H;
    public final String t;
    public final String u;
    public final boolean v;
    public final boolean w;
    public final int x;
    public final int y;
    public final String z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a implements Parcelable.Creator<o> {
        @Override // android.os.Parcelable.Creator
        public final o createFromParcel(Parcel parcel) {
            return new o(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final o[] newArray(int i) {
            return new o[i];
        }
    }

    public o(Parcel parcel) {
        this.t = parcel.readString();
        this.u = parcel.readString();
        this.v = parcel.readInt() != 0;
        this.w = parcel.readInt() != 0;
        this.x = parcel.readInt();
        this.y = parcel.readInt();
        this.z = parcel.readString();
        this.A = parcel.readInt() != 0;
        this.B = parcel.readInt() != 0;
        this.C = parcel.readInt() != 0;
        this.D = parcel.readInt() != 0;
        this.E = parcel.readInt();
        this.F = parcel.readString();
        this.G = parcel.readInt();
        this.H = parcel.readInt() != 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.t);
        sb.append(" (");
        sb.append(this.u);
        sb.append(")}:");
        if (this.v) {
            sb.append(" fromLayout");
        }
        if (this.w) {
            sb.append(" dynamicContainer");
        }
        int i = this.y;
        if (i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i));
        }
        String str = this.z;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.A) {
            sb.append(" retainInstance");
        }
        if (this.B) {
            sb.append(" removing");
        }
        if (this.C) {
            sb.append(" detached");
        }
        if (this.D) {
            sb.append(" hidden");
        }
        String str2 = this.F;
        if (str2 != null) {
            sb.append(" targetWho=");
            sb.append(str2);
            sb.append(" targetRequestCode=");
            sb.append(this.G);
        }
        if (this.H) {
            sb.append(" userVisibleHint");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.t);
        parcel.writeString(this.u);
        parcel.writeInt(this.v ? 1 : 0);
        parcel.writeInt(this.w ? 1 : 0);
        parcel.writeInt(this.x);
        parcel.writeInt(this.y);
        parcel.writeString(this.z);
        parcel.writeInt(this.A ? 1 : 0);
        parcel.writeInt(this.B ? 1 : 0);
        parcel.writeInt(this.C ? 1 : 0);
        parcel.writeInt(this.D ? 1 : 0);
        parcel.writeInt(this.E);
        parcel.writeString(this.F);
        parcel.writeInt(this.G);
        parcel.writeInt(this.H ? 1 : 0);
    }

    public o(f fVar) {
        this.t = fVar.getClass().getName();
        this.u = fVar.mWho;
        this.v = fVar.mFromLayout;
        this.w = fVar.mInDynamicContainer;
        this.x = fVar.mFragmentId;
        this.y = fVar.mContainerId;
        this.z = fVar.mTag;
        this.A = fVar.mRetainInstance;
        this.B = fVar.mRemoving;
        this.C = fVar.mDetached;
        this.D = fVar.mHidden;
        this.E = fVar.mMaxState.ordinal();
        this.F = fVar.mTargetWho;
        this.G = fVar.mTargetRequestCode;
        this.H = fVar.mUserVisibleHint;
    }
}
