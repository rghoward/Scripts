package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import com.hwpo_training_app.R;
import java.io.File;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class s1 implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ s1(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        Context context;
        int i = this.t;
        Object obj2 = this.u;
        switch (i) {
            case 0:
                t1 t1Var = (t1) obj2;
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                StringBuilder sb = new StringBuilder();
                Object key = entry.getKey();
                sb.append(key == t1Var ? "(this Map)" : String.valueOf(key));
                sb.append('=');
                Object value = entry.getValue();
                sb.append(value != t1Var ? String.valueOf(value) : "(this Map)");
                return sb.toString();
            case 1:
                ((jz7.a) obj).l((jz7) obj2, 0, 0, 0.0f);
                return g2b.a;
            case 2:
                gk3 gk3Var = (gk3) obj2;
                gm3 gm3Var = (gm3) obj;
                gk3.a aVar = gk3.Companion;
                gm3Var.getClass();
                if (!(gm3Var instanceof ak3)) {
                    if (gm3Var instanceof bk3) {
                        gk3Var.m(((bk3) gm3Var).b);
                    } else if (gm3Var instanceof atb) {
                        btb.a aVar2 = btb.Companion;
                        String str = ((atb) gm3Var).b;
                        aVar2.getClass();
                        hk0.l(gk3Var, btb.a.a(str));
                    } else if ((gm3Var instanceof zj3) && (context = gk3Var.getContext()) != null) {
                        zj3 zj3Var = (zj3) gm3Var;
                        File file = zj3Var.b;
                        String str2 = zj3Var.c;
                        String str3 = zj3Var.d;
                        file.getClass();
                        str2.getClass();
                        str3.getClass();
                        Intent intent = new Intent("android.intent.action.VIEW");
                        intent.setFlags(1);
                        intent.setDataAndType(FileProvider.getUriForFile(context, str3.concat(".fileprovider"), file), str2);
                        try {
                            context.startActivity(intent);
                        } catch (ActivityNotFoundException unused) {
                            gk3.a aVar3 = gk3.Companion;
                            Toast.makeText(gk3Var.requireContext(), gk3Var.getResources().getString(R.string.file_can_not_be_open), 0).show();
                            g2b g2bVar = g2b.a;
                        }
                    }
                    break;
                } else {
                    Context context2 = gk3Var.getContext();
                    if (context2 != null) {
                        yz1.a(context2, null);
                    }
                }
                return g2b.a;
            default:
                return new dw5((ew5.a) obj2);
        }
    }
}
