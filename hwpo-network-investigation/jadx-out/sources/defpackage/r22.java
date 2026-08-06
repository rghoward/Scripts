package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import androidx.fragment.app.l;
import com.hwpo_training_app.R;
import io.intercom.android.sdk.m5.conversation.ConversationViewModel;
import io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.ComposerInputType;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r22 implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ r22(int i, Object obj) {
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
                return ConversationScreenKt.ConversationScreen$lambda$56$lambda$55((ConversationViewModel) obj2, (ComposerInputType) obj);
            default:
                o8b o8bVar = (o8b) obj2;
                gm3 gm3Var = (gm3) obj;
                o8b.a aVar = o8b.Companion;
                gm3Var.getClass();
                if (!(gm3Var instanceof f8b)) {
                    if (gm3Var instanceof i8b) {
                        o8bVar.m(((i8b) gm3Var).b);
                    } else if (gm3Var instanceof j8b) {
                        o8bVar.n(((j8b) gm3Var).b);
                    } else if (gm3Var instanceof h8b) {
                        l55.b bVar = ((h8b) gm3Var).b;
                        m55.Companion.getClass();
                        m55 m55VarA = m55.a.a(bVar);
                        l childFragmentManager = o8bVar.getChildFragmentManager();
                        childFragmentManager.getClass();
                        m55VarA.r(childFragmentManager);
                    } else if (gm3Var instanceof k8b) {
                        wj3 wj3Var = o8bVar.C;
                        l childFragmentManager2 = o8bVar.getChildFragmentManager();
                        childFragmentManager2.getClass();
                        wj3Var.s(childFragmentManager2);
                    } else if (gm3Var instanceof atb) {
                        btb.a aVar2 = btb.Companion;
                        String str = ((atb) gm3Var).b;
                        aVar2.getClass();
                        hk0.l(o8bVar, btb.a.a(str));
                    } else if ((gm3Var instanceof g8b) && (context = o8bVar.getContext()) != null) {
                        g8b g8bVar = (g8b) gm3Var;
                        File file = g8bVar.b;
                        String str2 = g8bVar.c;
                        String str3 = g8bVar.d;
                        file.getClass();
                        str2.getClass();
                        str3.getClass();
                        Intent intent = new Intent("android.intent.action.VIEW");
                        intent.setFlags(1);
                        intent.setDataAndType(FileProvider.getUriForFile(context, str3.concat(".fileprovider"), file), str2);
                        try {
                            context.startActivity(intent);
                        } catch (ActivityNotFoundException unused) {
                            o8b.a aVar3 = o8b.Companion;
                            Toast.makeText(o8bVar.requireContext(), o8bVar.getResources().getString(R.string.file_can_not_be_open), 0).show();
                            g2b g2bVar = g2b.a;
                        }
                    }
                    break;
                } else {
                    o8bVar.q().b.d(null, false);
                }
                return g2b.a;
        }
    }
}
