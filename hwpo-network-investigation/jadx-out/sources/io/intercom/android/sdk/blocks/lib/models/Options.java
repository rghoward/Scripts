package io.intercom.android.sdk.blocks.lib.models;

import com.google.gson.annotations.SerializedName;
import com.intercom.twig.BuildConfig;
import defpackage.hf3;
import defpackage.ho2;
import defpackage.qq2;
import defpackage.wu0;
import defpackage.xj5;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class Options {
    public static final int $stable = 8;

    @SerializedName("accept")
    private final String accept;

    @SerializedName("list_options")
    private final List<ListOption> listOptions;

    @SerializedName("multiline")
    private final boolean multiline;

    public /* synthetic */ Options(boolean z, List list, String str, int i, qq2 qq2Var) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? hf3.t : list, (i & 4) != 0 ? BuildConfig.FLAVOR : str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Options copy$default(Options options, boolean z, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = options.multiline;
        }
        if ((i & 2) != 0) {
            list = options.listOptions;
        }
        if ((i & 4) != 0) {
            str = options.accept;
        }
        return options.copy(z, list, str);
    }

    public final boolean component1() {
        return this.multiline;
    }

    public final List<ListOption> component2() {
        return this.listOptions;
    }

    public final String component3() {
        return this.accept;
    }

    public final Options copy(boolean z, List<ListOption> list, String str) {
        list.getClass();
        str.getClass();
        return new Options(z, list, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Options)) {
            return false;
        }
        Options options = (Options) obj;
        return this.multiline == options.multiline && xj5.a(this.listOptions, options.listOptions) && xj5.a(this.accept, options.accept);
    }

    public final String getAccept() {
        return this.accept;
    }

    public final List<ListOption> getListOptions() {
        return this.listOptions;
    }

    public final boolean getMultiline() {
        return this.multiline;
    }

    public int hashCode() {
        return this.accept.hashCode() + ho2.a(Boolean.hashCode(this.multiline) * 31, 31, this.listOptions);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Options(multiline=");
        sb.append(this.multiline);
        sb.append(", listOptions=");
        sb.append(this.listOptions);
        sb.append(", accept=");
        return wu0.a(sb, this.accept, ')');
    }

    public Options(boolean z, List<ListOption> list, String str) {
        list.getClass();
        str.getClass();
        this.multiline = z;
        this.listOptions = list;
        this.accept = str;
    }

    public Options() {
        this(false, null, null, 7, null);
    }
}
