package defpackage;

import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class jn5 extends hn5 {
    public final JsonObject C;
    public final List<String> D;
    public final int E;
    public int F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jn5(sl5 sl5Var, JsonObject jsonObject) {
        super(sl5Var, jsonObject, (String) null, 12);
        sl5Var.getClass();
        this.C = jsonObject;
        List<String> listT = th1.T(jsonObject.t.keySet());
        this.D = listT;
        this.E = listT.size() * 2;
        this.F = -1;
    }

    @Override // defpackage.hn5, defpackage.rt1
    public final int g0(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        int i = this.F;
        if (i >= this.E - 1) {
            return -1;
        }
        int i2 = i + 1;
        this.F = i2;
        return i2;
    }

    @Override // defpackage.hn5, defpackage.l1, defpackage.rt1
    public final void i(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
    }

    @Override // defpackage.hn5, defpackage.j47
    public final String o(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        return this.D.get(i / 2);
    }

    @Override // defpackage.hn5, defpackage.l1
    public final JsonElement s(String str) {
        str.getClass();
        if (this.F % 2 != 0) {
            return (JsonElement) qi6.h(str, this.C);
        }
        pc5 pc5Var = hm5.a;
        return new um5(str, true);
    }

    @Override // defpackage.hn5, defpackage.l1
    public final JsonElement v() {
        return this.C;
    }

    @Override // defpackage.hn5
    /* JADX INFO: renamed from: y */
    public final JsonObject v() {
        return this.C;
    }
}
