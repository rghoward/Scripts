package defpackage;

import java.io.File;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vy5 implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ vy5(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        int i = this.t;
        Object obj2 = this.u;
        switch (i) {
            case 0:
                return zy5.v((qy5) obj2, ((Integer) obj).intValue());
            case 1:
                File file = (File) obj;
                file.getClass();
                return new q07(((o02) obj2).t, file);
            case 2:
                ya yaVar = (ya) obj2;
                ((List) obj).getClass();
                ((ha6) yaVar.u).b.setText(((h08) yaVar.t()).u);
                return g2b.a;
            default:
                final c89 c89Var = (c89) obj2;
                td1 td1Var = (td1) obj;
                td1Var.getClass();
                td1.a(td1Var, "type", o2a.b);
                td1.a(td1Var, "value", od9.b("kotlinx.serialization.Sealed<" + c89Var.a.c() + '>', pd9.a.a, new SerialDescriptor[0], new oh4() { // from class: b89
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj3) {
                        td1 td1Var2 = (td1) obj3;
                        td1Var2.getClass();
                        for (Map.Entry entry : c89Var.e.entrySet()) {
                            td1.a(td1Var2, (String) entry.getKey(), ((KSerializer) entry.getValue()).getDescriptor());
                        }
                        return g2b.a;
                    }
                }));
                List<? extends Annotation> list = c89Var.b;
                list.getClass();
                td1Var.b = list;
                return g2b.a;
        }
    }
}
