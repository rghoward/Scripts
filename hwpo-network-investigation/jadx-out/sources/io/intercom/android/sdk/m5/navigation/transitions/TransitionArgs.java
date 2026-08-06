package io.intercom.android.sdk.m5.navigation.transitions;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import defpackage.qq2;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class TransitionArgs implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<TransitionArgs> CREATOR = new Creator();
    private final EnterTransitionStyle enter;
    private final ExitTransitionStyle exit;
    private final EnterTransitionStyle popEnter;
    private final ExitTransitionStyle popExit;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TransitionArgs(EnterTransitionStyle enterTransitionStyle, ExitTransitionStyle exitTransitionStyle, EnterTransitionStyle enterTransitionStyle2, ExitTransitionStyle exitTransitionStyle2, int i, qq2 qq2Var) {
        enterTransitionStyle = (i & 1) != 0 ? EnterTransitionStyle.NULL : enterTransitionStyle;
        exitTransitionStyle = (i & 2) != 0 ? ExitTransitionStyle.NULL : exitTransitionStyle;
        this(enterTransitionStyle, exitTransitionStyle, (i & 4) != 0 ? enterTransitionStyle : enterTransitionStyle2, (i & 8) != 0 ? exitTransitionStyle : exitTransitionStyle2);
    }

    public static /* synthetic */ TransitionArgs copy$default(TransitionArgs transitionArgs, EnterTransitionStyle enterTransitionStyle, ExitTransitionStyle exitTransitionStyle, EnterTransitionStyle enterTransitionStyle2, ExitTransitionStyle exitTransitionStyle2, int i, Object obj) {
        if ((i & 1) != 0) {
            enterTransitionStyle = transitionArgs.enter;
        }
        if ((i & 2) != 0) {
            exitTransitionStyle = transitionArgs.exit;
        }
        if ((i & 4) != 0) {
            enterTransitionStyle2 = transitionArgs.popEnter;
        }
        if ((i & 8) != 0) {
            exitTransitionStyle2 = transitionArgs.popExit;
        }
        return transitionArgs.copy(enterTransitionStyle, exitTransitionStyle, enterTransitionStyle2, exitTransitionStyle2);
    }

    public final EnterTransitionStyle component1() {
        return this.enter;
    }

    public final ExitTransitionStyle component2() {
        return this.exit;
    }

    public final EnterTransitionStyle component3() {
        return this.popEnter;
    }

    public final ExitTransitionStyle component4() {
        return this.popExit;
    }

    public final TransitionArgs copy(EnterTransitionStyle enterTransitionStyle, ExitTransitionStyle exitTransitionStyle, EnterTransitionStyle enterTransitionStyle2, ExitTransitionStyle exitTransitionStyle2) {
        enterTransitionStyle.getClass();
        exitTransitionStyle.getClass();
        enterTransitionStyle2.getClass();
        exitTransitionStyle2.getClass();
        return new TransitionArgs(enterTransitionStyle, exitTransitionStyle, enterTransitionStyle2, exitTransitionStyle2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransitionArgs)) {
            return false;
        }
        TransitionArgs transitionArgs = (TransitionArgs) obj;
        return this.enter == transitionArgs.enter && this.exit == transitionArgs.exit && this.popEnter == transitionArgs.popEnter && this.popExit == transitionArgs.popExit;
    }

    public final EnterTransitionStyle getEnter() {
        return this.enter;
    }

    public final ExitTransitionStyle getExit() {
        return this.exit;
    }

    public final EnterTransitionStyle getPopEnter() {
        return this.popEnter;
    }

    public final ExitTransitionStyle getPopExit() {
        return this.popExit;
    }

    public int hashCode() {
        return this.popExit.hashCode() + ((this.popEnter.hashCode() + ((this.exit.hashCode() + (this.enter.hashCode() * 31)) * 31)) * 31);
    }

    public String toString() {
        String strEncode = Uri.encode(new Gson().toJson(this));
        strEncode.getClass();
        return strEncode;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.enter.name());
        parcel.writeString(this.exit.name());
        parcel.writeString(this.popEnter.name());
        parcel.writeString(this.popExit.name());
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Creator implements Parcelable.Creator<TransitionArgs> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransitionArgs createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new TransitionArgs(EnterTransitionStyle.valueOf(parcel.readString()), ExitTransitionStyle.valueOf(parcel.readString()), EnterTransitionStyle.valueOf(parcel.readString()), ExitTransitionStyle.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransitionArgs[] newArray(int i) {
            return new TransitionArgs[i];
        }
    }

    public TransitionArgs(EnterTransitionStyle enterTransitionStyle, ExitTransitionStyle exitTransitionStyle, EnterTransitionStyle enterTransitionStyle2, ExitTransitionStyle exitTransitionStyle2) {
        enterTransitionStyle.getClass();
        exitTransitionStyle.getClass();
        enterTransitionStyle2.getClass();
        exitTransitionStyle2.getClass();
        this.enter = enterTransitionStyle;
        this.exit = exitTransitionStyle;
        this.popEnter = enterTransitionStyle2;
        this.popExit = exitTransitionStyle2;
    }

    public TransitionArgs() {
        this(null, null, null, null, 15, null);
    }
}
