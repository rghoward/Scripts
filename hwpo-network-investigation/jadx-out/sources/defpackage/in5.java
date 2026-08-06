package defpackage;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class in5 extends l1 {
    public int A;
    public final JsonArray y;
    public final int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public in5(sl5 sl5Var, JsonArray jsonArray) {
        super(sl5Var, jsonArray, null);
        sl5Var.getClass();
        jsonArray.getClass();
        this.y = jsonArray;
        this.z = jsonArray.t.size();
        this.A = -1;
    }

    @Override // defpackage.rt1
    public final int g0(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        int i = this.A;
        if (i >= this.z - 1) {
            return -1;
        }
        int i2 = i + 1;
        this.A = i2;
        return i2;
    }

    @Override // defpackage.j47
    public final String o(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        return String.valueOf(i);
    }

    @Override // defpackage.l1
    public final JsonElement s(String str) {
        str.getClass();
        return this.y.t.get(Integer.parseInt(str));
    }

    @Override // defpackage.l1
    public final JsonElement v() {
        return this.y;
    }
}
