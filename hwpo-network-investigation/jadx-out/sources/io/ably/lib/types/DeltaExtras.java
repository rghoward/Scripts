package io.ably.lib.types;

import com.google.gson.JsonObject;
import defpackage.s95;
import defpackage.x7b;
import defpackage.z90;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class DeltaExtras {
    private static final String FORMAT = "format";
    public static final String FORMAT_VCDIFF = "vcdiff";
    private static final String FROM = "from";
    private static final String TAG = "io.ably.lib.types.DeltaExtras";
    private final String format;
    private final String from;

    private DeltaExtras(String str, String str2) {
        if (str == null) {
            z90.a("format cannot be null.");
            throw null;
        }
        if (str2 == null) {
            z90.a("from cannot be null.");
            throw null;
        }
        this.format = str;
        this.from = str2;
    }

    public static DeltaExtras read(Map<x7b, x7b> map) {
        return new DeltaExtras(map.get(new s95(FORMAT)).C().U(), map.get(new s95("from")).C().U());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && DeltaExtras.class == obj.getClass()) {
            DeltaExtras deltaExtras = (DeltaExtras) obj;
            if (this.format.equals(deltaExtras.format) && this.from.equals(deltaExtras.from)) {
                return true;
            }
        }
        return false;
    }

    public String getFormat() {
        return this.format;
    }

    public String getFrom() {
        return this.from;
    }

    public int hashCode() {
        return Objects.hash(this.format, this.from);
    }

    public static DeltaExtras read(JsonObject jsonObject) {
        return new DeltaExtras(jsonObject.get(FORMAT).getAsString(), jsonObject.get("from").getAsString());
    }
}
