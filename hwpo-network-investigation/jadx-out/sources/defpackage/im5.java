package defpackage;

import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class im5 {
    public final be3 a;
    public boolean b;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class a extends pi4 implements ci4<SerialDescriptor, Integer, Boolean> {
        @Override // defpackage.ci4
        public final Boolean invoke(SerialDescriptor serialDescriptor, Integer num) {
            SerialDescriptor serialDescriptor2 = serialDescriptor;
            int iIntValue = num.intValue();
            serialDescriptor2.getClass();
            im5 im5Var = (im5) this.receiver;
            im5Var.getClass();
            boolean z = !serialDescriptor2.j(iIntValue) && serialDescriptor2.i(iIntValue).c();
            im5Var.b = z;
            return Boolean.valueOf(z);
        }
    }

    public im5(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        this.a = new be3(serialDescriptor, new a(2, this, im5.class, "readIfAbsent", "readIfAbsent(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", 0));
    }
}
