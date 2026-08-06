package io.intercom.android.sdk.models;

import com.google.gson.annotations.SerializedName;
import defpackage.nl3;
import defpackage.ol3;
import defpackage.qq2;
import defpackage.wu0;
import defpackage.xj5;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class Space {
    public static final int $stable = 0;

    @SerializedName("label")
    private final String label;

    @SerializedName("type")
    private final Type type;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public enum Type {
        HOME,
        MESSAGES,
        HELP,
        TICKETS;

        private static final /* synthetic */ nl3 $ENTRIES = ol3.b(values());

        public static nl3<Type> getEntries() {
            return $ENTRIES;
        }
    }

    public /* synthetic */ Space(Type type, String str, int i, qq2 qq2Var) {
        this((i & 1) != 0 ? Type.HOME : type, (i & 2) != 0 ? null : str);
    }

    public static /* synthetic */ Space copy$default(Space space, Type type, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            type = space.type;
        }
        if ((i & 2) != 0) {
            str = space.label;
        }
        return space.copy(type, str);
    }

    public final Type component1() {
        return this.type;
    }

    public final String component2() {
        return this.label;
    }

    public final Space copy(Type type, String str) {
        type.getClass();
        return new Space(type, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Space)) {
            return false;
        }
        Space space = (Space) obj;
        return this.type == space.type && xj5.a(this.label, space.label);
    }

    public final String getLabel() {
        return this.label;
    }

    public final Type getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        String str = this.label;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Space(type=");
        sb.append(this.type);
        sb.append(", label=");
        return wu0.a(sb, this.label, ')');
    }

    public Space(Type type, String str) {
        type.getClass();
        this.type = type;
        this.label = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Space() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
