package defpackage;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class dn5 extends l1 {
    public final JsonElement y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dn5(sl5 sl5Var, JsonElement jsonElement, String str) {
        super(sl5Var, jsonElement, str);
        sl5Var.getClass();
        jsonElement.getClass();
        this.y = jsonElement;
        this.t.add("primitive");
    }

    @Override // defpackage.rt1
    public final int g0(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        return 0;
    }

    @Override // defpackage.l1
    public final JsonElement s(String str) {
        str.getClass();
        if (str == "primitive") {
            return this.y;
        }
        z90.a("This input can only handle primitives with 'primitive' tag");
        return null;
    }

    @Override // defpackage.l1
    public final JsonElement v() {
        return this.y;
    }
}
