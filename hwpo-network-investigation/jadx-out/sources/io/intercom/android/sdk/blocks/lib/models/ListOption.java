package io.intercom.android.sdk.blocks.lib.models;

import com.google.gson.annotations.SerializedName;
import defpackage.qq2;
import defpackage.ru3;
import defpackage.uo2;
import defpackage.wu0;
import defpackage.xj5;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ListOption {
    public static final int $stable = 0;

    @SerializedName("archived")
    private final boolean archived;

    @SerializedName("description")
    private final String description;

    @SerializedName("id")
    private final String id;

    @SerializedName("label")
    private final String label;

    public ListOption(String str, boolean z, String str2, String str3) {
        str.getClass();
        str2.getClass();
        this.label = str;
        this.archived = z;
        this.id = str2;
        this.description = str3;
    }

    public static /* synthetic */ ListOption copy$default(ListOption listOption, String str, boolean z, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = listOption.label;
        }
        if ((i & 2) != 0) {
            z = listOption.archived;
        }
        if ((i & 4) != 0) {
            str2 = listOption.id;
        }
        if ((i & 8) != 0) {
            str3 = listOption.description;
        }
        return listOption.copy(str, z, str2, str3);
    }

    public final String component1() {
        return this.label;
    }

    public final boolean component2() {
        return this.archived;
    }

    public final String component3() {
        return this.id;
    }

    public final String component4() {
        return this.description;
    }

    public final ListOption copy(String str, boolean z, String str2, String str3) {
        str.getClass();
        str2.getClass();
        return new ListOption(str, z, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListOption)) {
            return false;
        }
        ListOption listOption = (ListOption) obj;
        return xj5.a(this.label, listOption.label) && this.archived == listOption.archived && xj5.a(this.id, listOption.id) && xj5.a(this.description, listOption.description);
    }

    public final boolean getArchived() {
        return this.archived;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getId() {
        return this.id;
    }

    public final String getLabel() {
        return this.label;
    }

    public int hashCode() {
        int iC = ru3.c(uo2.a(this.label.hashCode() * 31, this.archived, 31), 31, this.id);
        String str = this.description;
        return iC + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ListOption(label=");
        sb.append(this.label);
        sb.append(", archived=");
        sb.append(this.archived);
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", description=");
        return wu0.a(sb, this.description, ')');
    }

    public /* synthetic */ ListOption(String str, boolean z, String str2, String str3, int i, qq2 qq2Var) {
        this(str, z, str2, (i & 8) != 0 ? null : str3);
    }
}
