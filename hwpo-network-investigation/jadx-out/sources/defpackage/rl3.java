package defpackage;

import java.lang.Enum;
import java.util.Arrays;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class rl3<T extends Enum<T>> implements KSerializer<T> {
    public final T[] a;
    public ml3 b;
    public final o7a c;

    public rl3(String str, T[] tArr) {
        tArr.getClass();
        this.a = tArr;
        this.c = new o7a(new ql3(0, this, str));
    }

    @Override // defpackage.sy2
    public final Object deserialize(Decoder decoder) {
        int iF = decoder.F(getDescriptor());
        T[] tArr = this.a;
        if (iF >= 0 && iF < tArr.length) {
            return tArr[iF];
        }
        throw new td9(iF + " is not among valid " + getDescriptor().a() + " enum values, values size is " + tArr.length);
    }

    @Override // defpackage.ud9, defpackage.sy2
    public final SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.c.getValue();
    }

    @Override // defpackage.ud9
    public final void serialize(Encoder encoder, Object obj) {
        Enum r5 = (Enum) obj;
        r5.getClass();
        T[] tArr = this.a;
        int iA = u30.A(tArr, r5);
        if (iA != -1) {
            encoder.s(getDescriptor(), iA);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(r5);
        String strA = getDescriptor().a();
        String string = Arrays.toString(tArr);
        string.getClass();
        sb.append(" is not a valid enum ");
        sb.append(strA);
        sb.append(", must be one of ");
        sb.append(string);
        throw new td9(sb.toString());
    }

    public final String toString() {
        return "kotlinx.serialization.internal.EnumSerializer<" + getDescriptor().a() + '>';
    }
}
