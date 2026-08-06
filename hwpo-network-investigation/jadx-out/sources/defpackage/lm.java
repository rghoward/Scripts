package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.ClipDescription;
import android.content.res.Resources;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TtsSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.hwpo_training_app.R;
import com.intercom.twig.BuildConfig;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class lm extends m3 implements View.OnAttachStateChangeListener, AccessibilityManager.AccessibilityStateChangeListener, AccessibilityManager.TouchExplorationStateChangeListener {
    public static final d27 d0 = vf5.a(R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31);
    public int A;
    public int B;
    public j4 C;
    public j4 D;
    public boolean E;
    public final e27<c69> F;
    public final e27<c69> G;
    public final fx9<fx9<CharSequence>> H;
    public final fx9<s27<CharSequence>> I;
    public int J;
    public Integer K;
    public final r30<qr5> L;
    public final zx0 M;
    public boolean N;
    public d O;
    public e27 P;
    public final f27 Q;
    public final c27 R;
    public final c27 S;
    public final String T;
    public final String U;
    public final c1b V;
    public final e27<vb9> W;
    public vb9 X;
    public boolean Y;
    public final c27 Z;
    public final km a0;
    public final ArrayList b0;
    public final h c0;
    public final cm t;
    public int u = Integer.MIN_VALUE;
    public final g v = new g();
    public final AccessibilityManager w;
    public long x;
    public List<? extends AccessibilityServiceInfo> y;
    public final c z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b {
        public static final void a(j4 j4Var, ub9 ub9Var) {
            lb9 lb9Var = ub9Var.d;
            c37<gc9<?>, Object> c37Var = lb9Var.t;
            Object objD = lb9Var.t.d(ac9.z);
            if (objD == null) {
                objD = null;
            }
            ex8 ex8Var = (ex8) objD;
            if (qm.a(ub9Var)) {
                if (ex8Var != null && ex8Var.a == 8) {
                    return;
                }
                Object objD2 = c37Var.d(kb9.y);
                if (objD2 == null) {
                    objD2 = null;
                }
                k3 k3Var = (k3) objD2;
                if (k3Var != null) {
                    j4Var.b(new j4.a(android.R.id.accessibilityActionPageUp, k3Var.a));
                }
                Object objD3 = c37Var.d(kb9.A);
                if (objD3 == null) {
                    objD3 = null;
                }
                k3 k3Var2 = (k3) objD3;
                if (k3Var2 != null) {
                    j4Var.b(new j4.a(android.R.id.accessibilityActionPageDown, k3Var2.a));
                }
                Object objD4 = c37Var.d(kb9.z);
                if (objD4 == null) {
                    objD4 = null;
                }
                k3 k3Var3 = (k3) objD4;
                if (k3Var3 != null) {
                    j4Var.b(new j4.a(android.R.id.accessibilityActionPageLeft, k3Var3.a));
                }
                Object objD5 = c37Var.d(kb9.B);
                k3 k3Var4 = (k3) (objD5 != null ? objD5 : null);
                if (k3Var4 != null) {
                    j4Var.b(new j4.a(android.R.id.accessibilityActionPageRight, k3Var4.a));
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class c extends k4 {
        public c() {
        }

        @Override // defpackage.k4
        public final void a(int i, j4 j4Var, String str, Bundle bundle) {
            lm.this.a(i, j4Var, str, bundle);
        }

        /* JADX WARN: Code duplicated, block: B:102:0x0214  */
        /* JADX WARN: Code duplicated, block: B:107:0x0229  */
        /* JADX WARN: Code duplicated, block: B:108:0x0233  */
        /* JADX WARN: Code duplicated, block: B:111:0x0242  */
        /* JADX WARN: Code duplicated, block: B:113:0x0260  */
        /* JADX WARN: Code duplicated, block: B:115:0x0269  */
        /* JADX WARN: Code duplicated, block: B:118:0x02b6  */
        /* JADX WARN: Code duplicated, block: B:120:0x02ba  */
        /* JADX WARN: Code duplicated, block: B:121:0x02c0  */
        /* JADX WARN: Code duplicated, block: B:127:0x02df A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:128:0x02e1  */
        /* JADX WARN: Code duplicated, block: B:129:0x02e4  */
        /* JADX WARN: Code duplicated, block: B:131:0x02e8  */
        /* JADX WARN: Code duplicated, block: B:132:0x02eb  */
        /* JADX WARN: Code duplicated, block: B:135:0x02fc  */
        /* JADX WARN: Code duplicated, block: B:137:0x0302  */
        /* JADX WARN: Code duplicated, block: B:140:0x030e  */
        /* JADX WARN: Code duplicated, block: B:142:0x0318  */
        /* JADX WARN: Code duplicated, block: B:145:0x0329  */
        /* JADX WARN: Code duplicated, block: B:148:0x035e  */
        /* JADX WARN: Code duplicated, block: B:151:0x0369  */
        /* JADX WARN: Code duplicated, block: B:153:0x0379  */
        /* JADX WARN: Code duplicated, block: B:159:0x0397  */
        /* JADX WARN: Code duplicated, block: B:162:0x039f  */
        /* JADX WARN: Code duplicated, block: B:164:0x03b1 A[LOOP:3: B:161:0x039d->B:164:0x03b1, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:169:0x03d0  */
        /* JADX WARN: Code duplicated, block: B:171:0x03e0  */
        /* JADX WARN: Code duplicated, block: B:179:0x0405  */
        /* JADX WARN: Code duplicated, block: B:181:0x041b  */
        /* JADX WARN: Code duplicated, block: B:185:0x043e  */
        /* JADX WARN: Code duplicated, block: B:187:0x044c  */
        /* JADX WARN: Code duplicated, block: B:195:0x047e  */
        /* JADX WARN: Code duplicated, block: B:197:0x0486  */
        /* JADX WARN: Code duplicated, block: B:199:0x0496  */
        /* JADX WARN: Code duplicated, block: B:202:0x04a4  */
        /* JADX WARN: Code duplicated, block: B:205:0x04c6  */
        /* JADX WARN: Code duplicated, block: B:207:0x04d2  */
        /* JADX WARN: Code duplicated, block: B:210:0x04e0  */
        /* JADX WARN: Code duplicated, block: B:213:0x04ef  */
        /* JADX WARN: Code duplicated, block: B:214:0x04f3  */
        /* JADX WARN: Code duplicated, block: B:217:0x050b  */
        /* JADX WARN: Code duplicated, block: B:220:0x0511  */
        /* JADX WARN: Code duplicated, block: B:222:0x0515  */
        /* JADX WARN: Code duplicated, block: B:223:0x051a  */
        /* JADX WARN: Code duplicated, block: B:225:0x051e  */
        /* JADX WARN: Code duplicated, block: B:229:0x052c  */
        /* JADX WARN: Code duplicated, block: B:232:0x0532  */
        /* JADX WARN: Code duplicated, block: B:234:0x0538  */
        /* JADX WARN: Code duplicated, block: B:235:0x053c  */
        /* JADX WARN: Code duplicated, block: B:237:0x0543  */
        /* JADX WARN: Code duplicated, block: B:241:0x054f  */
        /* JADX WARN: Code duplicated, block: B:246:0x0561  */
        /* JADX WARN: Code duplicated, block: B:248:0x0569  */
        /* JADX WARN: Code duplicated, block: B:251:0x056f  */
        /* JADX WARN: Code duplicated, block: B:252:0x0576  */
        /* JADX WARN: Code duplicated, block: B:256:0x0583  */
        /* JADX WARN: Code duplicated, block: B:259:0x0589  */
        /* JADX WARN: Code duplicated, block: B:25:0x0080  */
        /* JADX WARN: Code duplicated, block: B:261:0x058c  */
        /* JADX WARN: Code duplicated, block: B:264:0x05a3 A[LOOP:7: B:260:0x058a->B:264:0x05a3, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:267:0x05ab  */
        /* JADX WARN: Code duplicated, block: B:270:0x05b6  */
        /* JADX WARN: Code duplicated, block: B:273:0x05bc  */
        /* JADX WARN: Code duplicated, block: B:276:0x05ca  */
        /* JADX WARN: Code duplicated, block: B:279:0x05d0  */
        /* JADX WARN: Code duplicated, block: B:27:0x008d  */
        /* JADX WARN: Code duplicated, block: B:282:0x05da  */
        /* JADX WARN: Code duplicated, block: B:284:0x05e4  */
        /* JADX WARN: Code duplicated, block: B:285:0x05ea  */
        /* JADX WARN: Code duplicated, block: B:288:0x0602  */
        /* JADX WARN: Code duplicated, block: B:28:0x0093  */
        /* JADX WARN: Code duplicated, block: B:291:0x0615  */
        /* JADX WARN: Code duplicated, block: B:294:0x061b  */
        /* JADX WARN: Code duplicated, block: B:295:0x0620  */
        /* JADX WARN: Code duplicated, block: B:298:0x063a  */
        /* JADX WARN: Code duplicated, block: B:300:0x064d  */
        /* JADX WARN: Code duplicated, block: B:302:0x0657  */
        /* JADX WARN: Code duplicated, block: B:303:0x065f  */
        /* JADX WARN: Code duplicated, block: B:306:0x0671  */
        /* JADX WARN: Code duplicated, block: B:307:0x0679  */
        /* JADX WARN: Code duplicated, block: B:310:0x0684  */
        /* JADX WARN: Code duplicated, block: B:313:0x0690  */
        /* JADX WARN: Code duplicated, block: B:316:0x0696  */
        /* JADX WARN: Code duplicated, block: B:318:0x069a  */
        /* JADX WARN: Code duplicated, block: B:319:0x069c  */
        /* JADX WARN: Code duplicated, block: B:31:0x009d  */
        /* JADX WARN: Code duplicated, block: B:324:0x06b0  */
        /* JADX WARN: Code duplicated, block: B:327:0x06b6  */
        /* JADX WARN: Code duplicated, block: B:329:0x06be  */
        /* JADX WARN: Code duplicated, block: B:333:0x06c7  */
        /* JADX WARN: Code duplicated, block: B:336:0x06cd A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:33:0x00a7  */
        /* JADX WARN: Code duplicated, block: B:343:0x06da A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:347:0x06e1  */
        /* JADX WARN: Code duplicated, block: B:34:0x00ab  */
        /* JADX WARN: Code duplicated, block: B:350:0x06eb  */
        /* JADX WARN: Code duplicated, block: B:356:0x070b  */
        /* JADX WARN: Code duplicated, block: B:359:0x0711  */
        /* JADX WARN: Code duplicated, block: B:361:0x071b  */
        /* JADX WARN: Code duplicated, block: B:365:0x0731  */
        /* JADX WARN: Code duplicated, block: B:368:0x0737  */
        /* JADX WARN: Code duplicated, block: B:36:0x00b3  */
        /* JADX WARN: Code duplicated, block: B:371:0x074b  */
        /* JADX WARN: Code duplicated, block: B:373:0x0755  */
        /* JADX WARN: Code duplicated, block: B:376:0x076d  */
        /* JADX WARN: Code duplicated, block: B:379:0x0786  */
        /* JADX WARN: Code duplicated, block: B:382:0x079e  */
        /* JADX WARN: Code duplicated, block: B:384:0x07a4  */
        /* JADX WARN: Code duplicated, block: B:386:0x07b2  */
        /* JADX WARN: Code duplicated, block: B:387:0x07b9  */
        /* JADX WARN: Code duplicated, block: B:389:0x07bc  */
        /* JADX WARN: Code duplicated, block: B:38:0x00bb  */
        /* JADX WARN: Code duplicated, block: B:393:0x07d1  */
        /* JADX WARN: Code duplicated, block: B:398:0x07f0  */
        /* JADX WARN: Code duplicated, block: B:399:0x07f3  */
        /* JADX WARN: Code duplicated, block: B:39:0x00c2  */
        /* JADX WARN: Code duplicated, block: B:402:0x0816  */
        /* JADX WARN: Code duplicated, block: B:404:0x081c  */
        /* JADX WARN: Code duplicated, block: B:408:0x0830  */
        /* JADX WARN: Code duplicated, block: B:410:0x083c  */
        /* JADX WARN: Code duplicated, block: B:414:0x0847  */
        /* JADX WARN: Code duplicated, block: B:416:0x084f  */
        /* JADX WARN: Code duplicated, block: B:418:0x0855  */
        /* JADX WARN: Code duplicated, block: B:41:0x00c6  */
        /* JADX WARN: Code duplicated, block: B:426:0x086e  */
        /* JADX WARN: Code duplicated, block: B:428:0x0874  */
        /* JADX WARN: Code duplicated, block: B:430:0x087e  */
        /* JADX WARN: Code duplicated, block: B:432:0x0887  */
        /* JADX WARN: Code duplicated, block: B:434:0x088a  */
        /* JADX WARN: Code duplicated, block: B:437:0x088f  */
        /* JADX WARN: Code duplicated, block: B:43:0x00d6  */
        /* JADX WARN: Code duplicated, block: B:440:0x089e  */
        /* JADX WARN: Code duplicated, block: B:442:0x08ae  */
        /* JADX WARN: Code duplicated, block: B:450:0x08ca  */
        /* JADX WARN: Code duplicated, block: B:453:0x08d7  */
        /* JADX WARN: Code duplicated, block: B:457:0x08f8  */
        /* JADX WARN: Code duplicated, block: B:459:0x0904  */
        /* JADX WARN: Code duplicated, block: B:460:0x090a  */
        /* JADX WARN: Code duplicated, block: B:463:0x0913  */
        /* JADX WARN: Code duplicated, block: B:466:0x0930  */
        /* JADX WARN: Code duplicated, block: B:470:0x0946  */
        /* JADX WARN: Code duplicated, block: B:473:0x094b  */
        /* JADX WARN: Code duplicated, block: B:476:0x0960  */
        /* JADX WARN: Code duplicated, block: B:479:0x0965  */
        /* JADX WARN: Code duplicated, block: B:47:0x0109  */
        /* JADX WARN: Code duplicated, block: B:482:0x0970  */
        /* JADX WARN: Code duplicated, block: B:484:0x097c  */
        /* JADX WARN: Code duplicated, block: B:487:0x0982  */
        /* JADX WARN: Code duplicated, block: B:490:0x099d  */
        /* JADX WARN: Code duplicated, block: B:493:0x09a3  */
        /* JADX WARN: Code duplicated, block: B:494:0x09b0  */
        /* JADX WARN: Code duplicated, block: B:496:0x09c3  */
        /* JADX WARN: Code duplicated, block: B:498:0x09c7  */
        /* JADX WARN: Code duplicated, block: B:500:0x09d3  */
        /* JADX WARN: Code duplicated, block: B:502:0x09e7  */
        /* JADX WARN: Code duplicated, block: B:506:0x09f3  */
        /* JADX WARN: Code duplicated, block: B:508:0x09f9  */
        /* JADX WARN: Code duplicated, block: B:509:0x09fb  */
        /* JADX WARN: Code duplicated, block: B:50:0x0116  */
        /* JADX WARN: Code duplicated, block: B:511:0x0a01  */
        /* JADX WARN: Code duplicated, block: B:513:0x0a07  */
        /* JADX WARN: Code duplicated, block: B:517:0x0a25 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:520:0x0a35  */
        /* JADX WARN: Code duplicated, block: B:522:0x0a39  */
        /* JADX WARN: Code duplicated, block: B:524:0x0a47  */
        /* JADX WARN: Code duplicated, block: B:527:0x0a4c  */
        /* JADX WARN: Code duplicated, block: B:530:0x0a61  */
        /* JADX WARN: Code duplicated, block: B:533:0x0a6b  */
        /* JADX WARN: Code duplicated, block: B:535:0x0a73  */
        /* JADX WARN: Code duplicated, block: B:537:0x0a7e  */
        /* JADX WARN: Code duplicated, block: B:538:0x0a81  */
        /* JADX WARN: Code duplicated, block: B:53:0x0123  */
        /* JADX WARN: Code duplicated, block: B:540:0x0a87  */
        /* JADX WARN: Code duplicated, block: B:543:0x0a8f  */
        /* JADX WARN: Code duplicated, block: B:545:0x0a98  */
        /* JADX WARN: Code duplicated, block: B:546:0x0a9b  */
        /* JADX WARN: Code duplicated, block: B:550:0x0aae A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:553:0x0abe  */
        /* JADX WARN: Code duplicated, block: B:555:0x0ac2  */
        /* JADX WARN: Code duplicated, block: B:557:0x0ad0  */
        /* JADX WARN: Code duplicated, block: B:560:0x0ad5  */
        /* JADX WARN: Code duplicated, block: B:563:0x0aea  */
        /* JADX WARN: Code duplicated, block: B:566:0x0af4  */
        /* JADX WARN: Code duplicated, block: B:568:0x0afa  */
        /* JADX WARN: Code duplicated, block: B:56:0x012b  */
        /* JADX WARN: Code duplicated, block: B:571:0x0b0a  */
        /* JADX WARN: Code duplicated, block: B:574:0x0b1a  */
        /* JADX WARN: Code duplicated, block: B:577:0x0b32  */
        /* JADX WARN: Code duplicated, block: B:579:0x0b40  */
        /* JADX WARN: Code duplicated, block: B:582:0x0b5c  */
        /* JADX WARN: Code duplicated, block: B:585:0x0b78  */
        /* JADX WARN: Code duplicated, block: B:588:0x0b96  */
        /* JADX WARN: Code duplicated, block: B:58:0x0133  */
        /* JADX WARN: Code duplicated, block: B:590:0x0baa  */
        /* JADX WARN: Code duplicated, block: B:592:0x0bbc  */
        /* JADX WARN: Code duplicated, block: B:594:0x0bce A[LOOP:9: B:593:0x0bcc->B:594:0x0bce, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:597:0x0be3  */
        /* JADX WARN: Code duplicated, block: B:599:0x0bf9  */
        /* JADX WARN: Code duplicated, block: B:600:0x0c13  */
        /* JADX WARN: Code duplicated, block: B:604:0x0c28 A[LOOP:11: B:603:0x0c26->B:604:0x0c28, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:605:0x0c47  */
        /* JADX WARN: Code duplicated, block: B:607:0x0c4e A[LOOP:12: B:606:0x0c4c->B:607:0x0c4e, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:609:0x0c76  */
        /* JADX WARN: Code duplicated, block: B:614:0x0c9a  */
        /* JADX WARN: Code duplicated, block: B:616:0x0ca4  */
        /* JADX WARN: Code duplicated, block: B:617:0x0caa  */
        /* JADX WARN: Code duplicated, block: B:619:0x0cb6  */
        /* JADX WARN: Code duplicated, block: B:61:0x0143  */
        /* JADX WARN: Code duplicated, block: B:622:0x0cc2  */
        /* JADX WARN: Code duplicated, block: B:627:0x0ce2  */
        /* JADX WARN: Code duplicated, block: B:638:0x0cf9  */
        /* JADX WARN: Code duplicated, block: B:641:0x021c A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:642:0x021c A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:645:0x0335 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:64:0x014c  */
        /* JADX WARN: Code duplicated, block: B:651:0x03c6 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:658:0x0425 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:65:0x015b  */
        /* JADX WARN: Code duplicated, block: B:663:0x05a8 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:664:0x0598 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:666:0x086a A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:667:0x0865 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:678:0x09ea A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:67:0x015e  */
        /* JADX WARN: Code duplicated, block: B:68:0x016d  */
        /* JADX WARN: Code duplicated, block: B:74:0x017e  */
        /* JADX WARN: Code duplicated, block: B:76:0x0184  */
        /* JADX WARN: Code duplicated, block: B:79:0x019e  */
        /* JADX WARN: Code duplicated, block: B:7:0x0031  */
        /* JADX WARN: Code duplicated, block: B:81:0x01a4  */
        /* JADX WARN: Code duplicated, block: B:84:0x01b4  */
        /* JADX WARN: Code duplicated, block: B:86:0x01ce  */
        /* JADX WARN: Code duplicated, block: B:89:0x01e2 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:90:0x01e4  */
        /* JADX WARN: Code duplicated, block: B:91:0x01e8  */
        /* JADX WARN: Code duplicated, block: B:99:0x020f  */
        /* JADX WARN: Instruction removed from duplicated block: B:638:0x0cf9, please report this as an issue */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v29 */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.CharSequence] */
        /* JADX WARN: Type inference failed for: r10v27 */
        /* JADX WARN: Type inference failed for: r10v28, types: [lm] */
        /* JADX WARN: Type inference failed for: r10v29 */
        /* JADX WARN: Type inference failed for: r10v30 */
        /* JADX WARN: Type inference failed for: r10v32 */
        /* JADX WARN: Type inference failed for: r10v4, types: [lm] */
        /* JADX WARN: Type inference failed for: r10v6 */
        /* JADX WARN: Type inference failed for: r13v12, types: [java.lang.Object, java.lang.String, qr5] */
        /* JADX WARN: Type inference failed for: r1v18 */
        /* JADX WARN: Type inference failed for: r1v7 */
        /* JADX WARN: Type inference failed for: r1v8, types: [j4] */
        /* JADX WARN: Type inference failed for: r2v101, types: [hf3] */
        /* JADX WARN: Type inference failed for: r2v102, types: [java.util.Collection, java.util.List] */
        /* JADX WARN: Type inference failed for: r2v104, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r3v15, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r3v2 */
        /* JADX WARN: Type inference failed for: r3v22 */
        /* JADX WARN: Type inference failed for: r3v3, types: [android.view.accessibility.AccessibilityNodeInfo] */
        /* JADX WARN: Type inference failed for: r3v5 */
        /* JADX WARN: Type inference failed for: r3v6, types: [java.util.Collection, java.util.List] */
        /* JADX WARN: Type inference failed for: r6v101, types: [qr5] */
        /* JADX WARN: Type inference failed for: r6v102 */
        /* JADX WARN: Type inference failed for: r6v103, types: [qr5] */
        /* JADX WARN: Type inference failed for: r6v211 */
        /* JADX WARN: Type inference failed for: r6v212 */
        /* JADX WARN: Type inference failed for: r6v213 */
        /* JADX WARN: Type inference failed for: r6v86 */
        /* JADX WARN: Type inference failed for: r6v87, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r7v10 */
        /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.CharSequence] */
        /* JADX WARN: Type inference failed for: r7v62 */
        /* JADX WARN: Type inference failed for: r8v134 */
        /* JADX WARN: Type inference failed for: r8v137, types: [j4] */
        /* JADX WARN: Type inference failed for: r8v142 */
        /* JADX WARN: Type inference failed for: r8v35 */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // defpackage.k4
        public final j4 b(int i) {
            AccessibilityNodeInfo accessibilityNodeInfoObtain;
            j4 j4Var;
            int i2;
            j4 j4Var2;
            ub9 ub9VarL;
            Integer numValueOf;
            int iIntValue;
            d27 d27Var;
            c27 c27Var;
            fx9<s27<CharSequence>> fx9Var;
            Resources resources;
            lb9 lb9Var;
            c37<gc9<?>, Object> c37Var;
            Object objD;
            ex8 ex8Var;
            d27 d27Var2;
            fx9<s27<CharSequence>> fx9Var2;
            boolean zA;
            List listJ;
            int size;
            boolean z;
            int i3;
            int i4;
            int i5;
            AccessibilityNodeInfo accessibilityNodeInfo;
            iw iwVarE;
            lb9 lb9Var2;
            ex8 ex8Var2;
            AccessibilityNodeInfo accessibilityNodeInfo2;
            ub9 ub9Var;
            Resources resources2;
            AccessibilityNodeInfo accessibilityNodeInfo3;
            ?? r0;
            ?? r1;
            gc9<String> gc9Var;
            ?? r3;
            AccessibilityNodeInfo accessibilityNodeInfo4;
            ub9 ub9Var2;
            String strD;
            Object objD2;
            fqa fqaVar;
            Object objD3;
            Boolean bool;
            ex8 ex8Var3;
            int i6;
            lb9 lb9Var3;
            Object objD4;
            List list;
            ?? r7;
            Object objD5;
            String str;
            Object objD6;
            Object objD7;
            int i7;
            Object objD8;
            Boolean bool2;
            Object objD9;
            Integer num;
            int iIntValue2;
            gc9<Boolean> gc9Var2;
            lm lmVar;
            int i8;
            boolean z2;
            ?? r10;
            ub9 ub9VarL2;
            Object objD10;
            nb6 nb6Var;
            Object objD11;
            k3 k3Var;
            Object objD12;
            k3 k3Var2;
            Object objD13;
            k3 k3Var3;
            String strK;
            ud8 ud8Var;
            Object objD14;
            ah1 ah1Var;
            ArrayList arrayList;
            Object objD15;
            boolean zA2;
            int size2;
            int size3;
            List listJ2;
            int size4;
            int i9;
            ub9 ub9Var3;
            c69 c69Var;
            c69 c69Var2;
            int iD;
            cm cmVar;
            Bundle bundle;
            int iD2;
            String str2;
            ?? r8;
            bt btVarB;
            bt btVarB2;
            k3 k3Var4;
            k3 k3Var5;
            k3 k3Var6;
            lb9 lb9VarN;
            gc9<List<dd2>> gc9Var3;
            List list2;
            d27 d27Var3;
            fx9 fx9Var3;
            s27<CharSequence> s27VarA;
            fx9<s27<CharSequence>> fx9Var4;
            int size5;
            int i10;
            s27<CharSequence> s27VarC;
            d27 d27Var4;
            int[] iArr;
            int i11;
            int i12;
            ArrayList arrayList2;
            int size6;
            int i13;
            int size7;
            int i14;
            dd2 dd2Var;
            ?? r13;
            Object objD16;
            Object objD17;
            Object objD18;
            boolean zQ;
            tq5 tq5Var;
            qr5 qr5Var;
            j4.a aVar;
            j4.a aVar2;
            Object objD19;
            Object objD20;
            k3 k3Var7;
            float f;
            gg1 gg1Var;
            gc9<k3<oh4<Float, Boolean>>> gc9Var4;
            float fFloatValue;
            float fFloatValue2;
            float fFloatValue3;
            float fFloatValue4;
            ArrayList arrayList3;
            CharSequence charSequenceF;
            k3 k3Var8;
            ?? r6;
            List list3;
            ?? I;
            lb9 lb9VarR;
            boolean zA3;
            Object objD21;
            lb9 lb9VarR2;
            boolean z3;
            Object objD22;
            k3 k3Var9;
            k3 k3Var10;
            k3 k3Var11;
            k3 k3Var12;
            ClipDescription primaryClipDescription;
            boolean zHasMimeType;
            Object objD23;
            boolean z4;
            boolean z5;
            int i15;
            int iD3;
            ub9 ub9VarL3;
            boolean zBooleanValue;
            lb9 lb9Var4;
            gc9<Boolean> gc9Var5;
            boolean zBooleanValue2;
            Object objD24;
            tx2 density;
            c1b c1bVar;
            SpannableString spannableString;
            List<iw.c<? extends iw.a>> list4;
            ArrayList arrayList4;
            SpannableString spannableString2;
            ?? arrayList5;
            ?? arrayList6;
            int size8;
            int i16;
            int size9;
            int i17;
            List listA;
            int size10;
            int i18;
            iw.c<l86> cVar;
            int i19;
            l86 l86Var;
            int i20;
            l86 l86Var2;
            WeakHashMap<iw.c<l86>, gs1> weakHashMap;
            gs1 gs1Var;
            c5b c5bVar;
            WeakHashMap<c5b, URLSpan> weakHashMap2;
            URLSpan uRLSpan;
            int size11;
            int i21;
            iw.c<? extends iw.a> cVar2;
            vya vyaVar;
            int i22;
            int i23;
            int size12;
            int i24;
            iw.c<? extends iw.a> cVar3;
            int size13;
            int i25;
            int i26;
            int i27;
            long jC;
            ob4 ob4Var;
            mb4 mb4Var;
            oha ohaVar;
            long j;
            fda fdaVar;
            mha ui1Var;
            SpannableString spannableString3;
            ob4 ob4Var2;
            int i28;
            int i29;
            int i30;
            ub9 ub9Var4;
            zf5<xb9> zf5VarJ;
            int i31;
            bt btVar;
            xb9 xb9VarB;
            boolean zA4;
            ub9 ub9Var5;
            int i32;
            int i33;
            String strC;
            Object parentForAccessibility;
            View view;
            ?? r11;
            j4 j4Var3;
            Float fValueOf = Float.valueOf(0.0f);
            lm lmVar2 = lm.this;
            AccessibilityManager accessibilityManager = lmVar2.w;
            cm cmVar2 = lmVar2.t;
            if (cmVar2.getComposeViewContext().c.getLifecycle().b() == s66.b.t) {
                if (accessibilityManager.isEnabled()) {
                    j4Var3 = null;
                } else {
                    j4Var3 = new j4(AccessibilityNodeInfo.obtain());
                }
                i7 = i;
                r11 = lmVar2;
                r8 = j4Var3;
            } else {
                xb9 xb9VarB2 = lmVar2.j().b(i);
                if (xb9VarB2 == null) {
                    if (accessibilityManager.isEnabled()) {
                        j4Var3 = null;
                    } else {
                        j4Var3 = new j4(AccessibilityNodeInfo.obtain());
                    }
                    i7 = i;
                    r11 = lmVar2;
                    r8 = j4Var3;
                } else {
                    ub9 ub9Var6 = xb9VarB2.a;
                    lb9 lb9VarK = ub9Var6.k();
                    qr5 qr5Var2 = ub9Var6.c;
                    Object objD25 = lb9VarK.t.d(ac9.o);
                    if (objD25 == null) {
                        objD25 = null;
                    }
                    boolean zA5 = xj5.a(objD25, Boolean.TRUE);
                    if (!zA5) {
                        accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
                        j4Var = new j4(accessibilityNodeInfoObtain);
                        i2 = Build.VERSION.SDK_INT;
                        if (i2 >= 34) {
                            j4.d.e(accessibilityNodeInfoObtain, zA5);
                        } else {
                            j4Var.i(64, zA5);
                        }
                        if (i == -1) {
                            parentForAccessibility = cmVar2.getParentForAccessibility();
                            j4Var2 = null;
                            if (parentForAccessibility instanceof View) {
                                view = (View) parentForAccessibility;
                            } else {
                                view = null;
                            }
                            j4Var.b = -1;
                            accessibilityNodeInfoObtain.setParent(view);
                        } else {
                            j4Var2 = null;
                            ub9VarL = ub9Var6.l();
                            if (ub9VarL != null) {
                                numValueOf = Integer.valueOf(ub9VarL.f);
                            } else {
                                numValueOf = null;
                            }
                            if (numValueOf != null) {
                                uc5.c("semanticsNode " + i + " has null parent");
                                fl.a();
                                return null;
                            }
                            iIntValue = numValueOf.intValue();
                            if (iIntValue == cmVar2.getSemanticsOwner().a().f) {
                                iIntValue = -1;
                            }
                            j4Var.b = iIntValue;
                            accessibilityNodeInfoObtain.setParent(cmVar2, iIntValue);
                        }
                        j4Var.c = i;
                        accessibilityNodeInfoObtain.setSource(cmVar2, i);
                        accessibilityNodeInfoObtain.setBoundsInScreen(lmVar2.b(xb9VarB2));
                        d27Var = lm.d0;
                        c27Var = lmVar2.Z;
                        fx9Var = lmVar2.I;
                        resources = cmVar2.getContext().getResources();
                        j4Var.j("android.view.View");
                        lb9Var = ub9Var6.d;
                        c37Var = lb9Var.t;
                        if (c37Var.b(ac9.G)) {
                            j4Var.j("android.widget.EditText");
                        }
                        if (c37Var.b(ac9.C)) {
                            j4Var.j("android.widget.TextView");
                        }
                        objD = c37Var.d(ac9.z);
                        if (objD == null) {
                            objD = j4Var2;
                        }
                        ex8Var = (ex8) objD;
                        if (ex8Var != null) {
                            i32 = ex8Var.a;
                            if (ub9Var6.o()) {
                                fx9Var2 = fx9Var;
                                i33 = 4;
                                d27Var2 = d27Var;
                                if (ub9.j(4, ub9Var6).isEmpty()) {
                                }
                                g2b g2bVar = g2b.a;
                            } else {
                                fx9Var2 = fx9Var;
                                i33 = 4;
                                d27Var2 = d27Var;
                            }
                            if (i32 == i33) {
                                accessibilityNodeInfoObtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources.getString(R.string.tab));
                            } else if (i32 == 2) {
                                accessibilityNodeInfoObtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources.getString(R.string.switch_role));
                            } else {
                                strC = kc9.c(i32);
                                if (i32 == 5 || ub9Var6.q() || lb9Var.v) {
                                    j4Var.j(strC);
                                }
                            }
                            g2b g2bVar2 = g2b.a;
                        } else {
                            d27Var2 = d27Var;
                            fx9Var2 = fx9Var;
                        }
                        accessibilityNodeInfoObtain.setPackageName(cmVar2.getContext().getPackageName());
                        accessibilityNodeInfoObtain.setImportantForAccessibility(zb9.h(ub9Var6));
                        if (i2 >= 34) {
                            zA = v3.a(accessibilityManager);
                        } else {
                            zA = true;
                        }
                        listJ = ub9.j(4, ub9Var6);
                        size = listJ.size();
                        z = zA;
                        i3 = 0;
                        i4 = 0;
                        while (i4 < size) {
                            List list5 = listJ;
                            ub9Var4 = (ub9) listJ.get(i4);
                            int i34 = size;
                            zf5VarJ = lmVar2.j();
                            int i35 = i4;
                            i31 = ub9Var4.f;
                            if (zf5VarJ.a(i31)) {
                                btVar = cmVar2.getAndroidViewsHandler$ui().getLayoutNodeToHolder().get(ub9Var4.c);
                                if (i31 != -1) {
                                    if (btVar != null) {
                                        accessibilityNodeInfoObtain.addChild(btVar);
                                    } else {
                                        xb9VarB = lmVar2.j().b(i31);
                                        if (xb9VarB != null || (ub9Var5 = xb9VarB.a) == null) {
                                            zA4 = false;
                                        } else {
                                            Object objD26 = ub9Var5.k().t.d(ac9.o);
                                            if (objD26 == null) {
                                                objD26 = j4Var2;
                                            }
                                            zA4 = xj5.a(objD26, Boolean.TRUE);
                                        }
                                        if (z || !zA4) {
                                            accessibilityNodeInfoObtain.addChild(cmVar2, i31);
                                        }
                                    }
                                    c27Var.f(i31, i3);
                                    i3++;
                                }
                            }
                            i4 = i35 + 1;
                            size = i34;
                            listJ = list5;
                        }
                        i5 = lmVar2.A;
                        accessibilityNodeInfo = j4Var.a;
                        if (i == i5) {
                            accessibilityNodeInfo.setAccessibilityFocused(true);
                            j4Var.b(j4.a.h);
                        } else {
                            accessibilityNodeInfo.setAccessibilityFocused(false);
                            j4Var.b(j4.a.g);
                        }
                        iwVarE = qm.e(ub9Var6);
                        if (iwVarE != null) {
                            cmVar2.getFontFamilyResolver();
                            density = cmVar2.getDensity();
                            c1bVar = lmVar2.V;
                            String str3 = iwVarE.u;
                            list4 = iwVarE.t;
                            spannableString = new SpannableString(str3);
                            arrayList4 = iwVarE.v;
                            if (arrayList4 != null) {
                                size13 = arrayList4.size();
                                i25 = 0;
                                while (i25 < size13) {
                                    int i36 = size13;
                                    iw.c cVar4 = (iw.c) arrayList4.get(i25);
                                    ArrayList arrayList7 = arrayList4;
                                    ww9 ww9Var = (ww9) cVar4.a;
                                    int i37 = i25;
                                    i26 = cVar4.b;
                                    i27 = cVar4.c;
                                    lb9 lb9Var5 = lb9Var;
                                    jC = ww9Var.a.c();
                                    AccessibilityNodeInfo accessibilityNodeInfo5 = accessibilityNodeInfo;
                                    ub9 ub9Var7 = ub9Var6;
                                    long j2 = ww9Var.b;
                                    ob4Var = ww9Var.c;
                                    mb4Var = ww9Var.d;
                                    ohaVar = ww9Var.j;
                                    ex8 ex8Var4 = ex8Var;
                                    ad6 ad6Var = ww9Var.k;
                                    Resources resources3 = resources;
                                    AccessibilityNodeInfo accessibilityNodeInfo6 = accessibilityNodeInfoObtain;
                                    j = ww9Var.l;
                                    fdaVar = ww9Var.m;
                                    ui1Var = ww9Var.a;
                                    j4 j4Var4 = j4Var;
                                    if (!uh1.c(jC, ui1Var.c())) {
                                        if (jC != 16) {
                                            ui1Var = new ui1(jC);
                                        } else {
                                            ui1Var = mha.a.a;
                                        }
                                    }
                                    bx9.c(spannableString, ui1Var.c(), i26, i27);
                                    spannableString3 = spannableString;
                                    bx9.d(spannableString3, j2, density, i26, i27);
                                    if (ob4Var == null || mb4Var != null) {
                                        if (ob4Var == null) {
                                            ob4Var2 = ob4.y;
                                        } else {
                                            ob4Var2 = ob4Var;
                                        }
                                        if (mb4Var != null) {
                                            i28 = mb4Var.a;
                                        } else {
                                            i28 = 0;
                                        }
                                        StyleSpan styleSpan = new StyleSpan(lo.c(ob4Var2, i28));
                                        i29 = 33;
                                        spannableString3.setSpan(styleSpan, i26, i27, 33);
                                    } else {
                                        i29 = 33;
                                    }
                                    if (fdaVar != null) {
                                        i30 = fdaVar.a;
                                        if ((i30 | 1) == i30) {
                                            spannableString3.setSpan(new UnderlineSpan(), i26, i27, i29);
                                        }
                                        if ((i30 | 2) == i30) {
                                            spannableString3.setSpan(new StrikethroughSpan(), i26, i27, i29);
                                        }
                                    }
                                    if (ohaVar != null) {
                                        spannableString3.setSpan(new ScaleXSpan(ohaVar.a), i26, i27, i29);
                                    }
                                    bx9.e(spannableString3, ad6Var, i26, i27);
                                    if (j != 16) {
                                        spannableString3.setSpan(new BackgroundColorSpan(u7d.l(j)), i26, i27, i29);
                                    }
                                    i25 = i37 + 1;
                                    spannableString = spannableString3;
                                    size13 = i36;
                                    arrayList4 = arrayList7;
                                    lb9Var = lb9Var5;
                                    ub9Var6 = ub9Var7;
                                    accessibilityNodeInfo = accessibilityNodeInfo5;
                                    ex8Var = ex8Var4;
                                    accessibilityNodeInfoObtain = accessibilityNodeInfo6;
                                    resources = resources3;
                                    j4Var = j4Var4;
                                }
                            }
                            lb9Var2 = lb9Var;
                            ex8Var2 = ex8Var;
                            accessibilityNodeInfo2 = accessibilityNodeInfo;
                            ub9Var = ub9Var6;
                            resources2 = resources;
                            accessibilityNodeInfo3 = accessibilityNodeInfoObtain;
                            j4 j4Var5 = j4Var;
                            spannableString2 = spannableString;
                            int length = str3.length();
                            arrayList5 = hf3.t;
                            if (list4 != null) {
                                arrayList6 = new ArrayList(list4.size());
                                size12 = list4.size();
                                while (i24 < size12) {
                                    iw.c<? extends iw.a> cVar5 = list4.get(i24);
                                    cVar3 = cVar5;
                                    if (!(cVar3.a instanceof vya) && lw.b(0, length, cVar3.b, cVar3.c)) {
                                        arrayList6.add(cVar5);
                                    }
                                }
                            } else {
                                arrayList6 = arrayList5;
                            }
                            size8 = arrayList6.size();
                            while (i16 < size8) {
                                iw.c cVar6 = (iw.c) arrayList6.get(i16);
                                vyaVar = (vya) cVar6.a;
                                i22 = cVar6.b;
                                i23 = cVar6.c;
                                if (vyaVar instanceof xdb) {
                                    u.b();
                                    return j4Var2;
                                }
                                spannableString2.setSpan(new TtsSpan.VerbatimBuilder(((xdb) vyaVar).a).build(), i22, i23, 33);
                            }
                            int length2 = str3.length();
                            if (list4 != null) {
                                arrayList5 = new ArrayList(list4.size());
                                size11 = list4.size();
                                while (i21 < size11) {
                                    iw.c<? extends iw.a> cVar7 = list4.get(i21);
                                    cVar2 = cVar7;
                                    if (!(cVar2.a instanceof c5b) && lw.b(0, length2, cVar2.b, cVar2.c)) {
                                        arrayList5.add(cVar7);
                                    }
                                }
                            }
                            size9 = arrayList5.size();
                            while (i17 < size9) {
                                iw.c cVar8 = (iw.c) arrayList5.get(i17);
                                c5bVar = (c5b) cVar8.a;
                                int i38 = cVar8.b;
                                int i39 = cVar8.c;
                                weakHashMap2 = c1bVar.a;
                                uRLSpan = weakHashMap2.get(c5bVar);
                                if (uRLSpan == null) {
                                    uRLSpan = new URLSpan(c5bVar.a);
                                    weakHashMap2.put(c5bVar, uRLSpan);
                                }
                                spannableString2.setSpan(uRLSpan, i38, i39, 33);
                            }
                            listA = iwVarE.a(str3.length());
                            size10 = listA.size();
                            while (i18 < size10) {
                                cVar = (iw.c) listA.get(i18);
                                i19 = cVar.b;
                                l86Var = cVar.a;
                                i20 = cVar.c;
                                if (i19 != i20) {
                                    l86Var2 = l86Var;
                                    if ((l86Var2 instanceof l86.b) || ((l86.b) l86Var2).c != null) {
                                        weakHashMap = c1bVar.c;
                                        gs1Var = weakHashMap.get(cVar);
                                        if (gs1Var == null) {
                                            gs1Var = new gs1(l86Var2);
                                            weakHashMap.put(cVar, gs1Var);
                                        }
                                        spannableString2.setSpan(gs1Var, i19, i20, 33);
                                    } else {
                                        l86Var.getClass();
                                        l86.b bVar = (l86.b) l86Var;
                                        iw.c<l86.b> cVar9 = new iw.c<>(i19, i20, bVar);
                                        WeakHashMap<iw.c<l86.b>, URLSpan> weakHashMap3 = c1bVar.b;
                                        URLSpan uRLSpan2 = weakHashMap3.get(cVar9);
                                        if (uRLSpan2 == null) {
                                            uRLSpan2 = new URLSpan(bVar.a);
                                            weakHashMap3.put(cVar9, uRLSpan2);
                                        }
                                        spannableString2.setSpan(uRLSpan2, i19, i20, 33);
                                    }
                                }
                            }
                            r1 = j4Var5;
                            r0 = (SpannableString) lm.G(spannableString2);
                        } else {
                            lb9Var2 = lb9Var;
                            ex8Var2 = ex8Var;
                            accessibilityNodeInfo2 = accessibilityNodeInfo;
                            ub9Var = ub9Var6;
                            c27Var = c27Var;
                            resources2 = resources;
                            accessibilityNodeInfo3 = accessibilityNodeInfoObtain;
                            r0 = j4Var2;
                            r1 = j4Var;
                        }
                        r1.s(r0);
                        gc9Var = ac9.M;
                        if (c37Var.b(gc9Var)) {
                            accessibilityNodeInfo4 = accessibilityNodeInfo3;
                            accessibilityNodeInfo4.setContentInvalid(true);
                            objD24 = c37Var.d(gc9Var);
                            if (objD24 == null) {
                                objD24 = j4Var2;
                            }
                            AccessibilityNodeInfo accessibilityNodeInfo7 = accessibilityNodeInfo2;
                            accessibilityNodeInfo7.setError((CharSequence) objD24);
                            r3 = accessibilityNodeInfo7;
                        } else {
                            r3 = accessibilityNodeInfo2;
                            accessibilityNodeInfo4 = accessibilityNodeInfo3;
                        }
                        ub9Var2 = ub9Var;
                        Resources resources4 = resources2;
                        strD = qm.d(ub9Var2, resources4);
                        if (Build.VERSION.SDK_INT >= 30) {
                            j4.b.b(r3, strD);
                        } else {
                            r3.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", strD);
                        }
                        r3.setCheckable(qm.c(ub9Var2));
                        objD2 = c37Var.d(ac9.K);
                        if (objD2 == null) {
                            objD2 = j4Var2;
                        }
                        fqaVar = (fqa) objD2;
                        if (fqaVar != null) {
                            if (fqaVar == fqa.t) {
                                r3.setChecked(true);
                            } else if (fqaVar == fqa.u) {
                                r3.setChecked(false);
                            }
                            g2b g2bVar3 = g2b.a;
                        }
                        objD3 = c37Var.d(ac9.J);
                        if (objD3 == null) {
                            objD3 = j4Var2;
                        }
                        bool = (Boolean) objD3;
                        if (bool != null) {
                            zBooleanValue2 = bool.booleanValue();
                            if (ex8Var2 == null) {
                                ex8Var3 = ex8Var2;
                                i6 = 4;
                            } else {
                                ex8Var3 = ex8Var2;
                                i6 = 4;
                                if (ex8Var3.a == 4) {
                                    accessibilityNodeInfo4.setSelected(zBooleanValue2);
                                }
                                g2b g2bVar4 = g2b.a;
                            }
                            r3.setChecked(zBooleanValue2);
                            g2b g2bVar5 = g2b.a;
                        } else {
                            ex8Var3 = ex8Var2;
                            i6 = 4;
                        }
                        lb9Var3 = lb9Var2;
                        if (lb9Var3.v || ub9.j(i6, ub9Var2).isEmpty()) {
                            objD4 = c37Var.d(ac9.a);
                            if (objD4 == null) {
                                objD4 = j4Var2;
                            }
                            list = (List) objD4;
                            if (list != null) {
                                r7 = (String) th1.A(list);
                            } else {
                                r7 = j4Var2;
                            }
                            r3.setContentDescription(r7);
                        }
                        objD5 = c37Var.d(ac9.A);
                        if (objD5 == null) {
                            objD5 = j4Var2;
                        }
                        str = (String) objD5;
                        if (str != null) {
                            ub9VarL3 = ub9Var2;
                            while (true) {
                                if (ub9VarL3 != null) {
                                    zBooleanValue = false;
                                    break;
                                }
                                lb9Var4 = ub9VarL3.d;
                                gc9Var5 = bc9.a;
                                if (lb9Var4.t.b(gc9Var5)) {
                                    zBooleanValue = ((Boolean) lb9Var4.f(gc9Var5)).booleanValue();
                                    break;
                                }
                                ub9VarL3 = ub9VarL3.l();
                            }
                            if (zBooleanValue) {
                                accessibilityNodeInfo4.setViewIdResourceName(str);
                            }
                        }
                        objD6 = c37Var.d(ac9.h);
                        if (objD6 == null) {
                            objD6 = j4Var2;
                        }
                        if (((g2b) objD6) != null) {
                            r1.m(true);
                            g2b g2bVar6 = g2b.a;
                        }
                        objD7 = c37Var.d(ac9.i);
                        if (objD7 == null) {
                            objD7 = j4Var2;
                        }
                        if (((g2b) objD7) != null) {
                            r1.t();
                            g2b g2bVar7 = g2b.a;
                        }
                        i7 = i;
                        if (i7 != -1) {
                            iD3 = c27Var.d(ub9Var2.f);
                            if (iD3 != -1) {
                                accessibilityNodeInfo4.setDrawingOrder(iD3);
                                g2b g2bVar8 = g2b.a;
                            } else {
                                Log.w("AccessibilityDelegate", "Drawing order is not available, was AccessibilityNodeInfo requested for a child node before its parent?");
                            }
                        }
                        accessibilityNodeInfo4.setPassword(c37Var.b(ac9.L));
                        objD8 = c37Var.d(ac9.O);
                        if (objD8 == null) {
                            objD8 = j4Var2;
                        }
                        bool2 = Boolean.TRUE;
                        accessibilityNodeInfo4.setEditable(xj5.a(objD8, bool2));
                        objD9 = c37Var.d(ac9.P);
                        if (objD9 == null) {
                            objD9 = j4Var2;
                        }
                        num = (Integer) objD9;
                        if (num != null) {
                            iIntValue2 = num.intValue();
                        } else {
                            iIntValue2 = -1;
                        }
                        r3.setMaxTextLength(iIntValue2);
                        accessibilityNodeInfo4.setEnabled(qm.a(ub9Var2));
                        gc9Var2 = ac9.l;
                        accessibilityNodeInfo4.setFocusable(c37Var.b(gc9Var2));
                        if (accessibilityNodeInfo4.isFocusable()) {
                            accessibilityNodeInfo4.setFocused(((Boolean) lb9Var3.f(gc9Var2)).booleanValue());
                            if (accessibilityNodeInfo4.isFocused()) {
                                i8 = 2;
                                r1.a(2);
                                lm lmVar3 = lmVar2;
                                lmVar3.B = i7;
                                lmVar = lmVar3;
                            } else {
                                r10 = lmVar2;
                                i8 = 2;
                                z2 = true;
                                r1.a(1);
                            }
                            r3.setVisibleToUser(zb9.g(ub9Var2) ^ z2);
                            if (ub9Var2.o()) {
                                ub9VarL2 = ub9Var2.l();
                                ub9VarL2.getClass();
                            } else {
                                ub9VarL2 = ub9Var2;
                            }
                            if (ub9VarL2.m().f()) {
                                r3.setVisibleToUser(false);
                            }
                            objD10 = c37Var.d(ac9.k);
                            if (objD10 == null) {
                                objD10 = j4Var2;
                            }
                            nb6Var = (nb6) objD10;
                            if (nb6Var != null) {
                                i15 = nb6Var.a;
                                if (i15 != 0 || i15 != 1) {
                                    i8 = 1;
                                }
                                accessibilityNodeInfo4.setLiveRegion(i8);
                                g2b g2bVar9 = g2b.a;
                            }
                            r3.setClickable(false);
                            objD11 = c37Var.d(kb9.b);
                            if (objD11 == null) {
                                objD11 = j4Var2;
                            }
                            k3Var = (k3) objD11;
                            if (k3Var != null) {
                                objD23 = c37Var.d(ac9.J);
                                if (objD23 == null) {
                                    objD23 = j4Var2;
                                }
                                boolean zA6 = xj5.a(objD23, bool2);
                                z4 = (ex8Var3 == null && ex8Var3.a == 4) || (ex8Var3 != null && ex8Var3.a == 3);
                                if (z4 || (z4 && !zA6)) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                r3.setClickable(z5);
                                if (qm.a(ub9Var2) && accessibilityNodeInfo4.isClickable()) {
                                    r1.b(new j4.a(16, k3Var.a));
                                }
                                g2b g2bVar10 = g2b.a;
                            }
                            r3.setLongClickable(false);
                            objD12 = c37Var.d(kb9.c);
                            if (objD12 == null) {
                                objD12 = j4Var2;
                            }
                            k3Var2 = (k3) objD12;
                            if (k3Var2 != null) {
                                r3.setLongClickable(true);
                                if (qm.a(ub9Var2)) {
                                    r1.b(new j4.a(32, k3Var2.a));
                                }
                                g2b g2bVar11 = g2b.a;
                            }
                            objD13 = c37Var.d(kb9.q);
                            if (objD13 == null) {
                                objD13 = j4Var2;
                            }
                            k3Var3 = (k3) objD13;
                            if (k3Var3 != null) {
                                r1.b(new j4.a(16384, k3Var3.a));
                                g2b g2bVar12 = g2b.a;
                            }
                            if (qm.a(ub9Var2)) {
                                k3Var9 = (k3) ia0.b(lb9Var3, kb9.k);
                                if (k3Var9 != null) {
                                    r1.b(new j4.a(2097152, k3Var9.a));
                                    g2b g2bVar13 = g2b.a;
                                }
                                k3Var10 = (k3) ia0.b(lb9Var3, kb9.p);
                                if (k3Var10 != null) {
                                    r1.b(new j4.a(android.R.id.accessibilityActionImeEnter, k3Var10.a));
                                    g2b g2bVar14 = g2b.a;
                                }
                                k3Var11 = (k3) ia0.b(lb9Var3, kb9.r);
                                if (k3Var11 != null) {
                                    r1.b(new j4.a(65536, k3Var11.a));
                                    g2b g2bVar15 = g2b.a;
                                }
                                k3Var12 = (k3) ia0.b(lb9Var3, kb9.s);
                                if (k3Var12 != null) {
                                    if (accessibilityNodeInfo4.isFocused()) {
                                        primaryClipDescription = cmVar2.getClipboardManager().b().getPrimaryClipDescription();
                                        if (primaryClipDescription != null) {
                                            zHasMimeType = primaryClipDescription.hasMimeType("text/*");
                                        } else {
                                            zHasMimeType = false;
                                        }
                                        if (zHasMimeType) {
                                            r1.b(new j4.a(32768, k3Var12.a));
                                        }
                                    }
                                    g2b g2bVar16 = g2b.a;
                                }
                            }
                            strK = lm.k(ub9Var2);
                            if (strK != null && strK.length() != 0) {
                                accessibilityNodeInfo4.setTextSelection(r10.i(ub9Var2), r10.h(ub9Var2));
                                k3Var8 = (k3) ia0.b(lb9Var3, kb9.j);
                                if (k3Var8 != null) {
                                    r6 = k3Var8.a;
                                } else {
                                    r6 = j4Var2;
                                }
                                r1.b(new j4.a(131072, (String) r6));
                                r1.a(256);
                                r1.a(512);
                                r3.setMovementGranularities(11);
                                list3 = (List) ia0.b(lb9Var3, ac9.a);
                                if ((list3 != null || list3.isEmpty()) && c37Var.b(kb9.a)) {
                                    if (ub9Var2.d.t.b(ac9.G)) {
                                        objD22 = ub9Var2.d.t.d(ac9.l);
                                        if (objD22 == null) {
                                            objD22 = j4Var2;
                                        }
                                        if (xj5.a(objD22, Boolean.TRUE)) {
                                            I = ub9Var2.c.I();
                                            while (true) {
                                                if (I == 0) {
                                                    I = j4Var2;
                                                    break;
                                                }
                                                lb9VarR2 = I.r();
                                                if (lb9VarR2 == null && lb9VarR2.v) {
                                                    if (lb9VarR2.t.b(ac9.G)) {
                                                        break;
                                                    }
                                                }
                                                I = I.I();
                                            }
                                            if (I != 0) {
                                                lb9VarR = I.r();
                                                if (lb9VarR != null) {
                                                    objD21 = lb9VarR.t.d(ac9.l);
                                                    if (objD21 == null) {
                                                        objD21 = j4Var2;
                                                    }
                                                    zA3 = xj5.a(objD21, Boolean.TRUE);
                                                } else {
                                                    zA3 = false;
                                                }
                                                z3 = zA3 ? false : true;
                                            }
                                        }
                                    } else {
                                        I = ub9Var2.c.I();
                                        while (true) {
                                            if (I == 0) {
                                                I = j4Var2;
                                                break;
                                            }
                                            lb9VarR2 = I.r();
                                            if (lb9VarR2 == null) {
                                            }
                                            I = I.I();
                                        }
                                        if (I != 0) {
                                            lb9VarR = I.r();
                                            if (lb9VarR != null) {
                                                objD21 = lb9VarR.t.d(ac9.l);
                                                if (objD21 == null) {
                                                    objD21 = j4Var2;
                                                }
                                                zA3 = xj5.a(objD21, Boolean.TRUE);
                                            } else {
                                                zA3 = false;
                                            }
                                            if (zA3) {
                                            }
                                        }
                                    }
                                    if (!z3) {
                                        r3.setMovementGranularities(accessibilityNodeInfo4.getMovementGranularities() | 20);
                                    }
                                }
                            }
                            if (Build.VERSION.SDK_INT >= 26) {
                                arrayList3 = new ArrayList();
                                arrayList3.add("androidx.compose.ui.semantics.id");
                                charSequenceF = r1.f();
                                if (charSequenceF != null && charSequenceF.length() != 0 && c37Var.b(kb9.a)) {
                                    arrayList3.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                                }
                                if (c37Var.b(ac9.A)) {
                                    arrayList3.add("androidx.compose.ui.semantics.testTag");
                                }
                                if (c37Var.b(ac9.Q)) {
                                    arrayList3.add("androidx.compose.ui.semantics.shapeType");
                                    arrayList3.add("androidx.compose.ui.semantics.shapeRect");
                                    arrayList3.add("androidx.compose.ui.semantics.shapeCorners");
                                    arrayList3.add("androidx.compose.ui.semantics.shapeRegion");
                                }
                                r1.h(arrayList3);
                            }
                            ud8Var = (ud8) ia0.b(lb9Var3, ac9.c);
                            if (ud8Var != null) {
                                f = ud8Var.a;
                                gg1Var = ud8Var.b;
                                gc9Var4 = kb9.i;
                                if (c37Var.b(gc9Var4)) {
                                    r1.j("android.widget.SeekBar");
                                } else {
                                    r1.j("android.widget.ProgressBar");
                                }
                                if (ud8Var != ud8.c) {
                                    gg1Var.getClass();
                                    accessibilityNodeInfo4.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, fValueOf.floatValue(), gg1Var.a().floatValue(), f));
                                }
                                if (c37Var.b(gc9Var4) && qm.a(ub9Var2)) {
                                    fFloatValue = gg1Var.a().floatValue();
                                    fFloatValue2 = fValueOf.floatValue();
                                    if (fFloatValue < fFloatValue2) {
                                        fFloatValue = fFloatValue2;
                                    }
                                    if (f < fFloatValue) {
                                        r1.b(j4.a.i);
                                    }
                                    fFloatValue3 = fValueOf.floatValue();
                                    fFloatValue4 = gg1Var.a().floatValue();
                                    if (fFloatValue3 > fFloatValue4) {
                                        fFloatValue3 = fFloatValue4;
                                    }
                                    if (f > fFloatValue3) {
                                        r1.b(j4.a.j);
                                    }
                                }
                            }
                            if (qm.a(ub9Var2)) {
                                objD20 = ub9Var2.d.t.d(kb9.i);
                                if (objD20 == null) {
                                    objD20 = j4Var2;
                                }
                                k3Var7 = (k3) objD20;
                                if (k3Var7 != null) {
                                    r1.b(new j4.a(android.R.id.accessibilityActionSetProgress, k3Var7.a));
                                }
                            }
                            objD14 = ub9Var2.k().t.d(ac9.f);
                            if (objD14 == null) {
                                objD14 = j4Var2;
                            }
                            ah1Var = (ah1) objD14;
                            if (ah1Var != null) {
                                r1.k(j4.g.a(ah1Var.a, ah1Var.b, 0));
                            } else {
                                arrayList = new ArrayList();
                                objD15 = ub9Var2.k().t.d(ac9.e);
                                if (objD15 == null) {
                                    objD15 = j4Var2;
                                }
                                if (objD15 != null) {
                                    listJ2 = ub9.j(4, ub9Var2);
                                    size4 = listJ2.size();
                                    while (i9 < size4) {
                                        ub9Var3 = (ub9) listJ2.get(i9);
                                        if (ub9Var3.k().t.b(ac9.J)) {
                                            arrayList.add(ub9Var3);
                                        }
                                    }
                                }
                                if (!arrayList.isEmpty()) {
                                    zA2 = bh1.a(arrayList);
                                    if (zA2) {
                                        size2 = 1;
                                    } else {
                                        size2 = arrayList.size();
                                    }
                                    if (zA2) {
                                        size3 = arrayList.size();
                                    } else {
                                        size3 = 1;
                                    }
                                    r1.k(j4.g.a(size2, size3, 0));
                                }
                            }
                            bh1.b(r1, ub9Var2);
                            c69Var = (c69) ia0.b(lb9Var3, ac9.v);
                            k3 k3Var13 = (k3) ia0.b(lb9Var3, kb9.d);
                            if (c69Var != null && k3Var13 != null) {
                                objD18 = ub9Var2.k().t.d(ac9.f);
                                if (objD18 == null) {
                                    objD18 = j4Var2;
                                }
                                if (objD18 == null) {
                                    objD19 = ub9Var2.k().t.d(ac9.e);
                                    if (objD19 == null) {
                                        objD19 = j4Var2;
                                    }
                                    if (objD19 == null) {
                                        r1.j("android.widget.HorizontalScrollView");
                                    }
                                }
                                if (c69Var.b.invoke().floatValue() > 0) {
                                    r1.q(true);
                                }
                                if (qm.a(ub9Var2)) {
                                    zQ = lm.q(c69Var);
                                    tq5Var = tq5.u;
                                    if (zQ) {
                                        r1.b(j4.a.i);
                                        qr5Var = qr5Var2;
                                        if (qr5Var.S == tq5Var) {
                                            aVar2 = j4.a.o;
                                        } else {
                                            aVar2 = j4.a.q;
                                        }
                                        r1.b(aVar2);
                                    } else {
                                        qr5Var = qr5Var2;
                                    }
                                    if (lm.p(c69Var)) {
                                        r1.b(j4.a.j);
                                        if (qr5Var.S == tq5Var) {
                                            aVar = j4.a.q;
                                        } else {
                                            aVar = j4.a.o;
                                        }
                                        r1.b(aVar);
                                    }
                                }
                            }
                            c69Var2 = (c69) ia0.b(ub9Var2.n(), ac9.w);
                            if (c69Var2 != null && k3Var13 != null) {
                                objD16 = ub9Var2.k().t.d(ac9.f);
                                if (objD16 == null) {
                                    objD16 = j4Var2;
                                }
                                if (objD16 == null) {
                                    objD17 = ub9Var2.k().t.d(ac9.e);
                                    if (objD17 == null) {
                                        objD17 = j4Var2;
                                    }
                                    if (objD17 == null) {
                                        r1.j("android.widget.ScrollView");
                                    }
                                }
                                if (c69Var2.b.invoke().floatValue() > r1) {
                                    r1.q(true);
                                }
                                if (qm.a(ub9Var2)) {
                                    if (lm.q(c69Var2)) {
                                        r1.b(j4.a.i);
                                        r1.b(j4.a.p);
                                    }
                                    if (lm.p(c69Var2)) {
                                        r1.b(j4.a.j);
                                        r1.b(j4.a.n);
                                    }
                                }
                            }
                            if (Build.VERSION.SDK_INT >= 29) {
                                b.a(r1, ub9Var2);
                            }
                            r1.o((CharSequence) ia0.b(ub9Var2.n(), ac9.d));
                            if (qm.a(ub9Var2)) {
                                k3Var4 = (k3) ia0.b(ub9Var2.n(), kb9.t);
                                if (k3Var4 != null) {
                                    r1.b(new j4.a(262144, k3Var4.a));
                                    g2b g2bVar17 = g2b.a;
                                }
                                k3Var5 = (k3) ia0.b(ub9Var2.n(), kb9.u);
                                if (k3Var5 != null) {
                                    r1.b(new j4.a(524288, k3Var5.a));
                                    g2b g2bVar18 = g2b.a;
                                }
                                k3Var6 = (k3) ia0.b(ub9Var2.n(), kb9.v);
                                if (k3Var6 != null) {
                                    r1.b(new j4.a(1048576, k3Var6.a));
                                    g2b g2bVar19 = g2b.a;
                                }
                                lb9VarN = ub9Var2.n();
                                gc9Var3 = kb9.x;
                                if (lb9VarN.t.b(kb9.x)) {
                                    list2 = (List) ub9Var2.n().f(gc9Var3);
                                    d27Var3 = d27Var2;
                                    if (list2.size() < d27Var3.b) {
                                        aa0.c(i34.b(d27Var3.b, " custom actions for one widget", new StringBuilder("Can't have more than ")));
                                        return null;
                                    }
                                    fx9Var3 = new fx9(0);
                                    s27VarA = je7.a();
                                    fx9Var4 = fx9Var2;
                                    if (fx9Var4.b(i7)) {
                                        s27VarC = fx9Var4.c(i7);
                                        d27Var4 = new d27();
                                        iArr = d27Var3.a;
                                        i11 = d27Var3.b;
                                        while (i12 < i11) {
                                            d27Var4.c(iArr[i12]);
                                        }
                                        arrayList2 = new ArrayList();
                                        size6 = list2.size();
                                        i13 = 0;
                                        while (i13 < size6) {
                                            dd2Var = (dd2) list2.get(i13);
                                            s27VarC.getClass();
                                            dd2Var.getClass();
                                            int i40 = size6;
                                            r13 = j4Var2;
                                            if (s27VarC.d(r13) >= 0) {
                                                int iE = s27VarC.e(r13);
                                                fx9Var3.e(iE, r13);
                                                s27VarA.h(iE, r13);
                                                d27Var4.e(iE);
                                                r1.b(new j4.a(iE, (String) r13));
                                                g2b g2bVar20 = g2b.a;
                                            } else {
                                                arrayList2.add(dd2Var);
                                            }
                                            i13++;
                                            size6 = i40;
                                            s27VarC = s27VarC;
                                            j4Var2 = null;
                                        }
                                        size7 = arrayList2.size();
                                        while (i14 < size7) {
                                            dd2 dd2Var2 = (dd2) arrayList2.get(i14);
                                            int iA = d27Var4.a(i14);
                                            dd2Var2.getClass();
                                            fx9Var3.e(iA, null);
                                            s27VarA.h(iA, null);
                                            r1.b(new j4.a(iA, (String) null));
                                        }
                                    } else {
                                        size5 = list2.size();
                                        while (i10 < size5) {
                                            dd2 dd2Var3 = (dd2) list2.get(i10);
                                            int iA2 = d27Var3.a(i10);
                                            dd2Var3.getClass();
                                            fx9Var3.e(iA2, null);
                                            s27VarA.h(iA2, null);
                                            r1.b(new j4.a(iA2, (String) null));
                                        }
                                    }
                                    r10.H.e(i7, fx9Var3);
                                    fx9Var4.e(i7, s27VarA);
                                }
                            }
                            r1.p(qm.b(ub9Var2, resources4));
                            iD = r10.R.d(i7);
                            if (iD != -1) {
                                btVarB2 = kc9.b(cmVar2.getAndroidViewsHandler$ui(), iD);
                                if (btVarB2 != null) {
                                    r3.setTraversalBefore(btVarB2);
                                    cmVar = cmVar2;
                                } else {
                                    cmVar = cmVar2;
                                    r3.setTraversalBefore(cmVar, iD);
                                }
                                bundle = null;
                                r10.a(i7, r1, r10.T, null);
                            } else {
                                cmVar = cmVar2;
                                bundle = null;
                            }
                            iD2 = r10.S.d(i7);
                            if (iD2 != -1 && (btVarB = kc9.b(cmVar.getAndroidViewsHandler$ui(), iD2)) != null) {
                                r3.setTraversalAfter(btVarB);
                                r10.a(i7, r1, r10.U, bundle);
                            }
                            str2 = (String) ia0.b(ub9Var2.n(), bc9.b);
                            if (str2 != null) {
                                r1.j(str2);
                                g2b g2bVar21 = g2b.a;
                            }
                            r8 = r1;
                            r11 = r10;
                        } else {
                            lmVar = lmVar2;
                            i8 = 2;
                        }
                        z2 = true;
                        r10 = lmVar;
                        r3.setVisibleToUser(zb9.g(ub9Var2) ^ z2);
                        if (ub9Var2.o()) {
                            ub9VarL2 = ub9Var2.l();
                            ub9VarL2.getClass();
                        } else {
                            ub9VarL2 = ub9Var2;
                        }
                        if (ub9VarL2.m().f()) {
                            r3.setVisibleToUser(false);
                        }
                        objD10 = c37Var.d(ac9.k);
                        if (objD10 == null) {
                            objD10 = j4Var2;
                        }
                        nb6Var = (nb6) objD10;
                        if (nb6Var != null) {
                            i15 = nb6Var.a;
                            if (i15 != 0) {
                                i8 = 1;
                            } else {
                                i8 = 1;
                            }
                            accessibilityNodeInfo4.setLiveRegion(i8);
                            g2b g2bVar22 = g2b.a;
                        }
                        r3.setClickable(false);
                        objD11 = c37Var.d(kb9.b);
                        if (objD11 == null) {
                            objD11 = j4Var2;
                        }
                        k3Var = (k3) objD11;
                        if (k3Var != null) {
                            objD23 = c37Var.d(ac9.J);
                            if (objD23 == null) {
                                objD23 = j4Var2;
                            }
                            boolean zA7 = xj5.a(objD23, bool2);
                            if (ex8Var3 == null) {
                            }
                            if (z4) {
                                z5 = true;
                            } else {
                                z5 = true;
                            }
                            r3.setClickable(z5);
                            if (qm.a(ub9Var2)) {
                                r1.b(new j4.a(16, k3Var.a));
                            }
                            g2b g2bVar110 = g2b.a;
                        }
                        r3.setLongClickable(false);
                        objD12 = c37Var.d(kb9.c);
                        if (objD12 == null) {
                            objD12 = j4Var2;
                        }
                        k3Var2 = (k3) objD12;
                        if (k3Var2 != null) {
                            r3.setLongClickable(true);
                            if (qm.a(ub9Var2)) {
                                r1.b(new j4.a(32, k3Var2.a));
                            }
                            g2b g2bVar111 = g2b.a;
                        }
                        objD13 = c37Var.d(kb9.q);
                        if (objD13 == null) {
                            objD13 = j4Var2;
                        }
                        k3Var3 = (k3) objD13;
                        if (k3Var3 != null) {
                            r1.b(new j4.a(16384, k3Var3.a));
                            g2b g2bVar112 = g2b.a;
                        }
                        if (qm.a(ub9Var2)) {
                            k3Var9 = (k3) ia0.b(lb9Var3, kb9.k);
                            if (k3Var9 != null) {
                                r1.b(new j4.a(2097152, k3Var9.a));
                                g2b g2bVar113 = g2b.a;
                            }
                            k3Var10 = (k3) ia0.b(lb9Var3, kb9.p);
                            if (k3Var10 != null) {
                                r1.b(new j4.a(android.R.id.accessibilityActionImeEnter, k3Var10.a));
                                g2b g2bVar114 = g2b.a;
                            }
                            k3Var11 = (k3) ia0.b(lb9Var3, kb9.r);
                            if (k3Var11 != null) {
                                r1.b(new j4.a(65536, k3Var11.a));
                                g2b g2bVar115 = g2b.a;
                            }
                            k3Var12 = (k3) ia0.b(lb9Var3, kb9.s);
                            if (k3Var12 != null) {
                                if (accessibilityNodeInfo4.isFocused()) {
                                    primaryClipDescription = cmVar2.getClipboardManager().b().getPrimaryClipDescription();
                                    if (primaryClipDescription != null) {
                                        zHasMimeType = primaryClipDescription.hasMimeType("text/*");
                                    } else {
                                        zHasMimeType = false;
                                    }
                                    if (zHasMimeType) {
                                        r1.b(new j4.a(32768, k3Var12.a));
                                    }
                                }
                                g2b g2bVar116 = g2b.a;
                            }
                        }
                        strK = lm.k(ub9Var2);
                        if (strK != null) {
                            accessibilityNodeInfo4.setTextSelection(r10.i(ub9Var2), r10.h(ub9Var2));
                            k3Var8 = (k3) ia0.b(lb9Var3, kb9.j);
                            if (k3Var8 != null) {
                                r6 = k3Var8.a;
                            } else {
                                r6 = j4Var2;
                            }
                            r1.b(new j4.a(131072, (String) r6));
                            r1.a(256);
                            r1.a(512);
                            r3.setMovementGranularities(11);
                            list3 = (List) ia0.b(lb9Var3, ac9.a);
                            if (list3 != null) {
                                if (ub9Var2.d.t.b(ac9.G)) {
                                    objD22 = ub9Var2.d.t.d(ac9.l);
                                    if (objD22 == null) {
                                        objD22 = j4Var2;
                                    }
                                    if (xj5.a(objD22, Boolean.TRUE)) {
                                        I = ub9Var2.c.I();
                                        while (true) {
                                            if (I == 0) {
                                                I = j4Var2;
                                                break;
                                            }
                                            lb9VarR2 = I.r();
                                            if (lb9VarR2 == null) {
                                            }
                                            I = I.I();
                                        }
                                        if (I != 0) {
                                            lb9VarR = I.r();
                                            if (lb9VarR != null) {
                                                objD21 = lb9VarR.t.d(ac9.l);
                                                if (objD21 == null) {
                                                    objD21 = j4Var2;
                                                }
                                                zA3 = xj5.a(objD21, Boolean.TRUE);
                                            } else {
                                                zA3 = false;
                                            }
                                            if (zA3) {
                                            }
                                        }
                                    }
                                } else {
                                    I = ub9Var2.c.I();
                                    while (true) {
                                        if (I == 0) {
                                            I = j4Var2;
                                            break;
                                        }
                                        lb9VarR2 = I.r();
                                        if (lb9VarR2 == null) {
                                        }
                                        I = I.I();
                                    }
                                    if (I != 0) {
                                        lb9VarR = I.r();
                                        if (lb9VarR != null) {
                                            objD21 = lb9VarR.t.d(ac9.l);
                                            if (objD21 == null) {
                                                objD21 = j4Var2;
                                            }
                                            zA3 = xj5.a(objD21, Boolean.TRUE);
                                        } else {
                                            zA3 = false;
                                        }
                                        if (zA3) {
                                        }
                                    }
                                }
                                if (!z3) {
                                    r3.setMovementGranularities(accessibilityNodeInfo4.getMovementGranularities() | 20);
                                }
                            } else {
                                if (ub9Var2.d.t.b(ac9.G)) {
                                    objD22 = ub9Var2.d.t.d(ac9.l);
                                    if (objD22 == null) {
                                        objD22 = j4Var2;
                                    }
                                    if (xj5.a(objD22, Boolean.TRUE)) {
                                        I = ub9Var2.c.I();
                                        while (true) {
                                            if (I == 0) {
                                                I = j4Var2;
                                                break;
                                            }
                                            lb9VarR2 = I.r();
                                            if (lb9VarR2 == null) {
                                            }
                                            I = I.I();
                                        }
                                        if (I != 0) {
                                            lb9VarR = I.r();
                                            if (lb9VarR != null) {
                                                objD21 = lb9VarR.t.d(ac9.l);
                                                if (objD21 == null) {
                                                    objD21 = j4Var2;
                                                }
                                                zA3 = xj5.a(objD21, Boolean.TRUE);
                                            } else {
                                                zA3 = false;
                                            }
                                            if (zA3) {
                                            }
                                        }
                                    }
                                } else {
                                    I = ub9Var2.c.I();
                                    while (true) {
                                        if (I == 0) {
                                            I = j4Var2;
                                            break;
                                        }
                                        lb9VarR2 = I.r();
                                        if (lb9VarR2 == null) {
                                        }
                                        I = I.I();
                                    }
                                    if (I != 0) {
                                        lb9VarR = I.r();
                                        if (lb9VarR != null) {
                                            objD21 = lb9VarR.t.d(ac9.l);
                                            if (objD21 == null) {
                                                objD21 = j4Var2;
                                            }
                                            zA3 = xj5.a(objD21, Boolean.TRUE);
                                        } else {
                                            zA3 = false;
                                        }
                                        if (zA3) {
                                        }
                                    }
                                }
                                if (!z3) {
                                    r3.setMovementGranularities(accessibilityNodeInfo4.getMovementGranularities() | 20);
                                }
                            }
                        }
                        if (Build.VERSION.SDK_INT >= 26) {
                            arrayList3 = new ArrayList();
                            arrayList3.add("androidx.compose.ui.semantics.id");
                            charSequenceF = r1.f();
                            if (charSequenceF != null) {
                                arrayList3.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                            }
                            if (c37Var.b(ac9.A)) {
                                arrayList3.add("androidx.compose.ui.semantics.testTag");
                            }
                            if (c37Var.b(ac9.Q)) {
                                arrayList3.add("androidx.compose.ui.semantics.shapeType");
                                arrayList3.add("androidx.compose.ui.semantics.shapeRect");
                                arrayList3.add("androidx.compose.ui.semantics.shapeCorners");
                                arrayList3.add("androidx.compose.ui.semantics.shapeRegion");
                            }
                            r1.h(arrayList3);
                        }
                        ud8Var = (ud8) ia0.b(lb9Var3, ac9.c);
                        if (ud8Var != null) {
                            f = ud8Var.a;
                            gg1Var = ud8Var.b;
                            gc9Var4 = kb9.i;
                            if (c37Var.b(gc9Var4)) {
                                r1.j("android.widget.SeekBar");
                            } else {
                                r1.j("android.widget.ProgressBar");
                            }
                            if (ud8Var != ud8.c) {
                                gg1Var.getClass();
                                accessibilityNodeInfo4.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, fValueOf.floatValue(), gg1Var.a().floatValue(), f));
                            }
                            if (c37Var.b(gc9Var4)) {
                                fFloatValue = gg1Var.a().floatValue();
                                fFloatValue2 = fValueOf.floatValue();
                                if (fFloatValue < fFloatValue2) {
                                    fFloatValue = fFloatValue2;
                                }
                                if (f < fFloatValue) {
                                    r1.b(j4.a.i);
                                }
                                fFloatValue3 = fValueOf.floatValue();
                                fFloatValue4 = gg1Var.a().floatValue();
                                if (fFloatValue3 > fFloatValue4) {
                                    fFloatValue3 = fFloatValue4;
                                }
                                if (f > fFloatValue3) {
                                    r1.b(j4.a.j);
                                }
                            }
                        }
                        if (qm.a(ub9Var2)) {
                            objD20 = ub9Var2.d.t.d(kb9.i);
                            if (objD20 == null) {
                                objD20 = j4Var2;
                            }
                            k3Var7 = (k3) objD20;
                            if (k3Var7 != null) {
                                r1.b(new j4.a(android.R.id.accessibilityActionSetProgress, k3Var7.a));
                            }
                        }
                        objD14 = ub9Var2.k().t.d(ac9.f);
                        if (objD14 == null) {
                            objD14 = j4Var2;
                        }
                        ah1Var = (ah1) objD14;
                        if (ah1Var != null) {
                            r1.k(j4.g.a(ah1Var.a, ah1Var.b, 0));
                        } else {
                            arrayList = new ArrayList();
                            objD15 = ub9Var2.k().t.d(ac9.e);
                            if (objD15 == null) {
                                objD15 = j4Var2;
                            }
                            if (objD15 != null) {
                                listJ2 = ub9.j(4, ub9Var2);
                                size4 = listJ2.size();
                                while (i9 < size4) {
                                    ub9Var3 = (ub9) listJ2.get(i9);
                                    if (ub9Var3.k().t.b(ac9.J)) {
                                        arrayList.add(ub9Var3);
                                    }
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                zA2 = bh1.a(arrayList);
                                if (zA2) {
                                    size2 = 1;
                                } else {
                                    size2 = arrayList.size();
                                }
                                if (zA2) {
                                    size3 = arrayList.size();
                                } else {
                                    size3 = 1;
                                }
                                r1.k(j4.g.a(size2, size3, 0));
                            }
                        }
                        bh1.b(r1, ub9Var2);
                        c69Var = (c69) ia0.b(lb9Var3, ac9.v);
                        k3 k3Var14 = (k3) ia0.b(lb9Var3, kb9.d);
                        if (c69Var != null) {
                            objD18 = ub9Var2.k().t.d(ac9.f);
                            if (objD18 == null) {
                                objD18 = j4Var2;
                            }
                            if (objD18 == null) {
                                objD19 = ub9Var2.k().t.d(ac9.e);
                                if (objD19 == null) {
                                    objD19 = j4Var2;
                                }
                                if (objD19 == null) {
                                    r1.j("android.widget.HorizontalScrollView");
                                }
                            }
                            if (c69Var.b.invoke().floatValue() > 0) {
                                r1.q(true);
                            }
                            if (qm.a(ub9Var2)) {
                                zQ = lm.q(c69Var);
                                tq5Var = tq5.u;
                                if (zQ) {
                                    r1.b(j4.a.i);
                                    qr5Var = qr5Var2;
                                    if (qr5Var.S == tq5Var) {
                                        aVar2 = j4.a.o;
                                    } else {
                                        aVar2 = j4.a.q;
                                    }
                                    r1.b(aVar2);
                                } else {
                                    qr5Var = qr5Var2;
                                }
                                if (lm.p(c69Var)) {
                                    r1.b(j4.a.j);
                                    if (qr5Var.S == tq5Var) {
                                        aVar = j4.a.q;
                                    } else {
                                        aVar = j4.a.o;
                                    }
                                    r1.b(aVar);
                                }
                            }
                        }
                        c69Var2 = (c69) ia0.b(ub9Var2.n(), ac9.w);
                        if (c69Var2 != null) {
                            objD16 = ub9Var2.k().t.d(ac9.f);
                            if (objD16 == null) {
                                objD16 = j4Var2;
                            }
                            if (objD16 == null) {
                                objD17 = ub9Var2.k().t.d(ac9.e);
                                if (objD17 == null) {
                                    objD17 = j4Var2;
                                }
                                if (objD17 == null) {
                                    r1.j("android.widget.ScrollView");
                                }
                            }
                            if (c69Var2.b.invoke().floatValue() > r1) {
                                r1.q(true);
                            }
                            if (qm.a(ub9Var2)) {
                                if (lm.q(c69Var2)) {
                                    r1.b(j4.a.i);
                                    r1.b(j4.a.p);
                                }
                                if (lm.p(c69Var2)) {
                                    r1.b(j4.a.j);
                                    r1.b(j4.a.n);
                                }
                            }
                        }
                        if (Build.VERSION.SDK_INT >= 29) {
                            b.a(r1, ub9Var2);
                        }
                        r1.o((CharSequence) ia0.b(ub9Var2.n(), ac9.d));
                        if (qm.a(ub9Var2)) {
                            k3Var4 = (k3) ia0.b(ub9Var2.n(), kb9.t);
                            if (k3Var4 != null) {
                                r1.b(new j4.a(262144, k3Var4.a));
                                g2b g2bVar117 = g2b.a;
                            }
                            k3Var5 = (k3) ia0.b(ub9Var2.n(), kb9.u);
                            if (k3Var5 != null) {
                                r1.b(new j4.a(524288, k3Var5.a));
                                g2b g2bVar118 = g2b.a;
                            }
                            k3Var6 = (k3) ia0.b(ub9Var2.n(), kb9.v);
                            if (k3Var6 != null) {
                                r1.b(new j4.a(1048576, k3Var6.a));
                                g2b g2bVar119 = g2b.a;
                            }
                            lb9VarN = ub9Var2.n();
                            gc9Var3 = kb9.x;
                            if (lb9VarN.t.b(kb9.x)) {
                                list2 = (List) ub9Var2.n().f(gc9Var3);
                                d27Var3 = d27Var2;
                                if (list2.size() < d27Var3.b) {
                                    aa0.c(i34.b(d27Var3.b, " custom actions for one widget", new StringBuilder("Can't have more than ")));
                                    return null;
                                }
                                fx9Var3 = new fx9(0);
                                s27VarA = je7.a();
                                fx9Var4 = fx9Var2;
                                if (fx9Var4.b(i7)) {
                                    s27VarC = fx9Var4.c(i7);
                                    d27Var4 = new d27();
                                    iArr = d27Var3.a;
                                    i11 = d27Var3.b;
                                    while (i12 < i11) {
                                        d27Var4.c(iArr[i12]);
                                    }
                                    arrayList2 = new ArrayList();
                                    size6 = list2.size();
                                    i13 = 0;
                                    while (i13 < size6) {
                                        dd2Var = (dd2) list2.get(i13);
                                        s27VarC.getClass();
                                        dd2Var.getClass();
                                        int i41 = size6;
                                        r13 = j4Var2;
                                        if (s27VarC.d(r13) >= 0) {
                                            int iE2 = s27VarC.e(r13);
                                            fx9Var3.e(iE2, r13);
                                            s27VarA.h(iE2, r13);
                                            d27Var4.e(iE2);
                                            r1.b(new j4.a(iE2, (String) r13));
                                            g2b g2bVar23 = g2b.a;
                                        } else {
                                            arrayList2.add(dd2Var);
                                        }
                                        i13++;
                                        size6 = i41;
                                        s27VarC = s27VarC;
                                        j4Var2 = null;
                                    }
                                    size7 = arrayList2.size();
                                    while (i14 < size7) {
                                        dd2 dd2Var4 = (dd2) arrayList2.get(i14);
                                        int iA3 = d27Var4.a(i14);
                                        dd2Var4.getClass();
                                        fx9Var3.e(iA3, null);
                                        s27VarA.h(iA3, null);
                                        r1.b(new j4.a(iA3, (String) null));
                                    }
                                } else {
                                    size5 = list2.size();
                                    while (i10 < size5) {
                                        dd2 dd2Var5 = (dd2) list2.get(i10);
                                        int iA4 = d27Var3.a(i10);
                                        dd2Var5.getClass();
                                        fx9Var3.e(iA4, null);
                                        s27VarA.h(iA4, null);
                                        r1.b(new j4.a(iA4, (String) null));
                                    }
                                }
                                r10.H.e(i7, fx9Var3);
                                fx9Var4.e(i7, s27VarA);
                            }
                        }
                        r1.p(qm.b(ub9Var2, resources4));
                        iD = r10.R.d(i7);
                        if (iD != -1) {
                            btVarB2 = kc9.b(cmVar2.getAndroidViewsHandler$ui(), iD);
                            if (btVarB2 != null) {
                                r3.setTraversalBefore(btVarB2);
                                cmVar = cmVar2;
                            } else {
                                cmVar = cmVar2;
                                r3.setTraversalBefore(cmVar, iD);
                            }
                            bundle = null;
                            r10.a(i7, r1, r10.T, null);
                        } else {
                            cmVar = cmVar2;
                            bundle = null;
                        }
                        iD2 = r10.S.d(i7);
                        if (iD2 != -1) {
                            r3.setTraversalAfter(btVarB);
                            r10.a(i7, r1, r10.U, bundle);
                        }
                        str2 = (String) ia0.b(ub9Var2.n(), bc9.b);
                        if (str2 != null) {
                            r1.j(str2);
                            g2b g2bVar24 = g2b.a;
                        }
                        r8 = r1;
                        r11 = r10;
                    } else if (Build.VERSION.SDK_INT >= 34 ? v3.a(accessibilityManager) : true) {
                        accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
                        j4Var = new j4(accessibilityNodeInfoObtain);
                        i2 = Build.VERSION.SDK_INT;
                        if (i2 >= 34) {
                            j4.d.e(accessibilityNodeInfoObtain, zA5);
                        } else {
                            j4Var.i(64, zA5);
                        }
                        if (i == -1) {
                            parentForAccessibility = cmVar2.getParentForAccessibility();
                            j4Var2 = null;
                            if (parentForAccessibility instanceof View) {
                                view = (View) parentForAccessibility;
                            } else {
                                view = null;
                            }
                            j4Var.b = -1;
                            accessibilityNodeInfoObtain.setParent(view);
                        } else {
                            j4Var2 = null;
                            ub9VarL = ub9Var6.l();
                            if (ub9VarL != null) {
                                numValueOf = Integer.valueOf(ub9VarL.f);
                            } else {
                                numValueOf = null;
                            }
                            if (numValueOf != null) {
                                uc5.c("semanticsNode " + i + " has null parent");
                                fl.a();
                                return null;
                            }
                            iIntValue = numValueOf.intValue();
                            if (iIntValue == cmVar2.getSemanticsOwner().a().f) {
                                iIntValue = -1;
                            }
                            j4Var.b = iIntValue;
                            accessibilityNodeInfoObtain.setParent(cmVar2, iIntValue);
                        }
                        j4Var.c = i;
                        accessibilityNodeInfoObtain.setSource(cmVar2, i);
                        accessibilityNodeInfoObtain.setBoundsInScreen(lmVar2.b(xb9VarB2));
                        d27Var = lm.d0;
                        c27Var = lmVar2.Z;
                        fx9Var = lmVar2.I;
                        resources = cmVar2.getContext().getResources();
                        j4Var.j("android.view.View");
                        lb9Var = ub9Var6.d;
                        c37Var = lb9Var.t;
                        if (c37Var.b(ac9.G)) {
                            j4Var.j("android.widget.EditText");
                        }
                        if (c37Var.b(ac9.C)) {
                            j4Var.j("android.widget.TextView");
                        }
                        objD = c37Var.d(ac9.z);
                        if (objD == null) {
                            objD = j4Var2;
                        }
                        ex8Var = (ex8) objD;
                        if (ex8Var != null) {
                            i32 = ex8Var.a;
                            if (ub9Var6.o()) {
                                fx9Var2 = fx9Var;
                                i33 = 4;
                                d27Var2 = d27Var;
                            } else {
                                fx9Var2 = fx9Var;
                                i33 = 4;
                                d27Var2 = d27Var;
                                if (ub9.j(4, ub9Var6).isEmpty()) {
                                }
                                g2b g2bVar25 = g2b.a;
                            }
                            if (i32 == i33) {
                                accessibilityNodeInfoObtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources.getString(R.string.tab));
                            } else if (i32 == 2) {
                                accessibilityNodeInfoObtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources.getString(R.string.switch_role));
                            } else {
                                strC = kc9.c(i32);
                                if (i32 == 5) {
                                    j4Var.j(strC);
                                } else {
                                    j4Var.j(strC);
                                }
                            }
                            g2b g2bVar26 = g2b.a;
                        } else {
                            d27Var2 = d27Var;
                            fx9Var2 = fx9Var;
                        }
                        accessibilityNodeInfoObtain.setPackageName(cmVar2.getContext().getPackageName());
                        accessibilityNodeInfoObtain.setImportantForAccessibility(zb9.h(ub9Var6));
                        if (i2 >= 34) {
                            zA = v3.a(accessibilityManager);
                        } else {
                            zA = true;
                        }
                        listJ = ub9.j(4, ub9Var6);
                        size = listJ.size();
                        z = zA;
                        i3 = 0;
                        i4 = 0;
                        while (i4 < size) {
                            List list6 = listJ;
                            ub9Var4 = (ub9) listJ.get(i4);
                            int i310 = size;
                            zf5VarJ = lmVar2.j();
                            int i311 = i4;
                            i31 = ub9Var4.f;
                            if (zf5VarJ.a(i31)) {
                                btVar = cmVar2.getAndroidViewsHandler$ui().getLayoutNodeToHolder().get(ub9Var4.c);
                                if (i31 != -1) {
                                    if (btVar != null) {
                                        accessibilityNodeInfoObtain.addChild(btVar);
                                    } else {
                                        xb9VarB = lmVar2.j().b(i31);
                                        if (xb9VarB != null) {
                                            zA4 = false;
                                        } else {
                                            zA4 = false;
                                        }
                                        if (z) {
                                            accessibilityNodeInfoObtain.addChild(cmVar2, i31);
                                        } else {
                                            accessibilityNodeInfoObtain.addChild(cmVar2, i31);
                                        }
                                    }
                                    c27Var.f(i31, i3);
                                    i3++;
                                }
                            }
                            i4 = i311 + 1;
                            size = i310;
                            listJ = list6;
                        }
                        i5 = lmVar2.A;
                        accessibilityNodeInfo = j4Var.a;
                        if (i == i5) {
                            accessibilityNodeInfo.setAccessibilityFocused(true);
                            j4Var.b(j4.a.h);
                        } else {
                            accessibilityNodeInfo.setAccessibilityFocused(false);
                            j4Var.b(j4.a.g);
                        }
                        iwVarE = qm.e(ub9Var6);
                        if (iwVarE != null) {
                            cmVar2.getFontFamilyResolver();
                            density = cmVar2.getDensity();
                            c1bVar = lmVar2.V;
                            String str4 = iwVarE.u;
                            list4 = iwVarE.t;
                            spannableString = new SpannableString(str4);
                            arrayList4 = iwVarE.v;
                            if (arrayList4 != null) {
                                size13 = arrayList4.size();
                                i25 = 0;
                                while (i25 < size13) {
                                    int i312 = size13;
                                    iw.c cVar10 = (iw.c) arrayList4.get(i25);
                                    ArrayList arrayList8 = arrayList4;
                                    ww9 ww9Var2 = (ww9) cVar10.a;
                                    int i313 = i25;
                                    i26 = cVar10.b;
                                    i27 = cVar10.c;
                                    lb9 lb9Var6 = lb9Var;
                                    jC = ww9Var2.a.c();
                                    AccessibilityNodeInfo accessibilityNodeInfo8 = accessibilityNodeInfo;
                                    ub9 ub9Var8 = ub9Var6;
                                    long j3 = ww9Var2.b;
                                    ob4Var = ww9Var2.c;
                                    mb4Var = ww9Var2.d;
                                    ohaVar = ww9Var2.j;
                                    ex8 ex8Var5 = ex8Var;
                                    ad6 ad6Var2 = ww9Var2.k;
                                    Resources resources5 = resources;
                                    AccessibilityNodeInfo accessibilityNodeInfo9 = accessibilityNodeInfoObtain;
                                    j = ww9Var2.l;
                                    fdaVar = ww9Var2.m;
                                    ui1Var = ww9Var2.a;
                                    j4 j4Var6 = j4Var;
                                    if (!uh1.c(jC, ui1Var.c())) {
                                        if (jC != 16) {
                                            ui1Var = new ui1(jC);
                                        } else {
                                            ui1Var = mha.a.a;
                                        }
                                    }
                                    bx9.c(spannableString, ui1Var.c(), i26, i27);
                                    spannableString3 = spannableString;
                                    bx9.d(spannableString3, j3, density, i26, i27);
                                    if (ob4Var == null) {
                                        if (ob4Var == null) {
                                            ob4Var2 = ob4.y;
                                        } else {
                                            ob4Var2 = ob4Var;
                                        }
                                        if (mb4Var != null) {
                                            i28 = mb4Var.a;
                                        } else {
                                            i28 = 0;
                                        }
                                        StyleSpan styleSpan2 = new StyleSpan(lo.c(ob4Var2, i28));
                                        i29 = 33;
                                        spannableString3.setSpan(styleSpan2, i26, i27, 33);
                                    } else {
                                        if (ob4Var == null) {
                                            ob4Var2 = ob4.y;
                                        } else {
                                            ob4Var2 = ob4Var;
                                        }
                                        if (mb4Var != null) {
                                            i28 = mb4Var.a;
                                        } else {
                                            i28 = 0;
                                        }
                                        StyleSpan styleSpan3 = new StyleSpan(lo.c(ob4Var2, i28));
                                        i29 = 33;
                                        spannableString3.setSpan(styleSpan3, i26, i27, 33);
                                    }
                                    if (fdaVar != null) {
                                        i30 = fdaVar.a;
                                        if ((i30 | 1) == i30) {
                                            spannableString3.setSpan(new UnderlineSpan(), i26, i27, i29);
                                        }
                                        if ((i30 | 2) == i30) {
                                            spannableString3.setSpan(new StrikethroughSpan(), i26, i27, i29);
                                        }
                                    }
                                    if (ohaVar != null) {
                                        spannableString3.setSpan(new ScaleXSpan(ohaVar.a), i26, i27, i29);
                                    }
                                    bx9.e(spannableString3, ad6Var2, i26, i27);
                                    if (j != 16) {
                                        spannableString3.setSpan(new BackgroundColorSpan(u7d.l(j)), i26, i27, i29);
                                    }
                                    i25 = i313 + 1;
                                    spannableString = spannableString3;
                                    size13 = i312;
                                    arrayList4 = arrayList8;
                                    lb9Var = lb9Var6;
                                    ub9Var6 = ub9Var8;
                                    accessibilityNodeInfo = accessibilityNodeInfo8;
                                    ex8Var = ex8Var5;
                                    accessibilityNodeInfoObtain = accessibilityNodeInfo9;
                                    resources = resources5;
                                    j4Var = j4Var6;
                                }
                            }
                            lb9Var2 = lb9Var;
                            ex8Var2 = ex8Var;
                            accessibilityNodeInfo2 = accessibilityNodeInfo;
                            ub9Var = ub9Var6;
                            resources2 = resources;
                            accessibilityNodeInfo3 = accessibilityNodeInfoObtain;
                            j4 j4Var7 = j4Var;
                            spannableString2 = spannableString;
                            int length3 = str4.length();
                            arrayList5 = hf3.t;
                            if (list4 != null) {
                                arrayList6 = new ArrayList(list4.size());
                                size12 = list4.size();
                                for (i24 = 0; i24 < size12; i24++) {
                                    iw.c<? extends iw.a> cVar11 = list4.get(i24);
                                    cVar3 = cVar11;
                                    if (!(cVar3.a instanceof vya)) {
                                    }
                                }
                            } else {
                                arrayList6 = arrayList5;
                            }
                            size8 = arrayList6.size();
                            for (i16 = 0; i16 < size8; i16++) {
                                iw.c cVar12 = (iw.c) arrayList6.get(i16);
                                vyaVar = (vya) cVar12.a;
                                i22 = cVar12.b;
                                i23 = cVar12.c;
                                if (vyaVar instanceof xdb) {
                                    u.b();
                                    return j4Var2;
                                }
                                spannableString2.setSpan(new TtsSpan.VerbatimBuilder(((xdb) vyaVar).a).build(), i22, i23, 33);
                            }
                            int length4 = str4.length();
                            if (list4 != null) {
                                arrayList5 = new ArrayList(list4.size());
                                size11 = list4.size();
                                for (i21 = 0; i21 < size11; i21++) {
                                    iw.c<? extends iw.a> cVar13 = list4.get(i21);
                                    cVar2 = cVar13;
                                    if (!(cVar2.a instanceof c5b)) {
                                    }
                                }
                            }
                            size9 = arrayList5.size();
                            for (i17 = 0; i17 < size9; i17++) {
                                iw.c cVar14 = (iw.c) arrayList5.get(i17);
                                c5bVar = (c5b) cVar14.a;
                                int i314 = cVar14.b;
                                int i315 = cVar14.c;
                                weakHashMap2 = c1bVar.a;
                                uRLSpan = weakHashMap2.get(c5bVar);
                                if (uRLSpan == null) {
                                    uRLSpan = new URLSpan(c5bVar.a);
                                    weakHashMap2.put(c5bVar, uRLSpan);
                                }
                                spannableString2.setSpan(uRLSpan, i314, i315, 33);
                            }
                            listA = iwVarE.a(str4.length());
                            size10 = listA.size();
                            for (i18 = 0; i18 < size10; i18++) {
                                cVar = (iw.c) listA.get(i18);
                                i19 = cVar.b;
                                l86Var = cVar.a;
                                i20 = cVar.c;
                                if (i19 != i20) {
                                    l86Var2 = l86Var;
                                    if (l86Var2 instanceof l86.b) {
                                        weakHashMap = c1bVar.c;
                                        gs1Var = weakHashMap.get(cVar);
                                        if (gs1Var == null) {
                                            gs1Var = new gs1(l86Var2);
                                            weakHashMap.put(cVar, gs1Var);
                                        }
                                        spannableString2.setSpan(gs1Var, i19, i20, 33);
                                    } else {
                                        weakHashMap = c1bVar.c;
                                        gs1Var = weakHashMap.get(cVar);
                                        if (gs1Var == null) {
                                            gs1Var = new gs1(l86Var2);
                                            weakHashMap.put(cVar, gs1Var);
                                        }
                                        spannableString2.setSpan(gs1Var, i19, i20, 33);
                                    }
                                }
                            }
                            r1 = j4Var7;
                            r0 = (SpannableString) lm.G(spannableString2);
                        } else {
                            lb9Var2 = lb9Var;
                            ex8Var2 = ex8Var;
                            accessibilityNodeInfo2 = accessibilityNodeInfo;
                            ub9Var = ub9Var6;
                            c27Var = c27Var;
                            resources2 = resources;
                            accessibilityNodeInfo3 = accessibilityNodeInfoObtain;
                            r0 = j4Var2;
                            r1 = j4Var;
                        }
                        r1.s(r0);
                        gc9Var = ac9.M;
                        if (c37Var.b(gc9Var)) {
                            accessibilityNodeInfo4 = accessibilityNodeInfo3;
                            accessibilityNodeInfo4.setContentInvalid(true);
                            objD24 = c37Var.d(gc9Var);
                            if (objD24 == null) {
                                objD24 = j4Var2;
                            }
                            AccessibilityNodeInfo accessibilityNodeInfo10 = accessibilityNodeInfo2;
                            accessibilityNodeInfo10.setError((CharSequence) objD24);
                            r3 = accessibilityNodeInfo10;
                        } else {
                            r3 = accessibilityNodeInfo2;
                            accessibilityNodeInfo4 = accessibilityNodeInfo3;
                        }
                        ub9Var2 = ub9Var;
                        Resources resources6 = resources2;
                        strD = qm.d(ub9Var2, resources6);
                        if (Build.VERSION.SDK_INT >= 30) {
                            j4.b.b(r3, strD);
                        } else {
                            r3.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", strD);
                        }
                        r3.setCheckable(qm.c(ub9Var2));
                        objD2 = c37Var.d(ac9.K);
                        if (objD2 == null) {
                            objD2 = j4Var2;
                        }
                        fqaVar = (fqa) objD2;
                        if (fqaVar != null) {
                            if (fqaVar == fqa.t) {
                                r3.setChecked(true);
                            } else if (fqaVar == fqa.u) {
                                r3.setChecked(false);
                            }
                            g2b g2bVar27 = g2b.a;
                        }
                        objD3 = c37Var.d(ac9.J);
                        if (objD3 == null) {
                            objD3 = j4Var2;
                        }
                        bool = (Boolean) objD3;
                        if (bool != null) {
                            zBooleanValue2 = bool.booleanValue();
                            if (ex8Var2 == null) {
                                ex8Var3 = ex8Var2;
                                i6 = 4;
                            } else {
                                ex8Var3 = ex8Var2;
                                i6 = 4;
                                if (ex8Var3.a == 4) {
                                    accessibilityNodeInfo4.setSelected(zBooleanValue2);
                                }
                                g2b g2bVar28 = g2b.a;
                            }
                            r3.setChecked(zBooleanValue2);
                            g2b g2bVar29 = g2b.a;
                        } else {
                            ex8Var3 = ex8Var2;
                            i6 = 4;
                        }
                        lb9Var3 = lb9Var2;
                        if (lb9Var3.v) {
                            objD4 = c37Var.d(ac9.a);
                            if (objD4 == null) {
                                objD4 = j4Var2;
                            }
                            list = (List) objD4;
                            if (list != null) {
                                r7 = (String) th1.A(list);
                            } else {
                                r7 = j4Var2;
                            }
                            r3.setContentDescription(r7);
                        } else {
                            objD4 = c37Var.d(ac9.a);
                            if (objD4 == null) {
                                objD4 = j4Var2;
                            }
                            list = (List) objD4;
                            if (list != null) {
                                r7 = (String) th1.A(list);
                            } else {
                                r7 = j4Var2;
                            }
                            r3.setContentDescription(r7);
                        }
                        objD5 = c37Var.d(ac9.A);
                        if (objD5 == null) {
                            objD5 = j4Var2;
                        }
                        str = (String) objD5;
                        if (str != null) {
                            ub9VarL3 = ub9Var2;
                            while (true) {
                                if (ub9VarL3 != null) {
                                    zBooleanValue = false;
                                    break;
                                }
                                lb9Var4 = ub9VarL3.d;
                                gc9Var5 = bc9.a;
                                if (lb9Var4.t.b(gc9Var5)) {
                                    zBooleanValue = ((Boolean) lb9Var4.f(gc9Var5)).booleanValue();
                                    break;
                                }
                                ub9VarL3 = ub9VarL3.l();
                            }
                            if (zBooleanValue) {
                                accessibilityNodeInfo4.setViewIdResourceName(str);
                            }
                        }
                        objD6 = c37Var.d(ac9.h);
                        if (objD6 == null) {
                            objD6 = j4Var2;
                        }
                        if (((g2b) objD6) != null) {
                            r1.m(true);
                            g2b g2bVar30 = g2b.a;
                        }
                        objD7 = c37Var.d(ac9.i);
                        if (objD7 == null) {
                            objD7 = j4Var2;
                        }
                        if (((g2b) objD7) != null) {
                            r1.t();
                            g2b g2bVar31 = g2b.a;
                        }
                        i7 = i;
                        if (i7 != -1) {
                            iD3 = c27Var.d(ub9Var2.f);
                            if (iD3 != -1) {
                                accessibilityNodeInfo4.setDrawingOrder(iD3);
                                g2b g2bVar32 = g2b.a;
                            } else {
                                Log.w("AccessibilityDelegate", "Drawing order is not available, was AccessibilityNodeInfo requested for a child node before its parent?");
                            }
                        }
                        accessibilityNodeInfo4.setPassword(c37Var.b(ac9.L));
                        objD8 = c37Var.d(ac9.O);
                        if (objD8 == null) {
                            objD8 = j4Var2;
                        }
                        bool2 = Boolean.TRUE;
                        accessibilityNodeInfo4.setEditable(xj5.a(objD8, bool2));
                        objD9 = c37Var.d(ac9.P);
                        if (objD9 == null) {
                            objD9 = j4Var2;
                        }
                        num = (Integer) objD9;
                        if (num != null) {
                            iIntValue2 = num.intValue();
                        } else {
                            iIntValue2 = -1;
                        }
                        r3.setMaxTextLength(iIntValue2);
                        accessibilityNodeInfo4.setEnabled(qm.a(ub9Var2));
                        gc9Var2 = ac9.l;
                        accessibilityNodeInfo4.setFocusable(c37Var.b(gc9Var2));
                        if (accessibilityNodeInfo4.isFocusable()) {
                            accessibilityNodeInfo4.setFocused(((Boolean) lb9Var3.f(gc9Var2)).booleanValue());
                            if (accessibilityNodeInfo4.isFocused()) {
                                i8 = 2;
                                r1.a(2);
                                lm lmVar4 = lmVar2;
                                lmVar4.B = i7;
                                lmVar = lmVar4;
                            } else {
                                r10 = lmVar2;
                                i8 = 2;
                                z2 = true;
                                r1.a(1);
                            }
                            r3.setVisibleToUser(zb9.g(ub9Var2) ^ z2);
                            if (ub9Var2.o()) {
                                ub9VarL2 = ub9Var2.l();
                                ub9VarL2.getClass();
                            } else {
                                ub9VarL2 = ub9Var2;
                            }
                            if (ub9VarL2.m().f()) {
                                r3.setVisibleToUser(false);
                            }
                            objD10 = c37Var.d(ac9.k);
                            if (objD10 == null) {
                                objD10 = j4Var2;
                            }
                            nb6Var = (nb6) objD10;
                            if (nb6Var != null) {
                                i15 = nb6Var.a;
                                if (i15 != 0) {
                                    i8 = 1;
                                } else {
                                    i8 = 1;
                                }
                                accessibilityNodeInfo4.setLiveRegion(i8);
                                g2b g2bVar210 = g2b.a;
                            }
                            r3.setClickable(false);
                            objD11 = c37Var.d(kb9.b);
                            if (objD11 == null) {
                                objD11 = j4Var2;
                            }
                            k3Var = (k3) objD11;
                            if (k3Var != null) {
                                objD23 = c37Var.d(ac9.J);
                                if (objD23 == null) {
                                    objD23 = j4Var2;
                                }
                                boolean zA8 = xj5.a(objD23, bool2);
                                if (ex8Var3 == null) {
                                }
                                if (z4) {
                                    z5 = true;
                                } else {
                                    z5 = true;
                                }
                                r3.setClickable(z5);
                                if (qm.a(ub9Var2)) {
                                    r1.b(new j4.a(16, k3Var.a));
                                }
                                g2b g2bVar1110 = g2b.a;
                            }
                            r3.setLongClickable(false);
                            objD12 = c37Var.d(kb9.c);
                            if (objD12 == null) {
                                objD12 = j4Var2;
                            }
                            k3Var2 = (k3) objD12;
                            if (k3Var2 != null) {
                                r3.setLongClickable(true);
                                if (qm.a(ub9Var2)) {
                                    r1.b(new j4.a(32, k3Var2.a));
                                }
                                g2b g2bVar1111 = g2b.a;
                            }
                            objD13 = c37Var.d(kb9.q);
                            if (objD13 == null) {
                                objD13 = j4Var2;
                            }
                            k3Var3 = (k3) objD13;
                            if (k3Var3 != null) {
                                r1.b(new j4.a(16384, k3Var3.a));
                                g2b g2bVar1112 = g2b.a;
                            }
                            if (qm.a(ub9Var2)) {
                                k3Var9 = (k3) ia0.b(lb9Var3, kb9.k);
                                if (k3Var9 != null) {
                                    r1.b(new j4.a(2097152, k3Var9.a));
                                    g2b g2bVar1113 = g2b.a;
                                }
                                k3Var10 = (k3) ia0.b(lb9Var3, kb9.p);
                                if (k3Var10 != null) {
                                    r1.b(new j4.a(android.R.id.accessibilityActionImeEnter, k3Var10.a));
                                    g2b g2bVar1114 = g2b.a;
                                }
                                k3Var11 = (k3) ia0.b(lb9Var3, kb9.r);
                                if (k3Var11 != null) {
                                    r1.b(new j4.a(65536, k3Var11.a));
                                    g2b g2bVar1115 = g2b.a;
                                }
                                k3Var12 = (k3) ia0.b(lb9Var3, kb9.s);
                                if (k3Var12 != null) {
                                    if (accessibilityNodeInfo4.isFocused()) {
                                        primaryClipDescription = cmVar2.getClipboardManager().b().getPrimaryClipDescription();
                                        if (primaryClipDescription != null) {
                                            zHasMimeType = primaryClipDescription.hasMimeType("text/*");
                                        } else {
                                            zHasMimeType = false;
                                        }
                                        if (zHasMimeType) {
                                            r1.b(new j4.a(32768, k3Var12.a));
                                        }
                                    }
                                    g2b g2bVar1116 = g2b.a;
                                }
                            }
                            strK = lm.k(ub9Var2);
                            if (strK != null) {
                                accessibilityNodeInfo4.setTextSelection(r10.i(ub9Var2), r10.h(ub9Var2));
                                k3Var8 = (k3) ia0.b(lb9Var3, kb9.j);
                                if (k3Var8 != null) {
                                    r6 = k3Var8.a;
                                } else {
                                    r6 = j4Var2;
                                }
                                r1.b(new j4.a(131072, (String) r6));
                                r1.a(256);
                                r1.a(512);
                                r3.setMovementGranularities(11);
                                list3 = (List) ia0.b(lb9Var3, ac9.a);
                                if (list3 != null) {
                                    if (ub9Var2.d.t.b(ac9.G)) {
                                        objD22 = ub9Var2.d.t.d(ac9.l);
                                        if (objD22 == null) {
                                            objD22 = j4Var2;
                                        }
                                        if (xj5.a(objD22, Boolean.TRUE)) {
                                            I = ub9Var2.c.I();
                                            while (true) {
                                                if (I == 0) {
                                                    I = j4Var2;
                                                    break;
                                                }
                                                lb9VarR2 = I.r();
                                                if (lb9VarR2 == null) {
                                                }
                                                I = I.I();
                                            }
                                            if (I != 0) {
                                                lb9VarR = I.r();
                                                if (lb9VarR != null) {
                                                    objD21 = lb9VarR.t.d(ac9.l);
                                                    if (objD21 == null) {
                                                        objD21 = j4Var2;
                                                    }
                                                    zA3 = xj5.a(objD21, Boolean.TRUE);
                                                } else {
                                                    zA3 = false;
                                                }
                                                if (zA3) {
                                                }
                                            }
                                        }
                                    } else {
                                        I = ub9Var2.c.I();
                                        while (true) {
                                            if (I == 0) {
                                                I = j4Var2;
                                                break;
                                            }
                                            lb9VarR2 = I.r();
                                            if (lb9VarR2 == null) {
                                            }
                                            I = I.I();
                                        }
                                        if (I != 0) {
                                            lb9VarR = I.r();
                                            if (lb9VarR != null) {
                                                objD21 = lb9VarR.t.d(ac9.l);
                                                if (objD21 == null) {
                                                    objD21 = j4Var2;
                                                }
                                                zA3 = xj5.a(objD21, Boolean.TRUE);
                                            } else {
                                                zA3 = false;
                                            }
                                            if (zA3) {
                                            }
                                        }
                                    }
                                    if (!z3) {
                                        r3.setMovementGranularities(accessibilityNodeInfo4.getMovementGranularities() | 20);
                                    }
                                } else {
                                    if (ub9Var2.d.t.b(ac9.G)) {
                                        objD22 = ub9Var2.d.t.d(ac9.l);
                                        if (objD22 == null) {
                                            objD22 = j4Var2;
                                        }
                                        if (xj5.a(objD22, Boolean.TRUE)) {
                                            I = ub9Var2.c.I();
                                            while (true) {
                                                if (I == 0) {
                                                    I = j4Var2;
                                                    break;
                                                }
                                                lb9VarR2 = I.r();
                                                if (lb9VarR2 == null) {
                                                }
                                                I = I.I();
                                            }
                                            if (I != 0) {
                                                lb9VarR = I.r();
                                                if (lb9VarR != null) {
                                                    objD21 = lb9VarR.t.d(ac9.l);
                                                    if (objD21 == null) {
                                                        objD21 = j4Var2;
                                                    }
                                                    zA3 = xj5.a(objD21, Boolean.TRUE);
                                                } else {
                                                    zA3 = false;
                                                }
                                                if (zA3) {
                                                }
                                            }
                                        }
                                    } else {
                                        I = ub9Var2.c.I();
                                        while (true) {
                                            if (I == 0) {
                                                I = j4Var2;
                                                break;
                                            }
                                            lb9VarR2 = I.r();
                                            if (lb9VarR2 == null) {
                                            }
                                            I = I.I();
                                        }
                                        if (I != 0) {
                                            lb9VarR = I.r();
                                            if (lb9VarR != null) {
                                                objD21 = lb9VarR.t.d(ac9.l);
                                                if (objD21 == null) {
                                                    objD21 = j4Var2;
                                                }
                                                zA3 = xj5.a(objD21, Boolean.TRUE);
                                            } else {
                                                zA3 = false;
                                            }
                                            if (zA3) {
                                            }
                                        }
                                    }
                                    if (!z3) {
                                        r3.setMovementGranularities(accessibilityNodeInfo4.getMovementGranularities() | 20);
                                    }
                                }
                            }
                            if (Build.VERSION.SDK_INT >= 26) {
                                arrayList3 = new ArrayList();
                                arrayList3.add("androidx.compose.ui.semantics.id");
                                charSequenceF = r1.f();
                                if (charSequenceF != null) {
                                    arrayList3.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                                }
                                if (c37Var.b(ac9.A)) {
                                    arrayList3.add("androidx.compose.ui.semantics.testTag");
                                }
                                if (c37Var.b(ac9.Q)) {
                                    arrayList3.add("androidx.compose.ui.semantics.shapeType");
                                    arrayList3.add("androidx.compose.ui.semantics.shapeRect");
                                    arrayList3.add("androidx.compose.ui.semantics.shapeCorners");
                                    arrayList3.add("androidx.compose.ui.semantics.shapeRegion");
                                }
                                r1.h(arrayList3);
                            }
                            ud8Var = (ud8) ia0.b(lb9Var3, ac9.c);
                            if (ud8Var != null) {
                                f = ud8Var.a;
                                gg1Var = ud8Var.b;
                                gc9Var4 = kb9.i;
                                if (c37Var.b(gc9Var4)) {
                                    r1.j("android.widget.SeekBar");
                                } else {
                                    r1.j("android.widget.ProgressBar");
                                }
                                if (ud8Var != ud8.c) {
                                    gg1Var.getClass();
                                    accessibilityNodeInfo4.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, fValueOf.floatValue(), gg1Var.a().floatValue(), f));
                                }
                                if (c37Var.b(gc9Var4)) {
                                    fFloatValue = gg1Var.a().floatValue();
                                    fFloatValue2 = fValueOf.floatValue();
                                    if (fFloatValue < fFloatValue2) {
                                        fFloatValue = fFloatValue2;
                                    }
                                    if (f < fFloatValue) {
                                        r1.b(j4.a.i);
                                    }
                                    fFloatValue3 = fValueOf.floatValue();
                                    fFloatValue4 = gg1Var.a().floatValue();
                                    if (fFloatValue3 > fFloatValue4) {
                                        fFloatValue3 = fFloatValue4;
                                    }
                                    if (f > fFloatValue3) {
                                        r1.b(j4.a.j);
                                    }
                                }
                            }
                            if (qm.a(ub9Var2)) {
                                objD20 = ub9Var2.d.t.d(kb9.i);
                                if (objD20 == null) {
                                    objD20 = j4Var2;
                                }
                                k3Var7 = (k3) objD20;
                                if (k3Var7 != null) {
                                    r1.b(new j4.a(android.R.id.accessibilityActionSetProgress, k3Var7.a));
                                }
                            }
                            objD14 = ub9Var2.k().t.d(ac9.f);
                            if (objD14 == null) {
                                objD14 = j4Var2;
                            }
                            ah1Var = (ah1) objD14;
                            if (ah1Var != null) {
                                r1.k(j4.g.a(ah1Var.a, ah1Var.b, 0));
                            } else {
                                arrayList = new ArrayList();
                                objD15 = ub9Var2.k().t.d(ac9.e);
                                if (objD15 == null) {
                                    objD15 = j4Var2;
                                }
                                if (objD15 != null) {
                                    listJ2 = ub9.j(4, ub9Var2);
                                    size4 = listJ2.size();
                                    for (i9 = 0; i9 < size4; i9++) {
                                        ub9Var3 = (ub9) listJ2.get(i9);
                                        if (ub9Var3.k().t.b(ac9.J)) {
                                            arrayList.add(ub9Var3);
                                        }
                                    }
                                }
                                if (!arrayList.isEmpty()) {
                                    zA2 = bh1.a(arrayList);
                                    if (zA2) {
                                        size2 = 1;
                                    } else {
                                        size2 = arrayList.size();
                                    }
                                    if (zA2) {
                                        size3 = arrayList.size();
                                    } else {
                                        size3 = 1;
                                    }
                                    r1.k(j4.g.a(size2, size3, 0));
                                }
                            }
                            bh1.b(r1, ub9Var2);
                            c69Var = (c69) ia0.b(lb9Var3, ac9.v);
                            k3 k3Var15 = (k3) ia0.b(lb9Var3, kb9.d);
                            if (c69Var != null) {
                                objD18 = ub9Var2.k().t.d(ac9.f);
                                if (objD18 == null) {
                                    objD18 = j4Var2;
                                }
                                if (objD18 == null) {
                                    objD19 = ub9Var2.k().t.d(ac9.e);
                                    if (objD19 == null) {
                                        objD19 = j4Var2;
                                    }
                                    if (objD19 == null) {
                                        r1.j("android.widget.HorizontalScrollView");
                                    }
                                }
                                if (c69Var.b.invoke().floatValue() > 0) {
                                    r1.q(true);
                                }
                                if (qm.a(ub9Var2)) {
                                    zQ = lm.q(c69Var);
                                    tq5Var = tq5.u;
                                    if (zQ) {
                                        r1.b(j4.a.i);
                                        qr5Var = qr5Var2;
                                        if (qr5Var.S == tq5Var) {
                                            aVar2 = j4.a.o;
                                        } else {
                                            aVar2 = j4.a.q;
                                        }
                                        r1.b(aVar2);
                                    } else {
                                        qr5Var = qr5Var2;
                                    }
                                    if (lm.p(c69Var)) {
                                        r1.b(j4.a.j);
                                        if (qr5Var.S == tq5Var) {
                                            aVar = j4.a.q;
                                        } else {
                                            aVar = j4.a.o;
                                        }
                                        r1.b(aVar);
                                    }
                                }
                            }
                            c69Var2 = (c69) ia0.b(ub9Var2.n(), ac9.w);
                            if (c69Var2 != null) {
                                objD16 = ub9Var2.k().t.d(ac9.f);
                                if (objD16 == null) {
                                    objD16 = j4Var2;
                                }
                                if (objD16 == null) {
                                    objD17 = ub9Var2.k().t.d(ac9.e);
                                    if (objD17 == null) {
                                        objD17 = j4Var2;
                                    }
                                    if (objD17 == null) {
                                        r1.j("android.widget.ScrollView");
                                    }
                                }
                                if (c69Var2.b.invoke().floatValue() > r1) {
                                    r1.q(true);
                                }
                                if (qm.a(ub9Var2)) {
                                    if (lm.q(c69Var2)) {
                                        r1.b(j4.a.i);
                                        r1.b(j4.a.p);
                                    }
                                    if (lm.p(c69Var2)) {
                                        r1.b(j4.a.j);
                                        r1.b(j4.a.n);
                                    }
                                }
                            }
                            if (Build.VERSION.SDK_INT >= 29) {
                                b.a(r1, ub9Var2);
                            }
                            r1.o((CharSequence) ia0.b(ub9Var2.n(), ac9.d));
                            if (qm.a(ub9Var2)) {
                                k3Var4 = (k3) ia0.b(ub9Var2.n(), kb9.t);
                                if (k3Var4 != null) {
                                    r1.b(new j4.a(262144, k3Var4.a));
                                    g2b g2bVar1117 = g2b.a;
                                }
                                k3Var5 = (k3) ia0.b(ub9Var2.n(), kb9.u);
                                if (k3Var5 != null) {
                                    r1.b(new j4.a(524288, k3Var5.a));
                                    g2b g2bVar1118 = g2b.a;
                                }
                                k3Var6 = (k3) ia0.b(ub9Var2.n(), kb9.v);
                                if (k3Var6 != null) {
                                    r1.b(new j4.a(1048576, k3Var6.a));
                                    g2b g2bVar1119 = g2b.a;
                                }
                                lb9VarN = ub9Var2.n();
                                gc9Var3 = kb9.x;
                                if (lb9VarN.t.b(kb9.x)) {
                                    list2 = (List) ub9Var2.n().f(gc9Var3);
                                    d27Var3 = d27Var2;
                                    if (list2.size() < d27Var3.b) {
                                        aa0.c(i34.b(d27Var3.b, " custom actions for one widget", new StringBuilder("Can't have more than ")));
                                        return null;
                                    }
                                    fx9Var3 = new fx9(0);
                                    s27VarA = je7.a();
                                    fx9Var4 = fx9Var2;
                                    if (fx9Var4.b(i7)) {
                                        s27VarC = fx9Var4.c(i7);
                                        d27Var4 = new d27();
                                        iArr = d27Var3.a;
                                        i11 = d27Var3.b;
                                        for (i12 = 0; i12 < i11; i12++) {
                                            d27Var4.c(iArr[i12]);
                                        }
                                        arrayList2 = new ArrayList();
                                        size6 = list2.size();
                                        i13 = 0;
                                        while (i13 < size6) {
                                            dd2Var = (dd2) list2.get(i13);
                                            s27VarC.getClass();
                                            dd2Var.getClass();
                                            int i42 = size6;
                                            r13 = j4Var2;
                                            if (s27VarC.d(r13) >= 0) {
                                                int iE3 = s27VarC.e(r13);
                                                fx9Var3.e(iE3, r13);
                                                s27VarA.h(iE3, r13);
                                                d27Var4.e(iE3);
                                                r1.b(new j4.a(iE3, (String) r13));
                                                g2b g2bVar211 = g2b.a;
                                            } else {
                                                arrayList2.add(dd2Var);
                                            }
                                            i13++;
                                            size6 = i42;
                                            s27VarC = s27VarC;
                                            j4Var2 = null;
                                        }
                                        size7 = arrayList2.size();
                                        for (i14 = 0; i14 < size7; i14++) {
                                            dd2 dd2Var6 = (dd2) arrayList2.get(i14);
                                            int iA5 = d27Var4.a(i14);
                                            dd2Var6.getClass();
                                            fx9Var3.e(iA5, null);
                                            s27VarA.h(iA5, null);
                                            r1.b(new j4.a(iA5, (String) null));
                                        }
                                    } else {
                                        size5 = list2.size();
                                        for (i10 = 0; i10 < size5; i10++) {
                                            dd2 dd2Var7 = (dd2) list2.get(i10);
                                            int iA6 = d27Var3.a(i10);
                                            dd2Var7.getClass();
                                            fx9Var3.e(iA6, null);
                                            s27VarA.h(iA6, null);
                                            r1.b(new j4.a(iA6, (String) null));
                                        }
                                    }
                                    r10.H.e(i7, fx9Var3);
                                    fx9Var4.e(i7, s27VarA);
                                }
                            }
                            r1.p(qm.b(ub9Var2, resources6));
                            iD = r10.R.d(i7);
                            if (iD != -1) {
                                btVarB2 = kc9.b(cmVar2.getAndroidViewsHandler$ui(), iD);
                                if (btVarB2 != null) {
                                    r3.setTraversalBefore(btVarB2);
                                    cmVar = cmVar2;
                                } else {
                                    cmVar = cmVar2;
                                    r3.setTraversalBefore(cmVar, iD);
                                }
                                bundle = null;
                                r10.a(i7, r1, r10.T, null);
                            } else {
                                cmVar = cmVar2;
                                bundle = null;
                            }
                            iD2 = r10.S.d(i7);
                            if (iD2 != -1) {
                                r3.setTraversalAfter(btVarB);
                                r10.a(i7, r1, r10.U, bundle);
                            }
                            str2 = (String) ia0.b(ub9Var2.n(), bc9.b);
                            if (str2 != null) {
                                r1.j(str2);
                                g2b g2bVar212 = g2b.a;
                            }
                            r8 = r1;
                            r11 = r10;
                        } else {
                            lmVar = lmVar2;
                            i8 = 2;
                        }
                        z2 = true;
                        r10 = lmVar;
                        r3.setVisibleToUser(zb9.g(ub9Var2) ^ z2);
                        if (ub9Var2.o()) {
                            ub9VarL2 = ub9Var2.l();
                            ub9VarL2.getClass();
                        } else {
                            ub9VarL2 = ub9Var2;
                        }
                        if (ub9VarL2.m().f()) {
                            r3.setVisibleToUser(false);
                        }
                        objD10 = c37Var.d(ac9.k);
                        if (objD10 == null) {
                            objD10 = j4Var2;
                        }
                        nb6Var = (nb6) objD10;
                        if (nb6Var != null) {
                            i15 = nb6Var.a;
                            if (i15 != 0) {
                                i8 = 1;
                            } else {
                                i8 = 1;
                            }
                            accessibilityNodeInfo4.setLiveRegion(i8);
                            g2b g2bVar213 = g2b.a;
                        }
                        r3.setClickable(false);
                        objD11 = c37Var.d(kb9.b);
                        if (objD11 == null) {
                            objD11 = j4Var2;
                        }
                        k3Var = (k3) objD11;
                        if (k3Var != null) {
                            objD23 = c37Var.d(ac9.J);
                            if (objD23 == null) {
                                objD23 = j4Var2;
                            }
                            boolean zA9 = xj5.a(objD23, bool2);
                            if (ex8Var3 == null) {
                            }
                            if (z4) {
                                z5 = true;
                            } else {
                                z5 = true;
                            }
                            r3.setClickable(z5);
                            if (qm.a(ub9Var2)) {
                                r1.b(new j4.a(16, k3Var.a));
                            }
                            g2b g2bVar11110 = g2b.a;
                        }
                        r3.setLongClickable(false);
                        objD12 = c37Var.d(kb9.c);
                        if (objD12 == null) {
                            objD12 = j4Var2;
                        }
                        k3Var2 = (k3) objD12;
                        if (k3Var2 != null) {
                            r3.setLongClickable(true);
                            if (qm.a(ub9Var2)) {
                                r1.b(new j4.a(32, k3Var2.a));
                            }
                            g2b g2bVar11111 = g2b.a;
                        }
                        objD13 = c37Var.d(kb9.q);
                        if (objD13 == null) {
                            objD13 = j4Var2;
                        }
                        k3Var3 = (k3) objD13;
                        if (k3Var3 != null) {
                            r1.b(new j4.a(16384, k3Var3.a));
                            g2b g2bVar11112 = g2b.a;
                        }
                        if (qm.a(ub9Var2)) {
                            k3Var9 = (k3) ia0.b(lb9Var3, kb9.k);
                            if (k3Var9 != null) {
                                r1.b(new j4.a(2097152, k3Var9.a));
                                g2b g2bVar11113 = g2b.a;
                            }
                            k3Var10 = (k3) ia0.b(lb9Var3, kb9.p);
                            if (k3Var10 != null) {
                                r1.b(new j4.a(android.R.id.accessibilityActionImeEnter, k3Var10.a));
                                g2b g2bVar11114 = g2b.a;
                            }
                            k3Var11 = (k3) ia0.b(lb9Var3, kb9.r);
                            if (k3Var11 != null) {
                                r1.b(new j4.a(65536, k3Var11.a));
                                g2b g2bVar11115 = g2b.a;
                            }
                            k3Var12 = (k3) ia0.b(lb9Var3, kb9.s);
                            if (k3Var12 != null) {
                                if (accessibilityNodeInfo4.isFocused()) {
                                    primaryClipDescription = cmVar2.getClipboardManager().b().getPrimaryClipDescription();
                                    if (primaryClipDescription != null) {
                                        zHasMimeType = primaryClipDescription.hasMimeType("text/*");
                                    } else {
                                        zHasMimeType = false;
                                    }
                                    if (zHasMimeType) {
                                        r1.b(new j4.a(32768, k3Var12.a));
                                    }
                                }
                                g2b g2bVar11116 = g2b.a;
                            }
                        }
                        strK = lm.k(ub9Var2);
                        if (strK != null) {
                            accessibilityNodeInfo4.setTextSelection(r10.i(ub9Var2), r10.h(ub9Var2));
                            k3Var8 = (k3) ia0.b(lb9Var3, kb9.j);
                            if (k3Var8 != null) {
                                r6 = k3Var8.a;
                            } else {
                                r6 = j4Var2;
                            }
                            r1.b(new j4.a(131072, (String) r6));
                            r1.a(256);
                            r1.a(512);
                            r3.setMovementGranularities(11);
                            list3 = (List) ia0.b(lb9Var3, ac9.a);
                            if (list3 != null) {
                                if (ub9Var2.d.t.b(ac9.G)) {
                                    objD22 = ub9Var2.d.t.d(ac9.l);
                                    if (objD22 == null) {
                                        objD22 = j4Var2;
                                    }
                                    if (xj5.a(objD22, Boolean.TRUE)) {
                                        I = ub9Var2.c.I();
                                        while (true) {
                                            if (I == 0) {
                                                I = j4Var2;
                                                break;
                                            }
                                            lb9VarR2 = I.r();
                                            if (lb9VarR2 == null) {
                                            }
                                            I = I.I();
                                        }
                                        if (I != 0) {
                                            lb9VarR = I.r();
                                            if (lb9VarR != null) {
                                                objD21 = lb9VarR.t.d(ac9.l);
                                                if (objD21 == null) {
                                                    objD21 = j4Var2;
                                                }
                                                zA3 = xj5.a(objD21, Boolean.TRUE);
                                            } else {
                                                zA3 = false;
                                            }
                                            if (zA3) {
                                            }
                                        }
                                    }
                                } else {
                                    I = ub9Var2.c.I();
                                    while (true) {
                                        if (I == 0) {
                                            I = j4Var2;
                                            break;
                                        }
                                        lb9VarR2 = I.r();
                                        if (lb9VarR2 == null) {
                                        }
                                        I = I.I();
                                    }
                                    if (I != 0) {
                                        lb9VarR = I.r();
                                        if (lb9VarR != null) {
                                            objD21 = lb9VarR.t.d(ac9.l);
                                            if (objD21 == null) {
                                                objD21 = j4Var2;
                                            }
                                            zA3 = xj5.a(objD21, Boolean.TRUE);
                                        } else {
                                            zA3 = false;
                                        }
                                        if (zA3) {
                                        }
                                    }
                                }
                                if (!z3) {
                                    r3.setMovementGranularities(accessibilityNodeInfo4.getMovementGranularities() | 20);
                                }
                            } else {
                                if (ub9Var2.d.t.b(ac9.G)) {
                                    objD22 = ub9Var2.d.t.d(ac9.l);
                                    if (objD22 == null) {
                                        objD22 = j4Var2;
                                    }
                                    if (xj5.a(objD22, Boolean.TRUE)) {
                                        I = ub9Var2.c.I();
                                        while (true) {
                                            if (I == 0) {
                                                I = j4Var2;
                                                break;
                                            }
                                            lb9VarR2 = I.r();
                                            if (lb9VarR2 == null) {
                                            }
                                            I = I.I();
                                        }
                                        if (I != 0) {
                                            lb9VarR = I.r();
                                            if (lb9VarR != null) {
                                                objD21 = lb9VarR.t.d(ac9.l);
                                                if (objD21 == null) {
                                                    objD21 = j4Var2;
                                                }
                                                zA3 = xj5.a(objD21, Boolean.TRUE);
                                            } else {
                                                zA3 = false;
                                            }
                                            if (zA3) {
                                            }
                                        }
                                    }
                                } else {
                                    I = ub9Var2.c.I();
                                    while (true) {
                                        if (I == 0) {
                                            I = j4Var2;
                                            break;
                                        }
                                        lb9VarR2 = I.r();
                                        if (lb9VarR2 == null) {
                                        }
                                        I = I.I();
                                    }
                                    if (I != 0) {
                                        lb9VarR = I.r();
                                        if (lb9VarR != null) {
                                            objD21 = lb9VarR.t.d(ac9.l);
                                            if (objD21 == null) {
                                                objD21 = j4Var2;
                                            }
                                            zA3 = xj5.a(objD21, Boolean.TRUE);
                                        } else {
                                            zA3 = false;
                                        }
                                        if (zA3) {
                                        }
                                    }
                                }
                                if (!z3) {
                                    r3.setMovementGranularities(accessibilityNodeInfo4.getMovementGranularities() | 20);
                                }
                            }
                        }
                        if (Build.VERSION.SDK_INT >= 26) {
                            arrayList3 = new ArrayList();
                            arrayList3.add("androidx.compose.ui.semantics.id");
                            charSequenceF = r1.f();
                            if (charSequenceF != null) {
                                arrayList3.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                            }
                            if (c37Var.b(ac9.A)) {
                                arrayList3.add("androidx.compose.ui.semantics.testTag");
                            }
                            if (c37Var.b(ac9.Q)) {
                                arrayList3.add("androidx.compose.ui.semantics.shapeType");
                                arrayList3.add("androidx.compose.ui.semantics.shapeRect");
                                arrayList3.add("androidx.compose.ui.semantics.shapeCorners");
                                arrayList3.add("androidx.compose.ui.semantics.shapeRegion");
                            }
                            r1.h(arrayList3);
                        }
                        ud8Var = (ud8) ia0.b(lb9Var3, ac9.c);
                        if (ud8Var != null) {
                            f = ud8Var.a;
                            gg1Var = ud8Var.b;
                            gc9Var4 = kb9.i;
                            if (c37Var.b(gc9Var4)) {
                                r1.j("android.widget.SeekBar");
                            } else {
                                r1.j("android.widget.ProgressBar");
                            }
                            if (ud8Var != ud8.c) {
                                gg1Var.getClass();
                                accessibilityNodeInfo4.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, fValueOf.floatValue(), gg1Var.a().floatValue(), f));
                            }
                            if (c37Var.b(gc9Var4)) {
                                fFloatValue = gg1Var.a().floatValue();
                                fFloatValue2 = fValueOf.floatValue();
                                if (fFloatValue < fFloatValue2) {
                                    fFloatValue = fFloatValue2;
                                }
                                if (f < fFloatValue) {
                                    r1.b(j4.a.i);
                                }
                                fFloatValue3 = fValueOf.floatValue();
                                fFloatValue4 = gg1Var.a().floatValue();
                                if (fFloatValue3 > fFloatValue4) {
                                    fFloatValue3 = fFloatValue4;
                                }
                                if (f > fFloatValue3) {
                                    r1.b(j4.a.j);
                                }
                            }
                        }
                        if (qm.a(ub9Var2)) {
                            objD20 = ub9Var2.d.t.d(kb9.i);
                            if (objD20 == null) {
                                objD20 = j4Var2;
                            }
                            k3Var7 = (k3) objD20;
                            if (k3Var7 != null) {
                                r1.b(new j4.a(android.R.id.accessibilityActionSetProgress, k3Var7.a));
                            }
                        }
                        objD14 = ub9Var2.k().t.d(ac9.f);
                        if (objD14 == null) {
                            objD14 = j4Var2;
                        }
                        ah1Var = (ah1) objD14;
                        if (ah1Var != null) {
                            r1.k(j4.g.a(ah1Var.a, ah1Var.b, 0));
                        } else {
                            arrayList = new ArrayList();
                            objD15 = ub9Var2.k().t.d(ac9.e);
                            if (objD15 == null) {
                                objD15 = j4Var2;
                            }
                            if (objD15 != null) {
                                listJ2 = ub9.j(4, ub9Var2);
                                size4 = listJ2.size();
                                while (i9 < size4) {
                                    ub9Var3 = (ub9) listJ2.get(i9);
                                    if (ub9Var3.k().t.b(ac9.J)) {
                                        arrayList.add(ub9Var3);
                                    }
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                zA2 = bh1.a(arrayList);
                                if (zA2) {
                                    size2 = 1;
                                } else {
                                    size2 = arrayList.size();
                                }
                                if (zA2) {
                                    size3 = arrayList.size();
                                } else {
                                    size3 = 1;
                                }
                                r1.k(j4.g.a(size2, size3, 0));
                            }
                        }
                        bh1.b(r1, ub9Var2);
                        c69Var = (c69) ia0.b(lb9Var3, ac9.v);
                        k3 k3Var16 = (k3) ia0.b(lb9Var3, kb9.d);
                        if (c69Var != null) {
                            objD18 = ub9Var2.k().t.d(ac9.f);
                            if (objD18 == null) {
                                objD18 = j4Var2;
                            }
                            if (objD18 == null) {
                                objD19 = ub9Var2.k().t.d(ac9.e);
                                if (objD19 == null) {
                                    objD19 = j4Var2;
                                }
                                if (objD19 == null) {
                                    r1.j("android.widget.HorizontalScrollView");
                                }
                            }
                            if (c69Var.b.invoke().floatValue() > 0) {
                                r1.q(true);
                            }
                            if (qm.a(ub9Var2)) {
                                zQ = lm.q(c69Var);
                                tq5Var = tq5.u;
                                if (zQ) {
                                    r1.b(j4.a.i);
                                    qr5Var = qr5Var2;
                                    if (qr5Var.S == tq5Var) {
                                        aVar2 = j4.a.o;
                                    } else {
                                        aVar2 = j4.a.q;
                                    }
                                    r1.b(aVar2);
                                } else {
                                    qr5Var = qr5Var2;
                                }
                                if (lm.p(c69Var)) {
                                    r1.b(j4.a.j);
                                    if (qr5Var.S == tq5Var) {
                                        aVar = j4.a.q;
                                    } else {
                                        aVar = j4.a.o;
                                    }
                                    r1.b(aVar);
                                }
                            }
                        }
                        c69Var2 = (c69) ia0.b(ub9Var2.n(), ac9.w);
                        if (c69Var2 != null) {
                            objD16 = ub9Var2.k().t.d(ac9.f);
                            if (objD16 == null) {
                                objD16 = j4Var2;
                            }
                            if (objD16 == null) {
                                objD17 = ub9Var2.k().t.d(ac9.e);
                                if (objD17 == null) {
                                    objD17 = j4Var2;
                                }
                                if (objD17 == null) {
                                    r1.j("android.widget.ScrollView");
                                }
                            }
                            if (c69Var2.b.invoke().floatValue() > r1) {
                                r1.q(true);
                            }
                            if (qm.a(ub9Var2)) {
                                if (lm.q(c69Var2)) {
                                    r1.b(j4.a.i);
                                    r1.b(j4.a.p);
                                }
                                if (lm.p(c69Var2)) {
                                    r1.b(j4.a.j);
                                    r1.b(j4.a.n);
                                }
                            }
                        }
                        if (Build.VERSION.SDK_INT >= 29) {
                            b.a(r1, ub9Var2);
                        }
                        r1.o((CharSequence) ia0.b(ub9Var2.n(), ac9.d));
                        if (qm.a(ub9Var2)) {
                            k3Var4 = (k3) ia0.b(ub9Var2.n(), kb9.t);
                            if (k3Var4 != null) {
                                r1.b(new j4.a(262144, k3Var4.a));
                                g2b g2bVar11117 = g2b.a;
                            }
                            k3Var5 = (k3) ia0.b(ub9Var2.n(), kb9.u);
                            if (k3Var5 != null) {
                                r1.b(new j4.a(524288, k3Var5.a));
                                g2b g2bVar11118 = g2b.a;
                            }
                            k3Var6 = (k3) ia0.b(ub9Var2.n(), kb9.v);
                            if (k3Var6 != null) {
                                r1.b(new j4.a(1048576, k3Var6.a));
                                g2b g2bVar11119 = g2b.a;
                            }
                            lb9VarN = ub9Var2.n();
                            gc9Var3 = kb9.x;
                            if (lb9VarN.t.b(kb9.x)) {
                                list2 = (List) ub9Var2.n().f(gc9Var3);
                                d27Var3 = d27Var2;
                                if (list2.size() < d27Var3.b) {
                                    aa0.c(i34.b(d27Var3.b, " custom actions for one widget", new StringBuilder("Can't have more than ")));
                                    return null;
                                }
                                fx9Var3 = new fx9(0);
                                s27VarA = je7.a();
                                fx9Var4 = fx9Var2;
                                if (fx9Var4.b(i7)) {
                                    s27VarC = fx9Var4.c(i7);
                                    d27Var4 = new d27();
                                    iArr = d27Var3.a;
                                    i11 = d27Var3.b;
                                    while (i12 < i11) {
                                        d27Var4.c(iArr[i12]);
                                    }
                                    arrayList2 = new ArrayList();
                                    size6 = list2.size();
                                    i13 = 0;
                                    while (i13 < size6) {
                                        dd2Var = (dd2) list2.get(i13);
                                        s27VarC.getClass();
                                        dd2Var.getClass();
                                        int i43 = size6;
                                        r13 = j4Var2;
                                        if (s27VarC.d(r13) >= 0) {
                                            int iE4 = s27VarC.e(r13);
                                            fx9Var3.e(iE4, r13);
                                            s27VarA.h(iE4, r13);
                                            d27Var4.e(iE4);
                                            r1.b(new j4.a(iE4, (String) r13));
                                            g2b g2bVar214 = g2b.a;
                                        } else {
                                            arrayList2.add(dd2Var);
                                        }
                                        i13++;
                                        size6 = i43;
                                        s27VarC = s27VarC;
                                        j4Var2 = null;
                                    }
                                    size7 = arrayList2.size();
                                    while (i14 < size7) {
                                        dd2 dd2Var8 = (dd2) arrayList2.get(i14);
                                        int iA7 = d27Var4.a(i14);
                                        dd2Var8.getClass();
                                        fx9Var3.e(iA7, null);
                                        s27VarA.h(iA7, null);
                                        r1.b(new j4.a(iA7, (String) null));
                                    }
                                } else {
                                    size5 = list2.size();
                                    while (i10 < size5) {
                                        dd2 dd2Var9 = (dd2) list2.get(i10);
                                        int iA8 = d27Var3.a(i10);
                                        dd2Var9.getClass();
                                        fx9Var3.e(iA8, null);
                                        s27VarA.h(iA8, null);
                                        r1.b(new j4.a(iA8, (String) null));
                                    }
                                }
                                r10.H.e(i7, fx9Var3);
                                fx9Var4.e(i7, s27VarA);
                            }
                        }
                        r1.p(qm.b(ub9Var2, resources6));
                        iD = r10.R.d(i7);
                        if (iD != -1) {
                            btVarB2 = kc9.b(cmVar2.getAndroidViewsHandler$ui(), iD);
                            if (btVarB2 != null) {
                                r3.setTraversalBefore(btVarB2);
                                cmVar = cmVar2;
                            } else {
                                cmVar = cmVar2;
                                r3.setTraversalBefore(cmVar, iD);
                            }
                            bundle = null;
                            r10.a(i7, r1, r10.T, null);
                        } else {
                            cmVar = cmVar2;
                            bundle = null;
                        }
                        iD2 = r10.S.d(i7);
                        if (iD2 != -1) {
                            r3.setTraversalAfter(btVarB);
                            r10.a(i7, r1, r10.U, bundle);
                        }
                        str2 = (String) ia0.b(ub9Var2.n(), bc9.b);
                        if (str2 != null) {
                            r1.j(str2);
                            g2b g2bVar215 = g2b.a;
                        }
                        r8 = r1;
                        r11 = r10;
                    } else {
                        i7 = i;
                        r11 = lmVar2;
                        r8 = 0;
                    }
                }
            }
            if (r11.E) {
                if (i7 == r11.A) {
                    r11.C = r8;
                }
                if (i7 == r11.B) {
                    r11.D = r8;
                }
            }
            return r8;
        }

        @Override // defpackage.k4
        public final j4 c(int i) {
            lm lmVar = lm.this;
            if (i != 1) {
                if (i == 2) {
                    return b(lmVar.A);
                }
                z90.a(pp2.a(i, "Unknown focus type: "));
                return null;
            }
            int i2 = lmVar.B;
            if (i2 == Integer.MIN_VALUE) {
                return null;
            }
            return b(i2);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:157:0x025b  */
        /* JADX WARN: Code duplicated, block: B:18:0x0052  */
        /* JADX WARN: Code duplicated, block: B:20:0x0058  */
        /* JADX WARN: Code duplicated, block: B:22:0x005c  */
        /* JADX WARN: Code duplicated, block: B:269:0x042a  */
        /* JADX WARN: Code duplicated, block: B:270:0x042c  */
        /* JADX WARN: Code duplicated, block: B:273:0x0431  */
        /* JADX WARN: Code duplicated, block: B:274:0x0433  */
        /* JADX WARN: Code duplicated, block: B:277:0x0439  */
        /* JADX WARN: Code duplicated, block: B:278:0x043b  */
        /* JADX WARN: Code duplicated, block: B:281:0x0441  */
        /* JADX WARN: Code duplicated, block: B:282:0x0443  */
        /* JADX WARN: Code duplicated, block: B:285:0x0449  */
        /* JADX WARN: Code duplicated, block: B:286:0x044b  */
        /* JADX WARN: Code duplicated, block: B:289:0x0451  */
        /* JADX WARN: Code duplicated, block: B:290:0x0453  */
        /* JADX WARN: Code duplicated, block: B:297:0x045f  */
        /* JADX WARN: Code duplicated, block: B:306:0x046e  */
        /* JADX WARN: Code duplicated, block: B:308:0x0476  */
        /* JADX WARN: Code duplicated, block: B:311:0x0481  */
        /* JADX WARN: Code duplicated, block: B:314:0x0486  */
        /* JADX WARN: Code duplicated, block: B:316:0x048a  */
        /* JADX WARN: Code duplicated, block: B:318:0x049c  */
        /* JADX WARN: Code duplicated, block: B:321:0x04af  */
        /* JADX WARN: Code duplicated, block: B:324:0x04b6  */
        /* JADX WARN: Code duplicated, block: B:327:0x04bd  */
        /* JADX WARN: Code duplicated, block: B:329:0x04cf  */
        /* JADX WARN: Code duplicated, block: B:331:0x04e8  */
        /* JADX WARN: Code duplicated, block: B:334:0x04ed  */
        /* JADX WARN: Code duplicated, block: B:339:0x0507  */
        /* JADX WARN: Code duplicated, block: B:342:0x0510  */
        /* JADX WARN: Code duplicated, block: B:346:0x0517  */
        /* JADX WARN: Code duplicated, block: B:348:0x0521  */
        /* JADX WARN: Code duplicated, block: B:351:0x0526 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:391:0x05a2  */
        /* JADX WARN: Code duplicated, block: B:394:0x05ac  */
        /* JADX WARN: Code duplicated, block: B:397:0x05b1 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:399:0x05b5  */
        /* JADX WARN: Code duplicated, block: B:400:0x05ba  */
        /* JADX WARN: Code duplicated, block: B:402:0x05c3 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:403:0x05c5  */
        /* JADX WARN: Code duplicated, block: B:406:0x05cc  */
        /* JADX WARN: Code duplicated, block: B:408:0x05d4  */
        /* JADX WARN: Code duplicated, block: B:415:0x05f0  */
        /* JADX WARN: Code duplicated, block: B:417:0x05f4  */
        /* JADX WARN: Code duplicated, block: B:419:0x05fc  */
        /* JADX WARN: Code duplicated, block: B:420:0x05fe  */
        /* JADX WARN: Code duplicated, block: B:422:0x0602  */
        /* JADX WARN: Code duplicated, block: B:424:0x0608  */
        /* JADX WARN: Code duplicated, block: B:425:0x060a  */
        /* JADX WARN: Code duplicated, block: B:428:0x060f  */
        /* JADX WARN: Code duplicated, block: B:495:0x06f3 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:496:0x06f5  */
        /* JADX WARN: Code duplicated, block: B:498:0x0703  */
        /* JADX WARN: Code duplicated, block: B:499:0x0705  */
        /* JADX WARN: Code duplicated, block: B:503:0x070b  */
        /* JADX WARN: Code duplicated, block: B:505:0x0711  */
        /* JADX WARN: Code duplicated, block: B:508:0x071f  */
        /* JADX WARN: Code duplicated, block: B:513:0x072d  */
        /* JADX WARN: Code duplicated, block: B:526:0x0746  */
        /* JADX WARN: Code duplicated, block: B:531:0x075e  */
        /* JADX WARN: Code duplicated, block: B:538:0x0770  */
        /* JADX WARN: Code duplicated, block: B:540:0x0774  */
        /* JADX WARN: Code duplicated, block: B:542:0x0787  */
        /* JADX WARN: Code duplicated, block: B:544:0x078b  */
        /* JADX WARN: Code duplicated, block: B:564:0x0812  */
        /* JADX WARN: Code duplicated, block: B:566:0x0818 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:567:0x081a  */
        /* JADX WARN: Code duplicated, block: B:568:0x081c  */
        /* JADX WARN: Code duplicated, block: B:571:0x0823  */
        /* JADX WARN: Code duplicated, block: B:572:0x0828  */
        /* JADX WARN: Code duplicated, block: B:575:0x0830  */
        /* JADX WARN: Code duplicated, block: B:577:0x0838  */
        /* JADX WARN: Code duplicated, block: B:589:0x0859 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:590:0x085b  */
        /* JADX WARN: Code duplicated, block: B:591:0x085d  */
        /* JADX WARN: Code duplicated, block: B:594:0x0861  */
        /* JADX WARN: Code duplicated, block: B:595:0x0863  */
        /* JADX WARN: Code duplicated, block: B:598:0x0877  */
        /* JADX WARN: Code duplicated, block: B:600:0x087c  */
        /* JADX WARN: Code duplicated, block: B:602:0x088c A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:604:0x088f  */
        /* JADX WARN: Code duplicated, block: B:94:0x013b  */
        /* JADX WARN: Code restructure failed: missing block: B:617:0x01af, code lost:
        
            r1 = null;
         */
        /* JADX WARN: Instruction removed from duplicated block: B:22:0x005c, please report this as an issue */
        @Override // defpackage.k4
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean d(int r23, int r24, android.os.Bundle r25) {
            /*
                Method dump skipped, instruction units count: 2314
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: lm.c.d(int, int, android.os.Bundle):boolean");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class d {
        public final ub9 a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final long f;

        public d(ub9 ub9Var, int i, int i2, int i3, int i4, long j) {
            this.a = ub9Var;
            this.b = i;
            this.c = i2;
            this.d = i3;
            this.e = i4;
            this.f = j;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class e extends wp5 implements oh4<ub9, Boolean> {
        public static final e u = new e(1);

        @Override // defpackage.oh4
        public final Boolean invoke(ub9 ub9Var) {
            lb9 lb9VarK = ub9Var.k();
            return Boolean.valueOf(lb9VarK.t.b(ac9.B));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class f implements hc9 {
        public boolean t;
        public final /* synthetic */ jl9 u;

        public f(jl9 jl9Var) {
            this.u = jl9Var;
        }

        @Override // defpackage.hc9
        public final <T> void d(gc9<T> gc9Var, T t) {
            if (t == this.u) {
                this.t = true;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class g extends wp5 implements oh4<AccessibilityEvent, Boolean> {
        public g() {
            super(1);
        }

        @Override // defpackage.oh4
        public final Boolean invoke(AccessibilityEvent accessibilityEvent) {
            View view = lm.this.t;
            return Boolean.valueOf(view.getParent().requestSendAccessibilityEvent(view, accessibilityEvent));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class h extends wp5 implements oh4<s69, g2b> {
        public h() {
            super(1);
        }

        @Override // defpackage.oh4
        public final g2b invoke(s69 s69Var) {
            s69 s69Var2 = s69Var;
            if (s69Var2.u.contains(s69Var2)) {
                lm lmVar = lm.this;
                un7 snapshotObserver = lmVar.t.getSnapshotObserver();
                snapshotObserver.a.d(s69Var2, lmVar.c0, new nm(s69Var2, lmVar));
            }
            return g2b.a;
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [km] */
    public lm(cm cmVar) {
        this.t = cmVar;
        Object systemService = cmVar.getContext().getSystemService("accessibility");
        systemService.getClass();
        this.w = (AccessibilityManager) systemService;
        this.x = 100L;
        new Handler(Looper.getMainLooper());
        this.z = new c();
        this.A = Integer.MIN_VALUE;
        this.B = Integer.MIN_VALUE;
        this.F = new e27<>();
        this.G = new e27<>();
        this.H = new fx9<>(0);
        this.I = new fx9<>(0);
        this.J = -1;
        this.L = new r30<>(0);
        this.M = da1.a(1, 6, null);
        this.N = true;
        e27 e27Var = ag5.a;
        e27Var.getClass();
        this.P = e27Var;
        this.Q = new f27((Object) null);
        this.R = new c27();
        this.S = new c27();
        this.T = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.U = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.V = new c1b();
        this.W = new e27<>();
        this.X = new vb9(cmVar.getSemanticsOwner().a(), e27Var);
        int i = rf5.a;
        this.Z = new c27();
        cmVar.addOnAttachStateChangeListener(this);
        this.a0 = new Runnable() { // from class: km
            @Override // java.lang.Runnable
            public final void run() {
                lm lmVar = this.t;
                Trace.beginSection("measureAndLayout");
                try {
                    lmVar.t.a(true);
                    g2b g2bVar = g2b.a;
                    Trace.endSection();
                    Trace.beginSection("checkForSemanticsChanges");
                    try {
                        lmVar.e();
                        Trace.endSection();
                        lmVar.Y = false;
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
            }
        };
        this.b0 = new ArrayList();
        this.c0 = new h();
    }

    public static Rect C(dm7 dm7Var, float f2, float f3) {
        if (!(dm7Var instanceof dm7.b) && !(dm7Var instanceof dm7.c)) {
            return null;
        }
        sk8 sk8VarA = dm7Var.a();
        return new Rect((int) (sk8VarA.a + f2), (int) (sk8VarA.b + f3), (int) (sk8VarA.c + f2), (int) (sk8VarA.d + f3));
    }

    public static float[] E(dm7 dm7Var) {
        if (!(dm7Var instanceof dm7.c)) {
            return null;
        }
        vx8 vx8Var = ((dm7.c) dm7Var).a;
        long j = vx8Var.e;
        long j2 = vx8Var.h;
        long j3 = vx8Var.g;
        long j4 = vx8Var.f;
        return new float[]{Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (vx8Var.e & 4294967295L)), Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L))};
    }

    public static Region F(dm7 dm7Var, float f2, float f3) {
        if (dm7Var instanceof dm7.a) {
            cu7 cu7Var = ((dm7.a) dm7Var).a;
            sk8 sk8VarH = cu7Var.getBounds().h(f2, f3);
            Region region = new Region(new Rect((int) (sk8VarH.a + 0.0f), (int) (sk8VarH.b + 0.0f), (int) (sk8VarH.c + 0.0f), (int) (sk8VarH.d + 0.0f)));
            Region region2 = new Region();
            if (cu7Var instanceof vp) {
                Path path = ((vp) cu7Var).a;
                path.offset(f2, f3);
                region2.setPath(path, region);
                return region2;
            }
            ru3.f("Unable to obtain android.graphics.Path");
        }
        return null;
    }

    public static CharSequence G(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            int i = 100000;
            if (charSequence.length() > 100000) {
                if (Character.isHighSurrogate(charSequence.charAt(99999)) && Character.isLowSurrogate(charSequence.charAt(100000))) {
                    i = 99999;
                }
                CharSequence charSequenceSubSequence = charSequence.subSequence(0, i);
                charSequenceSubSequence.getClass();
                return charSequenceSubSequence;
            }
        }
        return charSequence;
    }

    public static String k(ub9 ub9Var) {
        iw iwVar;
        if (ub9Var != null) {
            lb9 lb9Var = ub9Var.d;
            c37<gc9<?>, Object> c37Var = lb9Var.t;
            gc9<List<String>> gc9Var = ac9.a;
            if (c37Var.b(gc9Var)) {
                return ab6.a((List) lb9Var.f(gc9Var), ",", null, 62);
            }
            gc9<iw> gc9Var2 = ac9.G;
            if (c37Var.b(gc9Var2)) {
                Object objD = c37Var.d(gc9Var2);
                if (objD == null) {
                    objD = null;
                }
                iw iwVar2 = (iw) objD;
                if (iwVar2 != null) {
                    return iwVar2.u;
                }
            } else {
                Object objD2 = c37Var.d(ac9.C);
                if (objD2 == null) {
                    objD2 = null;
                }
                List list = (List) objD2;
                if (list != null && (iwVar = (iw) th1.A(list)) != null) {
                    return iwVar.u;
                }
            }
        }
        return null;
    }

    public static final boolean o(c69 c69Var, float f2) {
        mh4<Float> mh4Var = c69Var.a;
        if (f2 >= 0.0f || mh4Var.invoke().floatValue() <= 0.0f) {
            return f2 > 0.0f && mh4Var.invoke().floatValue() < c69Var.b.invoke().floatValue();
        }
        return true;
    }

    public static final boolean p(c69 c69Var) {
        mh4<Float> mh4Var = c69Var.a;
        if (mh4Var.invoke().floatValue() > 0.0f) {
            return true;
        }
        mh4Var.invoke().floatValue();
        c69Var.b.invoke().floatValue();
        return false;
    }

    public static final boolean q(c69 c69Var) {
        mh4<Float> mh4Var = c69Var.a;
        if (mh4Var.invoke().floatValue() < c69Var.b.invoke().floatValue()) {
            return true;
        }
        mh4Var.invoke().floatValue();
        return false;
    }

    public static /* synthetic */ void v(lm lmVar, int i, int i2, Integer num, int i3) {
        if ((i3 & 4) != 0) {
            num = null;
        }
        lmVar.u(i, i2, num, null);
    }

    public final void A(qr5 qr5Var) {
        if (qr5Var.e() && !this.t.getAndroidViewsHandler$ui().getLayoutNodeToHolder().containsKey(qr5Var)) {
            int i = qr5Var.u;
            c69 c69VarB = this.F.b(i);
            c69 c69VarB2 = this.G.b(i);
            if (c69VarB == null && c69VarB2 == null) {
                return;
            }
            AccessibilityEvent accessibilityEventF = f(i, 4096);
            if (c69VarB != null) {
                accessibilityEventF.setScrollX((int) c69VarB.a.invoke().floatValue());
                accessibilityEventF.setMaxScrollX((int) c69VarB.b.invoke().floatValue());
            }
            if (c69VarB2 != null) {
                accessibilityEventF.setScrollY((int) c69VarB2.a.invoke().floatValue());
                accessibilityEventF.setMaxScrollY((int) c69VarB2.b.invoke().floatValue());
            }
            t(accessibilityEventF);
        }
    }

    public final boolean B(ub9 ub9Var, int i, int i2, boolean z) {
        String strK;
        lb9 lb9Var = ub9Var.d;
        int i3 = ub9Var.f;
        gc9<k3<ei4<Integer, Integer, Boolean, Boolean>>> gc9Var = kb9.j;
        if (lb9Var.t.b(gc9Var) && qm.a(ub9Var)) {
            ei4 ei4Var = (ei4) ((k3) ub9Var.d.f(gc9Var)).b;
            if (ei4Var != null) {
                return ((Boolean) ei4Var.invoke(Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
            }
        } else if ((i != i2 || i2 != this.J) && (strK = k(ub9Var)) != null) {
            if (i < 0 || i != i2 || i2 > strK.length()) {
                i = -1;
            }
            this.J = i;
            boolean z2 = strK.length() > 0;
            t(g(r(i3), z2 ? Integer.valueOf(this.J) : null, z2 ? Integer.valueOf(this.J) : null, z2 ? Integer.valueOf(strK.length()) : null, strK));
            x(i3);
            return true;
        }
        return false;
    }

    public final Rect D(float f2, float f3, float f4, float f5) {
        long jFloatToRawIntBits = Float.floatToRawIntBits(f2);
        long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits(f3)) & 4294967295L;
        cm cmVar = this.t;
        long jF = cmVar.f(jFloatToRawIntBits2 | (jFloatToRawIntBits << 32));
        long jF2 = cmVar.f((((long) Float.floatToRawIntBits(f5)) & 4294967295L) | (Float.floatToRawIntBits(f4) << 32));
        int i = (int) (jF >> 32);
        int i2 = (int) (jF2 >> 32);
        int i3 = (int) (jF & 4294967295L);
        int i4 = (int) (jF2 & 4294967295L);
        return new Rect((int) Math.floor(Math.min(Float.intBitsToFloat(i), Float.intBitsToFloat(i2))), (int) Math.floor(Math.min(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i), Float.intBitsToFloat(i2))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4))));
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0068  */
    /* JADX WARN: Code duplicated, block: B:20:0x0073  */
    /* JADX WARN: Code duplicated, block: B:22:0x007f  */
    /* JADX WARN: Code duplicated, block: B:24:0x0083  */
    public final void H() {
        char c2;
        long j;
        long j2;
        long j3;
        long[] jArr;
        int[] iArr;
        long[] jArr2;
        long j4;
        int i;
        int[] iArr2;
        int iNumberOfTrailingZeros;
        char c3;
        long j5;
        vb9 vb9VarB;
        String str;
        Object objD;
        f27 f27Var = new f27((Object) null);
        f27 f27Var2 = this.Q;
        int[] iArr3 = f27Var2.b;
        long[] jArr3 = f27Var2.a;
        int length = jArr3.length - 2;
        e27<vb9> e27Var = this.W;
        char c4 = 7;
        long j6 = -9187201950435737472L;
        int i2 = 8;
        if (length >= 0) {
            int i3 = 0;
            j2 = 128;
            while (true) {
                long j7 = jArr3[i3];
                j3 = 255;
                if ((((~j7) << c4) & j7 & j6) != j6) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    int i5 = 0;
                    while (i5 < i4) {
                        if ((j7 & 255) < 128) {
                            c3 = c4;
                            int i6 = iArr3[(i3 << 3) + i5];
                            j5 = j6;
                            xb9 xb9VarB = j().b(i6);
                            ub9 ub9Var = xb9VarB != null ? xb9VarB.a : null;
                            if (ub9Var != null) {
                                if (!ub9Var.d.t.b(ac9.d)) {
                                    f27Var.a(i6);
                                    vb9VarB = e27Var.b(i6);
                                    if (vb9VarB != null) {
                                        objD = vb9VarB.a.t.d(ac9.d);
                                        if (objD == null) {
                                            objD = null;
                                        }
                                        str = (String) objD;
                                    } else {
                                        str = null;
                                    }
                                    w(i6, 32, str);
                                }
                            } else {
                                f27Var.a(i6);
                                vb9VarB = e27Var.b(i6);
                                if (vb9VarB != null) {
                                    objD = vb9VarB.a.t.d(ac9.d);
                                    if (objD == null) {
                                        objD = null;
                                    }
                                    str = (String) objD;
                                } else {
                                    str = null;
                                }
                                w(i6, 32, str);
                            }
                        } else {
                            c3 = c4;
                            j5 = j6;
                        }
                        j7 >>= 8;
                        i5++;
                        c4 = c3;
                        j6 = j5;
                    }
                    c2 = c4;
                    j = j6;
                    if (i4 != 8) {
                        break;
                    }
                } else {
                    c2 = c4;
                    j = j6;
                }
                if (i3 == length) {
                    break;
                }
                i3++;
                c4 = c2;
                j6 = j;
            }
        } else {
            c2 = 7;
            j = -9187201950435737472L;
            j2 = 128;
            j3 = 255;
        }
        int[] iArr4 = f27Var.b;
        long[] jArr4 = f27Var.a;
        int length2 = jArr4.length - 2;
        if (length2 >= 0) {
            int i7 = 0;
            while (true) {
                long j8 = jArr4[i7];
                if ((((~j8) << c2) & j8 & j) != j) {
                    int i8 = 8 - ((~(i7 - length2)) >>> 31);
                    int i9 = 0;
                    while (i9 < i8) {
                        if ((j8 & j3) < j2) {
                            int i10 = iArr4[(i7 << 3) + i9];
                            int iHashCode = Integer.hashCode(i10) * (-862048943);
                            int i11 = iHashCode ^ (iHashCode << 16);
                            int i12 = i11 & 127;
                            int i13 = f27Var2.c;
                            int i14 = (i11 >>> 7) & i13;
                            i = i2;
                            int i15 = 0;
                            while (true) {
                                long[] jArr5 = f27Var2.a;
                                int i16 = i14 >> 3;
                                jArr2 = jArr4;
                                int i17 = (i14 & 7) << 3;
                                long j9 = jArr5[i16] >>> i17;
                                long j10 = jArr5[i16 + 1] << (64 - i17);
                                iArr2 = iArr4;
                                long j11 = j9 | (j10 & ((-i17) >> 63));
                                j4 = j8;
                                long j12 = (((long) i12) * 72340172838076673L) ^ j11;
                                long j13 = (j12 - 72340172838076673L) & (~j12) & j;
                                while (j13 != 0) {
                                    iNumberOfTrailingZeros = (i14 + (Long.numberOfTrailingZeros(j13) >> 3)) & i13;
                                    long j14 = j13;
                                    if (f27Var2.b[iNumberOfTrailingZeros] == i10) {
                                        break;
                                    } else {
                                        j13 = j14 & (j14 - 1);
                                    }
                                }
                                if ((j11 & ((~j11) << 6) & j) != 0) {
                                    iNumberOfTrailingZeros = -1;
                                    break;
                                }
                                i15 += 8;
                                i14 = (i14 + i15) & i13;
                                iArr4 = iArr2;
                                j8 = j4;
                                jArr4 = jArr2;
                            }
                            int i18 = iNumberOfTrailingZeros;
                            if (i18 >= 0) {
                                f27Var2.h(i18);
                            }
                        } else {
                            jArr2 = jArr4;
                            j4 = j8;
                            i = i2;
                            iArr2 = iArr4;
                        }
                        j8 = j4 >> i;
                        i9++;
                        iArr4 = iArr2;
                        i2 = i;
                        jArr4 = jArr2;
                    }
                    jArr = jArr4;
                    int i19 = i2;
                    iArr = iArr4;
                    if (i8 != i19) {
                        break;
                    }
                } else {
                    jArr = jArr4;
                    iArr = iArr4;
                }
                if (i7 == length2) {
                    break;
                }
                i7++;
                iArr4 = iArr;
                jArr4 = jArr;
                i2 = 8;
            }
        }
        e27Var.c();
        zf5<xb9> zf5VarJ = j();
        int[] iArr5 = zf5VarJ.b;
        Object[] objArr = zf5VarJ.c;
        long[] jArr6 = zf5VarJ.a;
        int length3 = jArr6.length - 2;
        if (length3 >= 0) {
            int i20 = 0;
            while (true) {
                long j15 = jArr6[i20];
                if ((((~j15) << c2) & j15 & j) != j) {
                    int i21 = 8 - ((~(i20 - length3)) >>> 31);
                    for (int i22 = 0; i22 < i21; i22++) {
                        if ((j15 & j3) < j2) {
                            int i23 = (i20 << 3) + i22;
                            int i24 = iArr5[i23];
                            ub9 ub9Var2 = ((xb9) objArr[i23]).a;
                            lb9 lb9Var = ub9Var2.d;
                            gc9<String> gc9Var = ac9.d;
                            if (lb9Var.t.b(gc9Var) && f27Var2.a(i24)) {
                                w(i24, 16, (String) ub9Var2.d.f(gc9Var));
                            }
                            e27Var.i(i24, new vb9(ub9Var2, j()));
                        }
                        j15 >>= 8;
                    }
                    if (i21 != 8) {
                        break;
                    }
                }
                if (i20 == length3) {
                    break;
                } else {
                    i20++;
                }
            }
        }
        this.X = new vb9(this.t.getSemanticsOwner().a(), j());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(int i, j4 j4Var, String str, Bundle bundle) {
        ub9 ub9Var;
        sk8 sk8Var;
        cm cmVar;
        RectF rectF;
        sk8 sk8VarE;
        AccessibilityNodeInfo accessibilityNodeInfo = j4Var.a;
        xb9 xb9VarB = j().b(i);
        if (xb9VarB == null || (ub9Var = xb9VarB.a) == null) {
            return;
        }
        qr5 qr5Var = ub9Var.c;
        lb9 lb9Var = ub9Var.d;
        c37<gc9<?>, Object> c37Var = lb9Var.t;
        String strK = k(ub9Var);
        if (xj5.a(str, this.T)) {
            int iD = this.R.d(i);
            if (iD != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iD);
                return;
            }
            return;
        }
        if (xj5.a(str, this.U)) {
            int iD2 = this.S.d(i);
            if (iD2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iD2);
                return;
            }
            return;
        }
        boolean zB = c37Var.b(kb9.a);
        cm cmVar2 = this.t;
        mb7 mb7Var = null;
        if (zB && bundle != null && xj5.a(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            int i2 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
            int i3 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
            if (i3 > 0 && i2 >= 0) {
                if (i2 < (strK != null ? strK.length() : Integer.MAX_VALUE)) {
                    ria riaVarA = kc9.a(lb9Var);
                    if (riaVarA == null) {
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    int i4 = 0;
                    while (i4 < i3) {
                        int i5 = i2 + i4;
                        if (i5 >= riaVarA.a.a.u.length()) {
                            arrayList.add(mb7Var);
                            i2 = i2;
                            i3 = i3;
                            cmVar = cmVar2;
                        } else {
                            sk8 sk8VarB = riaVarA.b(i5);
                            mb7 mb7VarD = ub9Var.d();
                            long jA0 = 0;
                            if (mb7VarD != null) {
                                if (!mb7VarD.g1().G) {
                                    mb7VarD = mb7Var;
                                }
                                if (mb7VarD != null) {
                                    jA0 = mb7VarD.a0(0L);
                                }
                            }
                            sk8 sk8VarI = sk8VarB.i(jA0);
                            sk8 sk8VarG = ub9Var.g();
                            if (sk8VarI.g(sk8VarG)) {
                                sk8VarE = sk8VarI.e(sk8VarG);
                            } else {
                                sk8Var = mb7Var;
                            }
                            if (sk8Var != 0) {
                                sk8Var = sk8VarE;
                                long jF = cmVar2.f((((long) Float.floatToRawIntBits(sk8Var.b)) & 4294967295L) | (((long) Float.floatToRawIntBits(sk8Var.a)) << 32));
                                cmVar = cmVar2;
                                long jF2 = cmVar.f((((long) Float.floatToRawIntBits(sk8Var.d)) & 4294967295L) | (((long) Float.floatToRawIntBits(sk8Var.c)) << 32));
                                int i6 = (int) (jF >> 32);
                                int i7 = (int) (jF2 >> 32);
                                int i8 = (int) (jF & 4294967295L);
                                int i9 = (int) (jF2 & 4294967295L);
                                rectF = new RectF(Math.min(Float.intBitsToFloat(i6), Float.intBitsToFloat(i7)), Math.min(Float.intBitsToFloat(i8), Float.intBitsToFloat(i9)), Math.max(Float.intBitsToFloat(i6), Float.intBitsToFloat(i7)), Math.max(Float.intBitsToFloat(i8), Float.intBitsToFloat(i9)));
                            } else {
                                sk8Var = sk8VarE;
                                cmVar = cmVar2;
                                rectF = null;
                            }
                            arrayList.add(rectF);
                        }
                        i4++;
                        i3 = i3;
                        cmVar2 = cmVar;
                        i2 = i2;
                        mb7Var = null;
                    }
                    accessibilityNodeInfo.getExtras().putParcelableArray(str, (Parcelable[]) arrayList.toArray(new RectF[0]));
                    return;
                }
            }
            Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
            return;
        }
        gc9<String> gc9Var = ac9.A;
        if (c37Var.b(gc9Var) && bundle != null && xj5.a(str, "androidx.compose.ui.semantics.testTag")) {
            Object objD = c37Var.d(gc9Var);
            String str2 = (String) (objD == null ? null : objD);
            if (str2 != null) {
                accessibilityNodeInfo.getExtras().putCharSequence(str, str2);
                return;
            }
            return;
        }
        if (xj5.a(str, "androidx.compose.ui.semantics.id")) {
            accessibilityNodeInfo.getExtras().putInt(str, ub9Var.f);
            return;
        }
        if (xj5.a(str, "androidx.compose.ui.semantics.shapeType")) {
            Object objD2 = c37Var.d(ac9.Q);
            jl9 jl9Var = (jl9) (objD2 == null ? null : objD2);
            if (jl9Var != null) {
                Rect rect = new Rect();
                accessibilityNodeInfo.getBoundsInScreen(rect);
                sk8 sk8VarL = l(ub9Var, rect, jl9Var);
                float f2 = sk8VarL.b;
                float f3 = sk8VarL.a;
                dm7 dm7VarMo0createOutlinePq9zytI = jl9Var.mo0createOutlinePq9zytI(sk8VarL.c(), qr5Var.S, cmVar2.getDensity());
                if (dm7VarMo0createOutlinePq9zytI instanceof dm7.b) {
                    accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 0);
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", C(dm7VarMo0createOutlinePq9zytI, f3, f2));
                    return;
                } else if (dm7VarMo0createOutlinePq9zytI instanceof dm7.c) {
                    accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 1);
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", C(dm7VarMo0createOutlinePq9zytI, f3, f2));
                    accessibilityNodeInfo.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", E(dm7VarMo0createOutlinePq9zytI));
                    return;
                } else if (!(dm7VarMo0createOutlinePq9zytI instanceof dm7.a)) {
                    u.b();
                    return;
                } else {
                    accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 2);
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", F(dm7VarMo0createOutlinePq9zytI, f3, f2));
                    return;
                }
            }
            return;
        }
        if (xj5.a(str, "androidx.compose.ui.semantics.shapeRect")) {
            Object objD3 = c37Var.d(ac9.Q);
            jl9 jl9Var2 = (jl9) (objD3 == null ? null : objD3);
            if (jl9Var2 != null) {
                Rect rect2 = new Rect();
                accessibilityNodeInfo.getBoundsInScreen(rect2);
                sk8 sk8VarL2 = l(ub9Var, rect2, jl9Var2);
                Rect rectC = C(jl9Var2.mo0createOutlinePq9zytI(sk8VarL2.c(), qr5Var.S, cmVar2.getDensity()), sk8VarL2.a, sk8VarL2.b);
                if (rectC != null) {
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", rectC);
                    return;
                }
                return;
            }
            return;
        }
        if (xj5.a(str, "androidx.compose.ui.semantics.shapeCorners")) {
            Object objD4 = c37Var.d(ac9.Q);
            jl9 jl9Var3 = (jl9) (objD4 == null ? null : objD4);
            if (jl9Var3 != null) {
                Rect rect3 = new Rect();
                accessibilityNodeInfo.getBoundsInScreen(rect3);
                float[] fArrE = E(jl9Var3.mo0createOutlinePq9zytI(l(ub9Var, rect3, jl9Var3).c(), qr5Var.S, cmVar2.getDensity()));
                if (fArrE != null) {
                    accessibilityNodeInfo.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", fArrE);
                    return;
                }
                return;
            }
            return;
        }
        if (xj5.a(str, "androidx.compose.ui.semantics.shapeRegion")) {
            Object objD5 = c37Var.d(ac9.Q);
            jl9 jl9Var4 = (jl9) (objD5 == null ? null : objD5);
            if (jl9Var4 != null) {
                Rect rect4 = new Rect();
                accessibilityNodeInfo.getBoundsInScreen(rect4);
                sk8 sk8VarL3 = l(ub9Var, rect4, jl9Var4);
                Region regionF = F(jl9Var4.mo0createOutlinePq9zytI(sk8VarL3.c(), qr5Var.S, cmVar2.getDensity()), sk8VarL3.a, sk8VarL3.b);
                if (regionF != null) {
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", regionF);
                }
            }
        }
    }

    public final Rect b(xb9 xb9Var) {
        gg5 gg5Var = xb9Var.b;
        return D(gg5Var.a, gg5Var.b, gg5Var.c, gg5Var.d);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0062  */
    /* JADX WARN: Code duplicated, block: B:27:0x0063  */
    /* JADX WARN: Code duplicated, block: B:30:0x006f A[Catch: all -> 0x0033, TryCatch #0 {all -> 0x0033, blocks: (B:13:0x002d, B:24:0x0056, B:28:0x0067, B:30:0x006f, B:32:0x0078, B:34:0x007d, B:35:0x008c, B:38:0x009b, B:39:0x00a2, B:20:0x0040, B:23:0x0047), top: B:46:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0078 A[Catch: all -> 0x0033, TryCatch #0 {all -> 0x0033, blocks: (B:13:0x002d, B:24:0x0056, B:28:0x0067, B:30:0x006f, B:32:0x0078, B:34:0x007d, B:35:0x008c, B:38:0x009b, B:39:0x00a2, B:20:0x0040, B:23:0x0047), top: B:46:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x007d A[Catch: all -> 0x0033, LOOP:0: B:33:0x007b->B:34:0x007d, LOOP_END, TryCatch #0 {all -> 0x0033, blocks: (B:13:0x002d, B:24:0x0056, B:28:0x0067, B:30:0x006f, B:32:0x0078, B:34:0x007d, B:35:0x008c, B:38:0x009b, B:39:0x00a2, B:20:0x0040, B:23:0x0047), top: B:46:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0099 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:42:0x00be  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00bb, code lost:
    
        if (defpackage.bw2.b(r7, r0) == r6) goto L41;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00bb -> B:14:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.u02 r11) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r11 instanceof defpackage.mm
            if (r0 == 0) goto L13
            r0 = r11
            mm r0 = (defpackage.mm) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.x = r1
            goto L18
        L13:
            mm r0 = new mm
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.v
            int r1 = r0.x
            r2 = 0
            r3 = 2
            r30<qr5> r4 = r10.L
            r5 = 1
            v72 r6 = defpackage.v72.t
            if (r1 == 0) goto L44
            if (r1 == r5) goto L3c
            if (r1 != r3) goto L36
            ca1 r1 = r0.u
            f27 r2 = r0.t
            defpackage.dv8.b(r11)     // Catch: java.lang.Throwable -> L33
        L30:
            r11 = r2
            r2 = r1
            goto L56
        L33:
            r10 = move-exception
            goto Lc4
        L36:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r10)
            return r2
        L3c:
            ca1 r1 = r0.u
            f27 r2 = r0.t
            defpackage.dv8.b(r11)     // Catch: java.lang.Throwable -> L33
            goto L67
        L44:
            defpackage.dv8.b(r11)
            f27 r11 = new f27     // Catch: java.lang.Throwable -> L33
            r11.<init>(r2)     // Catch: java.lang.Throwable -> L33
            zx0 r1 = r10.M     // Catch: java.lang.Throwable -> L33
            r1.getClass()     // Catch: java.lang.Throwable -> L33
            zx0$a r2 = new zx0$a     // Catch: java.lang.Throwable -> L33
            r2.<init>()     // Catch: java.lang.Throwable -> L33
        L56:
            r0.t = r11     // Catch: java.lang.Throwable -> L33
            r0.u = r2     // Catch: java.lang.Throwable -> L33
            r0.x = r5     // Catch: java.lang.Throwable -> L33
            java.lang.Object r1 = r2.b(r0)     // Catch: java.lang.Throwable -> L33
            if (r1 != r6) goto L63
            goto Lbd
        L63:
            r9 = r2
            r2 = r11
            r11 = r1
            r1 = r9
        L67:
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.Throwable -> L33
            boolean r11 = r11.booleanValue()     // Catch: java.lang.Throwable -> L33
            if (r11 == 0) goto Lbe
            r1.next()     // Catch: java.lang.Throwable -> L33
            boolean r11 = r10.m()     // Catch: java.lang.Throwable -> L33
            if (r11 == 0) goto La2
            int r11 = r4.v     // Catch: java.lang.Throwable -> L33
            r7 = 0
        L7b:
            if (r7 >= r11) goto L8c
            java.lang.Object[] r8 = r4.u     // Catch: java.lang.Throwable -> L33
            r8 = r8[r7]     // Catch: java.lang.Throwable -> L33
            qr5 r8 = (defpackage.qr5) r8     // Catch: java.lang.Throwable -> L33
            r10.z(r8, r2)     // Catch: java.lang.Throwable -> L33
            r10.A(r8)     // Catch: java.lang.Throwable -> L33
            int r7 = r7 + 1
            goto L7b
        L8c:
            r2.b()     // Catch: java.lang.Throwable -> L33
            cm r11 = r10.t     // Catch: java.lang.Throwable -> L33
            android.os.Handler r11 = r11.getHandler()     // Catch: java.lang.Throwable -> L33
            boolean r7 = r10.Y     // Catch: java.lang.Throwable -> L33
            if (r7 != 0) goto La2
            if (r11 == 0) goto La2
            r10.Y = r5     // Catch: java.lang.Throwable -> L33
            km r7 = r10.a0     // Catch: java.lang.Throwable -> L33
            r11.post(r7)     // Catch: java.lang.Throwable -> L33
        La2:
            r4.clear()     // Catch: java.lang.Throwable -> L33
            e27<c69> r11 = r10.F     // Catch: java.lang.Throwable -> L33
            r11.c()     // Catch: java.lang.Throwable -> L33
            e27<c69> r11 = r10.G     // Catch: java.lang.Throwable -> L33
            r11.c()     // Catch: java.lang.Throwable -> L33
            long r7 = r10.x     // Catch: java.lang.Throwable -> L33
            r0.t = r2     // Catch: java.lang.Throwable -> L33
            r0.u = r1     // Catch: java.lang.Throwable -> L33
            r0.x = r3     // Catch: java.lang.Throwable -> L33
            java.lang.Object r11 = defpackage.bw2.b(r7, r0)     // Catch: java.lang.Throwable -> L33
            if (r11 != r6) goto L30
        Lbd:
            return r6
        Lbe:
            r4.clear()
            g2b r10 = defpackage.g2b.a
            return r10
        Lc4:
            r4.clear()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lm.c(u02):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00f9  */
    public final boolean d(int i, long j, boolean z) {
        gc9<c69> gc9Var;
        int i2;
        if (xj5.a(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            zf5<xb9> zf5VarJ = j();
            if (!vf7.b(j, 9205357640488583168L) && (((9223372034707292159L & j) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                if (z) {
                    gc9Var = ac9.w;
                } else {
                    if (z) {
                        u.b();
                        return false;
                    }
                    gc9Var = ac9.v;
                }
                Object[] objArr = zf5VarJ.c;
                long[] jArr = zf5VarJ.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    boolean z2 = false;
                    while (true) {
                        long j2 = jArr[i3];
                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i4 = 8;
                            int i5 = 8 - ((~(i3 - length)) >>> 31);
                            int i6 = 0;
                            while (i6 < i5) {
                                if ((255 & j2) < 128) {
                                    xb9 xb9Var = (xb9) objArr[(i3 << 3) + i6];
                                    gg5 gg5Var = xb9Var.b;
                                    float f2 = gg5Var.a;
                                    i2 = i4;
                                    float f3 = gg5Var.b;
                                    float f4 = gg5Var.c;
                                    float f5 = gg5Var.d;
                                    float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
                                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
                                    if ((fIntBitsToFloat2 < f5) & (fIntBitsToFloat >= f2) & (fIntBitsToFloat < f4) & (fIntBitsToFloat2 >= f3)) {
                                        Object objD = xb9Var.a.d.t.d(gc9Var);
                                        if (objD == null) {
                                            objD = null;
                                        }
                                        c69 c69Var = (c69) objD;
                                        if (c69Var != null) {
                                            mh4<Float> mh4Var = c69Var.a;
                                            if (i < 0) {
                                                if (mh4Var.invoke().floatValue() > 0.0f) {
                                                    z2 = true;
                                                }
                                            } else if (mh4Var.invoke().floatValue() < c69Var.b.invoke().floatValue()) {
                                                z2 = true;
                                            }
                                        }
                                    }
                                } else {
                                    i2 = i4;
                                }
                                j2 >>= i2;
                                i6++;
                                i4 = i2;
                            }
                            if (i5 != i4) {
                                return z2;
                            }
                        }
                        if (i3 == length) {
                            return z2;
                        }
                        i3++;
                    }
                }
            }
        }
        return false;
    }

    public final void e() {
        Trace.beginSection("sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (m()) {
                s(this.t.getSemanticsOwner().a(), this.X);
            }
            g2b g2bVar = g2b.a;
            Trace.endSection();
            Trace.beginSection("sendSemanticsPropertyChangeEvents");
            try {
                y(j());
                Trace.endSection();
                Trace.beginSection("updateSemanticsNodesCopyAndPanes");
                try {
                    H();
                } finally {
                    Trace.endSection();
                }
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public final AccessibilityEvent f(int i, int i2) {
        xb9 xb9VarB;
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i2);
        accessibilityEventObtain.setEnabled(true);
        accessibilityEventObtain.setClassName("android.view.View");
        cm cmVar = this.t;
        accessibilityEventObtain.setPackageName(cmVar.getContext().getPackageName());
        accessibilityEventObtain.setSource(cmVar, i);
        if (m() && (xb9VarB = j().b(i)) != null) {
            ub9 ub9Var = xb9VarB.a;
            accessibilityEventObtain.setPassword(ub9Var.d.t.b(ac9.L));
            Object objD = ub9Var.d.t.d(ac9.o);
            if (objD == null) {
                objD = null;
            }
            boolean zA = xj5.a(objD, Boolean.TRUE);
            if (Build.VERSION.SDK_INT >= 34) {
                n3.a(accessibilityEventObtain, zA);
            }
        }
        return accessibilityEventObtain;
    }

    public final AccessibilityEvent g(int i, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent accessibilityEventF = f(i, 8192);
        if (num != null) {
            accessibilityEventF.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            accessibilityEventF.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            accessibilityEventF.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            accessibilityEventF.getText().add(charSequence);
        }
        return accessibilityEventF;
    }

    @Override // defpackage.m3
    public final k4 getAccessibilityNodeProvider(View view) {
        return this.z;
    }

    public final int h(ub9 ub9Var) {
        lb9 lb9Var = ub9Var.d;
        if (!lb9Var.t.b(ac9.a)) {
            gc9<lja> gc9Var = ac9.H;
            if (lb9Var.t.b(gc9Var)) {
                return (int) (((lja) lb9Var.f(gc9Var)).a & 4294967295L);
            }
        }
        return this.J;
    }

    public final int i(ub9 ub9Var) {
        lb9 lb9Var = ub9Var.d;
        if (!lb9Var.t.b(ac9.a)) {
            gc9<lja> gc9Var = ac9.H;
            if (lb9Var.t.b(gc9Var)) {
                return (int) (((lja) lb9Var.f(gc9Var)).a >> 32);
            }
        }
        return this.J;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zf5<xb9> j() {
        if (this.N) {
            this.N = false;
            cm cmVar = this.t;
            this.P = zb9.c(cmVar.getSemanticsOwner(), e.u);
            if (m()) {
                e27 e27Var = this.P;
                Resources resources = cmVar.getContext().getResources();
                c27 c27Var = this.R;
                c27Var.a();
                c27 c27Var2 = this.S;
                c27Var2.a();
                xb9 xb9Var = (xb9) e27Var.b(-1);
                ub9 ub9Var = xb9Var != null ? xb9Var.a : null;
                ub9Var.getClass();
                ArrayList arrayListB = jc9.b(ub9Var, new om(e27Var), new pm(resources), ws0.h(ub9Var));
                int i = 1;
                int size = arrayListB.size() - 1;
                if (1 <= size) {
                    while (true) {
                        int i2 = ((ub9) arrayListB.get(i - 1)).f;
                        int i3 = ((ub9) arrayListB.get(i)).f;
                        c27Var.f(i2, i3);
                        c27Var2.f(i3, i2);
                        if (i == size) {
                            break;
                        }
                        i++;
                    }
                }
            }
        }
        return this.P;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0073 A[LOOP:0: B:4:0x0014->B:36:0x0073, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:49:0x0076 A[EDGE_INSN: B:49:0x0076->B:37:0x0076 BREAK  A[LOOP:0: B:4:0x0014->B:36:0x0073], SYNTHETIC] */
    public final sk8 l(ub9 ub9Var, Rect rect, jl9 jl9Var) {
        ox6.c cVarQ;
        f fVar = new f(jl9Var);
        qr5 qr5Var = ub9Var.c;
        ox6.c cVar = qr5Var.Y.f;
        Object obj = null;
        if ((cVar.w & 8) != 0) {
            loop0: while (cVar != null) {
                if ((cVar.v & 8) == 0) {
                    if ((cVar.w & 8) != 0) {
                        break;
                        break;
                    }
                    cVar = cVar.y;
                } else {
                    ox6.c cVarB = cVar;
                    k37 k37Var = null;
                    while (cVarB != null) {
                        if (cVarB instanceof qb9) {
                            ((qb9) cVarB).E1(fVar);
                            if (fVar.t) {
                                obj = cVarB;
                                break loop0;
                            }
                        } else if ((cVarB.v & 8) != 0 && (cVarB instanceof gw2)) {
                            int i = 0;
                            for (ox6.c cVar2 = ((gw2) cVarB).I; cVar2 != null; cVar2 = cVar2.y) {
                                if ((cVar2.v & 8) != 0) {
                                    i++;
                                    if (i == 1) {
                                        cVarB = cVar2;
                                    } else {
                                        if (k37Var == null) {
                                            k37Var = new k37(new ox6.c[16]);
                                        }
                                        if (cVarB != null) {
                                            k37Var.d(cVarB);
                                            cVarB = null;
                                        }
                                        k37Var.d(cVar2);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        cVarB = ew2.b(k37Var);
                    }
                    if ((cVar.w & 8) != 0) {
                        break;
                    }
                    cVar = cVar.y;
                }
            }
        }
        qb9 qb9Var = (qb9) obj;
        if (qb9Var == null || (cVarQ = qb9Var.q()) == null || !cVarQ.G) {
            return rq5.b(qr5Var.Y.d, false);
        }
        mb7 mb7VarE = ew2.e(qb9Var);
        sk8 sk8VarZ = rq5.d(mb7VarE).Z(mb7VarE, false);
        Rect rectD = D(sk8VarZ.a, sk8VarZ.b, sk8VarZ.c, sk8VarZ.d);
        float f2 = rectD.left - rect.left;
        float f3 = rectD.top - rect.top;
        return new sk8(f2, f3, rectD.width() + f2, rectD.height() + f3);
    }

    public final boolean m() {
        List<? extends AccessibilityServiceInfo> list;
        AccessibilityManager accessibilityManager = this.w;
        if (!accessibilityManager.isEnabled()) {
            return false;
        }
        List<? extends AccessibilityServiceInfo> list2 = this.y;
        if (list2 == null) {
            list = list2;
            List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(-1);
            this.y = enabledAccessibilityServiceList;
            list = enabledAccessibilityServiceList;
        }
        list = list2;
        return !list.isEmpty();
    }

    public final void n(qr5 qr5Var) {
        if (this.L.add(qr5Var)) {
            this.M.n(g2b.a);
        }
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
        this.y = null;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        this.y = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        AccessibilityManager accessibilityManager = this.w;
        if (accessibilityManager.isEnabled()) {
            this.y = null;
        }
        accessibilityManager.addAccessibilityStateChangeListener(this);
        accessibilityManager.addTouchExplorationStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Handler handler = this.t.getHandler();
        handler.getClass();
        handler.removeCallbacks(this.a0);
        AccessibilityManager accessibilityManager = this.w;
        accessibilityManager.removeAccessibilityStateChangeListener(this);
        accessibilityManager.removeTouchExplorationStateChangeListener(this);
    }

    public final int r(int i) {
        if (i == this.t.getSemanticsOwner().a().f) {
            return -1;
        }
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0083 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0085 A[LOOP:1: B:15:0x0049->B:28:0x0085, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:44:0x0088 A[EDGE_INSN: B:44:0x0088->B:29:0x0088 BREAK  A[LOOP:1: B:15:0x0049->B:28:0x0085], SYNTHETIC] */
    public final void s(ub9 ub9Var, vb9 vb9Var) {
        f27 f27VarA = jg5.a();
        List listJ = ub9.j(4, ub9Var);
        qr5 qr5Var = ub9Var.c;
        int size = listJ.size();
        for (int i = 0; i < size; i++) {
            ub9 ub9Var2 = (ub9) listJ.get(i);
            zf5<xb9> zf5VarJ = j();
            int i2 = ub9Var2.f;
            if (zf5VarJ.a(i2)) {
                if (!vb9Var.b.c(i2)) {
                    n(qr5Var);
                    return;
                }
                f27VarA.a(i2);
            }
        }
        f27 f27Var = vb9Var.b;
        int[] iArr = f27Var.b;
        long[] jArr = f27Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i3 != length) {
                        break;
                        break;
                    }
                    i3++;
                } else {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128 && !f27VarA.c(iArr[(i3 << 3) + i5])) {
                            n(qr5Var);
                            return;
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    } else if (i3 != length) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
        }
        List listJ2 = ub9.j(4, ub9Var);
        int size2 = listJ2.size();
        for (int i6 = 0; i6 < size2; i6++) {
            ub9 ub9Var3 = (ub9) listJ2.get(i6);
            vb9 vb9VarB = this.W.b(ub9Var3.f);
            if (vb9VarB != null && j().a(ub9Var3.f)) {
                s(ub9Var3, vb9VarB);
            }
        }
    }

    public final boolean t(AccessibilityEvent accessibilityEvent) {
        if (!m()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.E = true;
        }
        try {
            return ((Boolean) this.v.invoke(accessibilityEvent)).booleanValue();
        } finally {
            this.E = false;
        }
    }

    public final boolean u(int i, int i2, Integer num, List<String> list) {
        if (i == Integer.MIN_VALUE || !m()) {
            return false;
        }
        AccessibilityEvent accessibilityEventF = f(i, i2);
        if (num != null) {
            accessibilityEventF.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            accessibilityEventF.setContentDescription(ab6.a(list, ",", null, 62));
        }
        return t(accessibilityEventF);
    }

    public final void w(int i, int i2, String str) {
        AccessibilityEvent accessibilityEventF = f(r(i), 32);
        accessibilityEventF.setContentChangeTypes(i2);
        if (str != null) {
            accessibilityEventF.getText().add(str);
        }
        t(accessibilityEventF);
    }

    public final void x(int i) {
        d dVar = this.O;
        if (dVar != null) {
            ub9 ub9Var = dVar.a;
            if (i != ub9Var.f) {
                return;
            }
            if (SystemClock.uptimeMillis() - dVar.f <= 1000) {
                AccessibilityEvent accessibilityEventF = f(r(ub9Var.f), 131072);
                accessibilityEventF.setFromIndex(dVar.d);
                accessibilityEventF.setToIndex(dVar.e);
                accessibilityEventF.setAction(dVar.b);
                accessibilityEventF.setMovementGranularity(dVar.c);
                accessibilityEventF.getText().add(k(ub9Var));
                t(accessibilityEventF);
            }
        }
        this.O = null;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0253  */
    /* JADX WARN: Code duplicated, block: B:103:0x0260  */
    /* JADX WARN: Code duplicated, block: B:108:0x028b  */
    /* JADX WARN: Code duplicated, block: B:110:0x0299  */
    /* JADX WARN: Code duplicated, block: B:111:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:113:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:115:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:117:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:121:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:124:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:128:0x02db  */
    /* JADX WARN: Code duplicated, block: B:131:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:133:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:137:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:140:0x0305 A[LOOP:4: B:135:0x02f4->B:140:0x0305, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:145:0x0313  */
    /* JADX WARN: Code duplicated, block: B:148:0x0327 A[LOOP:5: B:143:0x030f->B:148:0x0327, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:155:0x034d  */
    /* JADX WARN: Code duplicated, block: B:160:0x0357  */
    /* JADX WARN: Code duplicated, block: B:165:0x037f  */
    /* JADX WARN: Code duplicated, block: B:169:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:172:0x03be  */
    /* JADX WARN: Code duplicated, block: B:173:0x03d2  */
    /* JADX WARN: Code duplicated, block: B:175:0x03e2  */
    /* JADX WARN: Code duplicated, block: B:177:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:185:0x0430  */
    /* JADX WARN: Code duplicated, block: B:189:0x043f  */
    /* JADX WARN: Code duplicated, block: B:240:0x0520  */
    /* JADX WARN: Code duplicated, block: B:243:0x0531 A[LOOP:8: B:239:0x051e->B:243:0x0531, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:247:0x053f  */
    /* JADX WARN: Code duplicated, block: B:250:0x054d  */
    /* JADX WARN: Code duplicated, block: B:254:0x055c  */
    /* JADX WARN: Code duplicated, block: B:301:0x030c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:302:0x030e A[EDGE_INSN: B:302:0x030e->B:142:0x030e BREAK  A[LOOP:4: B:135:0x02f4->B:140:0x0305], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:303:0x032a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:304:0x032c A[EDGE_INSN: B:304:0x032c->B:150:0x032c BREAK  A[LOOP:5: B:143:0x030f->B:148:0x0327], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:307:0x052a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:308:0x0534 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x0139  */
    /* JADX WARN: Code duplicated, block: B:54:0x0141  */
    /* JADX WARN: Code duplicated, block: B:56:0x014e  */
    /* JADX WARN: Code duplicated, block: B:58:0x0154  */
    /* JADX WARN: Code duplicated, block: B:60:0x015e  */
    /* JADX WARN: Code duplicated, block: B:61:0x016f  */
    /* JADX WARN: Code duplicated, block: B:63:0x0179  */
    /* JADX WARN: Code duplicated, block: B:64:0x0190  */
    /* JADX WARN: Code duplicated, block: B:66:0x0198  */
    /* JADX WARN: Code duplicated, block: B:67:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:69:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:70:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:72:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:74:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:77:0x01da  */
    /* JADX WARN: Code duplicated, block: B:82:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:85:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:87:0x0219  */
    /* JADX WARN: Code duplicated, block: B:90:0x0227  */
    /* JADX WARN: Code duplicated, block: B:93:0x023a  */
    /* JADX WARN: Code duplicated, block: B:96:0x0241  */
    /* JADX WARN: Code duplicated, block: B:97:0x0249  */
    /* JADX WARN: Code duplicated, block: B:99:0x024c  */
    public final void y(zf5<xb9> zf5Var) {
        Integer num;
        ArrayList arrayList;
        int[] iArr;
        long[] jArr;
        Integer num2;
        int i;
        int i2;
        Integer num3;
        ArrayList arrayList2;
        int[] iArr2;
        long[] jArr2;
        int i3;
        int i4;
        Integer num4;
        int i5;
        int i6;
        vb9 vb9VarB;
        lb9 lb9Var;
        ub9 ub9Var;
        boolean z;
        int i7;
        boolean z2;
        boolean z3;
        c37<gc9<?>, Object> c37Var;
        qr5 qr5Var;
        int i8;
        lb9 lb9Var2;
        long j;
        int i9;
        int i10;
        s69 s69Var;
        boolean z4;
        gc9<String> gc9Var;
        int i11;
        gc9<Boolean> gc9Var2;
        gc9<iw> gc9Var3;
        boolean zA;
        String str;
        gc9<lja> gc9Var4;
        int size;
        int i12;
        s69 s69Var2;
        Object objD;
        Object objD2;
        Object obj;
        T t;
        int i13;
        Object objD3;
        iw iwVar;
        String str2;
        Object objD4;
        iw iwVar2;
        Object objD5;
        CharSequence charSequence;
        CharSequence charSequenceG;
        int length;
        int length2;
        int i14;
        Integer num5;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean zB;
        boolean z5;
        boolean z6;
        AccessibilityEvent accessibilityEventG;
        Object objD6;
        ex8 ex8Var;
        Object objD7;
        AccessibilityEvent accessibilityEventF;
        Object objD8;
        String strA;
        Object objD9;
        List list;
        String strA2;
        String str3;
        boolean zB2;
        int i19;
        lm lmVar = this;
        zf5<xb9> zf5Var2 = zf5Var;
        Integer num6 = 64;
        ArrayList arrayList3 = lmVar.b0;
        ArrayList arrayList4 = new ArrayList(arrayList3);
        arrayList3.clear();
        int[] iArr3 = zf5Var2.b;
        long[] jArr3 = zf5Var2.a;
        int i20 = 2;
        int length3 = jArr3.length - 2;
        int i21 = 0;
        Integer num7 = 0;
        if (length3 < 0) {
            return;
        }
        int i22 = 0;
        while (true) {
            long j2 = jArr3[i22];
            int i23 = i20;
            int i24 = length3;
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i25 = 8;
                int i26 = 8 - ((~(i22 - i24)) >>> 31);
                long j3 = j2;
                int i27 = i21;
                while (i27 < i26) {
                    if ((j3 & 255) >= 128 || (vb9VarB = lmVar.W.b((i6 = iArr3[(i22 << 3) + i27]))) == null) {
                        i2 = i27;
                        num3 = num6;
                        arrayList2 = arrayList4;
                        iArr2 = iArr3;
                        jArr2 = jArr3;
                        i3 = i26;
                        i4 = i22;
                        num4 = num7;
                        i5 = i25;
                    } else {
                        lb9 lb9Var3 = vb9VarB.a;
                        c37<gc9<?>, Object> c37Var2 = lb9Var3.t;
                        xb9 xb9VarB = zf5Var2.b(i6);
                        int i28 = i25;
                        ub9 ub9Var2 = xb9VarB != null ? xb9VarB.a : null;
                        if (ub9Var2 == null) {
                            throw ik.a("no value for specified key");
                        }
                        qr5 qr5Var2 = ub9Var2.c;
                        lb9 lb9Var4 = ub9Var2.d;
                        iArr2 = iArr3;
                        int i29 = ub9Var2.f;
                        jArr2 = jArr3;
                        c37<gc9<?>, Object> c37Var3 = lb9Var4.t;
                        i4 = i22;
                        Object[] objArr = c37Var3.b;
                        Object[] objArr2 = c37Var3.c;
                        long[] jArr4 = c37Var3.a;
                        i2 = i27;
                        int length4 = jArr4.length - 2;
                        if (length4 >= 0) {
                            qr5 qr5Var3 = qr5Var2;
                            i3 = i26;
                            int i30 = 0;
                            z2 = false;
                            while (true) {
                                long j4 = jArr4[i30];
                                ub9Var = ub9Var2;
                                int i31 = i30;
                                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i32 = 8 - ((~(i31 - length4)) >>> 31);
                                    int i33 = 0;
                                    while (i33 < i32) {
                                        if ((j4 & 255) < 128) {
                                            int i34 = (i31 << 3) + i33;
                                            Object obj2 = objArr[i34];
                                            int i35 = length4;
                                            Object obj3 = objArr2[i34];
                                            lb9Var2 = lb9Var3;
                                            gc9<?> gc9Var5 = (gc9) obj2;
                                            j = j4;
                                            gc9<c69> gc9Var6 = ac9.v;
                                            if (xj5.a(gc9Var5, gc9Var6) || xj5.a(gc9Var5, ac9.w)) {
                                                int size2 = arrayList4.size();
                                                int i36 = 0;
                                                while (true) {
                                                    if (i36 >= size2) {
                                                        s69Var = null;
                                                        break;
                                                    }
                                                    int i37 = size2;
                                                    if (((s69) arrayList4.get(i36)).t == i6) {
                                                        s69Var = (s69) arrayList4.get(i36);
                                                        break;
                                                    } else {
                                                        i36++;
                                                        size2 = i37;
                                                    }
                                                }
                                                if (s69Var != null) {
                                                    z4 = false;
                                                } else {
                                                    s69Var = new s69(i6, arrayList3);
                                                    z4 = true;
                                                }
                                                arrayList3.add(s69Var);
                                            } else {
                                                z4 = false;
                                            }
                                            if (z4) {
                                                gc9Var = ac9.d;
                                                if (xj5.a(gc9Var5, gc9Var)) {
                                                    obj3.getClass();
                                                    str3 = (String) obj3;
                                                    zB2 = c37Var2.b(gc9Var);
                                                    i19 = i28;
                                                    if (zB2) {
                                                        lmVar.w(i6, i19, str3);
                                                    }
                                                    g2b g2bVar = g2b.a;
                                                } else {
                                                    i11 = i28;
                                                    if (xj5.a(gc9Var5, ac9.b)) {
                                                        v(lmVar, lmVar.r(i6), AudioConstants.AUDIO_FILE_BUFFER_SIZE, num6, i11);
                                                        v(lmVar, lmVar.r(i6), AudioConstants.AUDIO_FILE_BUFFER_SIZE, num7, i11);
                                                    } else if (xj5.a(gc9Var5, ac9.K)) {
                                                        v(lmVar, lmVar.r(i6), AudioConstants.AUDIO_FILE_BUFFER_SIZE, 8192, 8);
                                                        v(lmVar, lmVar.r(i6), AudioConstants.AUDIO_FILE_BUFFER_SIZE, num7, 8);
                                                    } else if (xj5.a(gc9Var5, ac9.M)) {
                                                        v(lmVar, lmVar.r(i6), AudioConstants.AUDIO_FILE_BUFFER_SIZE, 3072, 8);
                                                    } else if (xj5.a(gc9Var5, ac9.c)) {
                                                        v(lmVar, lmVar.r(i6), AudioConstants.AUDIO_FILE_BUFFER_SIZE, num6, 8);
                                                        v(lmVar, lmVar.r(i6), AudioConstants.AUDIO_FILE_BUFFER_SIZE, num7, 8);
                                                    } else {
                                                        gc9Var2 = ac9.J;
                                                        arrayList4 = arrayList4;
                                                        if (xj5.a(gc9Var5, gc9Var2)) {
                                                            objD6 = c37Var3.d(ac9.z);
                                                            if (objD6 == null) {
                                                                objD6 = null;
                                                            }
                                                            ex8Var = (ex8) objD6;
                                                            if (ex8Var == null && ex8Var.a == 4) {
                                                                objD7 = c37Var3.d(gc9Var2);
                                                                if (objD7 == null) {
                                                                    objD7 = null;
                                                                }
                                                                if (xj5.a(objD7, Boolean.TRUE)) {
                                                                    accessibilityEventF = lmVar.f(lmVar.r(i6), 4);
                                                                    ub9 ub9Var3 = ub9Var;
                                                                    qr5Var3 = qr5Var3;
                                                                    ub9 ub9Var4 = new ub9(ub9Var3.a, true, qr5Var3, lb9Var4);
                                                                    objD8 = ub9Var4.k().t.d(ac9.a);
                                                                    if (objD8 == null) {
                                                                        objD8 = null;
                                                                    }
                                                                    List list2 = (List) objD8;
                                                                    ub9Var = ub9Var3;
                                                                    strA = list2 != null ? ab6.a(list2, ",", null, 62) : null;
                                                                    objD9 = ub9Var4.k().t.d(ac9.C);
                                                                    if (objD9 == null) {
                                                                        objD9 = null;
                                                                    }
                                                                    list = (List) objD9;
                                                                    i10 = i32;
                                                                    if (list != null) {
                                                                        strA2 = ab6.a(list, ",", null, 62);
                                                                    } else {
                                                                        strA2 = null;
                                                                    }
                                                                    if (strA != null) {
                                                                        accessibilityEventF.setContentDescription(strA);
                                                                        g2b g2bVar2 = g2b.a;
                                                                    }
                                                                    if (strA2 != null) {
                                                                        accessibilityEventF.getText().add(strA2);
                                                                    }
                                                                    lmVar.t(accessibilityEventF);
                                                                } else {
                                                                    qr5Var3 = qr5Var3;
                                                                    i10 = i32;
                                                                    v(lmVar, lmVar.r(i6), AudioConstants.AUDIO_FILE_BUFFER_SIZE, num7, 8);
                                                                }
                                                            } else {
                                                                qr5Var3 = qr5Var3;
                                                                i10 = i32;
                                                                v(lmVar, lmVar.r(i6), AudioConstants.AUDIO_FILE_BUFFER_SIZE, num6, 8);
                                                                v(lmVar, lmVar.r(i6), AudioConstants.AUDIO_FILE_BUFFER_SIZE, num7, 8);
                                                            }
                                                        } else {
                                                            qr5Var3 = qr5Var3;
                                                            i10 = i32;
                                                            if (xj5.a(gc9Var5, ac9.a)) {
                                                                int iR = lmVar.r(i6);
                                                                obj3.getClass();
                                                                lmVar.u(iR, AudioConstants.AUDIO_FILE_BUFFER_SIZE, 4, (List) obj3);
                                                            } else {
                                                                gc9Var3 = ac9.G;
                                                                zA = xj5.a(gc9Var5, gc9Var3);
                                                                str = BuildConfig.FLAVOR;
                                                                if (zA) {
                                                                    if (c37Var3.b(kb9.k)) {
                                                                        objD4 = c37Var2.d(gc9Var3);
                                                                        if (objD4 == null) {
                                                                            objD4 = null;
                                                                        }
                                                                        iwVar2 = (iw) objD4;
                                                                        if (iwVar2 == null) {
                                                                            iwVar2 = BuildConfig.FLAVOR;
                                                                        }
                                                                        objD5 = c37Var3.d(gc9Var3);
                                                                        if (objD5 == null) {
                                                                            objD5 = null;
                                                                        }
                                                                        charSequence = (iw) objD5;
                                                                        if (charSequence == null) {
                                                                            charSequence = BuildConfig.FLAVOR;
                                                                        }
                                                                        charSequenceG = G(charSequence);
                                                                        length = iwVar2.length();
                                                                        length2 = charSequence.length();
                                                                        if (length > length2) {
                                                                            i14 = length2;
                                                                        } else {
                                                                            i14 = length;
                                                                        }
                                                                        num5 = num7;
                                                                        i15 = 0;
                                                                        while (true) {
                                                                            num6 = num6;
                                                                            if (i15 < i14) {
                                                                                i16 = length;
                                                                                break;
                                                                            }
                                                                            i16 = length;
                                                                            if (iwVar2.charAt(i15) != charSequence.charAt(i15)) {
                                                                                break;
                                                                            }
                                                                            i15++;
                                                                            length = i16;
                                                                            num6 = num6;
                                                                        }
                                                                        i17 = 0;
                                                                        while (true) {
                                                                            if (i17 < i14 - i15) {
                                                                                i18 = i17;
                                                                                break;
                                                                            }
                                                                            i18 = i17;
                                                                            if (iwVar2.charAt((i16 - 1) - i17) != charSequence.charAt((length2 - 1) - i18)) {
                                                                                break;
                                                                            } else {
                                                                                i17 = i18 + 1;
                                                                            }
                                                                        }
                                                                        int i38 = (i16 - i18) - i15;
                                                                        int i39 = (length2 - i18) - i15;
                                                                        gc9<g2b> gc9Var7 = ac9.L;
                                                                        boolean zB3 = c37Var2.b(gc9Var7);
                                                                        boolean zB4 = c37Var3.b(gc9Var7);
                                                                        zB = c37Var2.b(ac9.G);
                                                                        if (zB || zB3 || !zB4) {
                                                                            z5 = false;
                                                                        } else {
                                                                            z5 = true;
                                                                        }
                                                                        if (zB || !zB3 || zB4) {
                                                                            z6 = false;
                                                                        } else {
                                                                            z6 = true;
                                                                        }
                                                                        if (!z5 || z6) {
                                                                            i6 = i6;
                                                                            num7 = num5;
                                                                            accessibilityEventG = lmVar.g(lmVar.r(i6), num7, num5, Integer.valueOf(length2), charSequenceG);
                                                                        } else {
                                                                            accessibilityEventG = lmVar.f(lmVar.r(i6), 16);
                                                                            accessibilityEventG.setFromIndex(i15);
                                                                            accessibilityEventG.setRemovedCount(i38);
                                                                            accessibilityEventG.setAddedCount(i39);
                                                                            accessibilityEventG.setBeforeText(iwVar2);
                                                                            accessibilityEventG.getText().add(charSequenceG);
                                                                            i6 = i6;
                                                                            num7 = num5;
                                                                        }
                                                                        accessibilityEventG.setClassName("android.widget.EditText");
                                                                        lmVar.t(accessibilityEventG);
                                                                        if (z5 || z6) {
                                                                            long j5 = ((lja) lb9Var4.f(ac9.H)).a;
                                                                            accessibilityEventG.setFromIndex((int) (j5 >> 32));
                                                                            accessibilityEventG.setToIndex((int) (j5 & 4294967295L));
                                                                            lmVar.t(accessibilityEventG);
                                                                        }
                                                                        g2b g2bVar3 = g2b.a;
                                                                    } else {
                                                                        i6 = i6;
                                                                        c37Var2 = c37Var2;
                                                                        num6 = num6;
                                                                        v(lmVar, lmVar.r(i6), AudioConstants.AUDIO_FILE_BUFFER_SIZE, Integer.valueOf(i23), 8);
                                                                    }
                                                                    num7 = num7;
                                                                    i9 = i35;
                                                                } else {
                                                                    i6 = i6;
                                                                    c37Var2 = c37Var2;
                                                                    num6 = num6;
                                                                    i9 = i35;
                                                                    gc9Var4 = ac9.H;
                                                                    if (xj5.a(gc9Var5, gc9Var4)) {
                                                                        objD3 = c37Var3.d(gc9Var3);
                                                                        if (objD3 == null) {
                                                                            objD3 = null;
                                                                        }
                                                                        iwVar = (iw) objD3;
                                                                        if (iwVar != null && (str2 = iwVar.u) != null) {
                                                                            str = str2;
                                                                        }
                                                                        long j6 = ((lja) lb9Var4.f(gc9Var4)).a;
                                                                        num7 = num7;
                                                                        lmVar = this;
                                                                        lmVar.t(lmVar.g(lmVar.r(i6), Integer.valueOf((int) (j6 >> 32)), Integer.valueOf((int) (j6 & 4294967295L)), Integer.valueOf(str.length()), G(str)));
                                                                        lmVar.x(i29);
                                                                        g2b g2bVar4 = g2b.a;
                                                                    } else {
                                                                        num7 = num7;
                                                                        if (!xj5.a(gc9Var5, gc9Var6) || xj5.a(gc9Var5, ac9.w)) {
                                                                            lmVar.n(qr5Var3);
                                                                            size = arrayList3.size();
                                                                            i12 = 0;
                                                                            while (true) {
                                                                                if (i12 >= size) {
                                                                                    s69Var2 = null;
                                                                                    break;
                                                                                } else {
                                                                                    if (((s69) arrayList3.get(i12)).t == i6) {
                                                                                        s69Var2 = (s69) arrayList3.get(i12);
                                                                                        break;
                                                                                    }
                                                                                    i12++;
                                                                                }
                                                                            }
                                                                            s69Var2.getClass();
                                                                            objD = c37Var3.d(gc9Var6);
                                                                            if (objD == null) {
                                                                                objD = null;
                                                                            }
                                                                            s69Var2.x = (c69) objD;
                                                                            objD2 = c37Var3.d(ac9.w);
                                                                            if (objD2 == null) {
                                                                                objD2 = null;
                                                                            }
                                                                            s69Var2.y = (c69) objD2;
                                                                            if (s69Var2.u.contains(s69Var2)) {
                                                                                lmVar.t.getSnapshotObserver().a.d(s69Var2, lmVar.c0, new nm(s69Var2, lmVar));
                                                                            }
                                                                            g2b g2bVar5 = g2b.a;
                                                                        } else if (xj5.a(gc9Var5, ac9.l)) {
                                                                            obj3.getClass();
                                                                            if (((Boolean) obj3).booleanValue()) {
                                                                                i13 = 8;
                                                                                lmVar.t(lmVar.f(lmVar.r(i29), 8));
                                                                            } else {
                                                                                i13 = 8;
                                                                            }
                                                                            v(lmVar, lmVar.r(i29), AudioConstants.AUDIO_FILE_BUFFER_SIZE, num7, i13);
                                                                        } else {
                                                                            gc9<List<dd2>> gc9Var8 = kb9.x;
                                                                            if (xj5.a(gc9Var5, gc9Var8)) {
                                                                                List list3 = (List) lb9Var4.f(gc9Var8);
                                                                                Object objD10 = c37Var2.d(gc9Var8);
                                                                                if (objD10 == null) {
                                                                                    objD10 = null;
                                                                                }
                                                                                List list4 = (List) objD10;
                                                                                if (list4 != null) {
                                                                                    d37 d37VarA = a49.a();
                                                                                    int size3 = list3.size();
                                                                                    for (int i40 = 0; i40 < size3; i40++) {
                                                                                        ((dd2) list3.get(i40)).getClass();
                                                                                        d37VarA.a(null);
                                                                                    }
                                                                                    obj = null;
                                                                                    d37 d37VarA2 = a49.a();
                                                                                    int size4 = list4.size();
                                                                                    for (int i41 = 0; i41 < size4; i41++) {
                                                                                        ((dd2) list4.get(i41)).getClass();
                                                                                        d37VarA2.a(null);
                                                                                    }
                                                                                    z2 = !d37VarA.equals(d37VarA2);
                                                                                } else {
                                                                                    obj = null;
                                                                                    if (!list3.isEmpty()) {
                                                                                        z2 = true;
                                                                                    }
                                                                                }
                                                                                g2b g2bVar6 = g2b.a;
                                                                            } else {
                                                                                obj = null;
                                                                                if (obj3 instanceof k3) {
                                                                                    k3 k3Var = (k3) obj3;
                                                                                    Object objD11 = c37Var2.d(gc9Var5);
                                                                                    if (objD11 == null) {
                                                                                        objD11 = null;
                                                                                    }
                                                                                    if (k3Var != objD11) {
                                                                                        if (objD11 instanceof k3) {
                                                                                            String str4 = k3Var.a;
                                                                                            k3 k3Var2 = (k3) objD11;
                                                                                            T t2 = k3Var2.b;
                                                                                            if (xj5.a(str4, k3Var2.a) && (((t = k3Var.b) != 0 || t2 == 0) && (t == 0 || t2 != 0))) {
                                                                                            }
                                                                                        }
                                                                                        z2 = true;
                                                                                    }
                                                                                    z2 = false;
                                                                                } else {
                                                                                    z2 = true;
                                                                                }
                                                                                g2b g2bVar7 = g2b.a;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        num7 = num7;
                                                        i6 = i6;
                                                        c37Var2 = c37Var2;
                                                        num6 = num6;
                                                        i9 = i35;
                                                    }
                                                }
                                                i9 = i35;
                                            } else {
                                                Object objD12 = c37Var2.d(gc9Var5);
                                                if (objD12 == null) {
                                                    objD12 = null;
                                                }
                                                if (!xj5.a(obj3, objD12)) {
                                                    gc9Var = ac9.d;
                                                    if (xj5.a(gc9Var5, gc9Var)) {
                                                        obj3.getClass();
                                                        str3 = (String) obj3;
                                                        zB2 = c37Var2.b(gc9Var);
                                                        i19 = i28;
                                                        if (zB2) {
                                                            lmVar.w(i6, i19, str3);
                                                        }
                                                        g2b g2bVar8 = g2b.a;
                                                    } else {
                                                        i11 = i28;
                                                        if (xj5.a(gc9Var5, ac9.b)) {
                                                            v(lmVar, lmVar.r(i6), AudioConstants.AUDIO_FILE_BUFFER_SIZE, num6, i11);
                                                            v(lmVar, lmVar.r(i6), AudioConstants.AUDIO_FILE_BUFFER_SIZE, num7, i11);
                                                        } else if (xj5.a(gc9Var5, ac9.K)) {
                                                            v(lmVar, lmVar.r(i6), AudioConstants.AUDIO_FILE_BUFFER_SIZE, 8192, 8);
                                                            v(lmVar, lmVar.r(i6), AudioConstants.AUDIO_FILE_BUFFER_SIZE, num7, 8);
                                                        } else if (xj5.a(gc9Var5, ac9.M)) {
                                                            v(lmVar, lmVar.r(i6), AudioConstants.AUDIO_FILE_BUFFER_SIZE, 3072, 8);
                                                        } else if (xj5.a(gc9Var5, ac9.c)) {
                                                            v(lmVar, lmVar.r(i6), AudioConstants.AUDIO_FILE_BUFFER_SIZE, num6, 8);
                                                            v(lmVar, lmVar.r(i6), AudioConstants.AUDIO_FILE_BUFFER_SIZE, num7, 8);
                                                        } else {
                                                            gc9Var2 = ac9.J;
                                                            arrayList4 = arrayList4;
                                                            if (xj5.a(gc9Var5, gc9Var2)) {
                                                                objD6 = c37Var3.d(ac9.z);
                                                                if (objD6 == null) {
                                                                    objD6 = null;
                                                                }
                                                                ex8Var = (ex8) objD6;
                                                                if (ex8Var == null) {
                                                                    qr5Var3 = qr5Var3;
                                                                    i10 = i32;
                                                                    v(lmVar, lmVar.r(i6), AudioConstants.AUDIO_FILE_BUFFER_SIZE, num6, 8);
                                                                    v(lmVar, lmVar.r(i6), AudioConstants.AUDIO_FILE_BUFFER_SIZE, num7, 8);
                                                                } else {
                                                                    objD7 = c37Var3.d(gc9Var2);
                                                                    if (objD7 == null) {
                                                                        objD7 = null;
                                                                    }
                                                                    if (xj5.a(objD7, Boolean.TRUE)) {
                                                                        accessibilityEventF = lmVar.f(lmVar.r(i6), 4);
                                                                        ub9 ub9Var5 = ub9Var;
                                                                        qr5Var3 = qr5Var3;
                                                                        ub9 ub9Var6 = new ub9(ub9Var5.a, true, qr5Var3, lb9Var4);
                                                                        objD8 = ub9Var6.k().t.d(ac9.a);
                                                                        if (objD8 == null) {
                                                                            objD8 = null;
                                                                        }
                                                                        List list5 = (List) objD8;
                                                                        ub9Var = ub9Var5;
                                                                        if (list5 != null) {
                                                                        }
                                                                        objD9 = ub9Var6.k().t.d(ac9.C);
                                                                        if (objD9 == null) {
                                                                            objD9 = null;
                                                                        }
                                                                        list = (List) objD9;
                                                                        i10 = i32;
                                                                        if (list != null) {
                                                                            strA2 = ab6.a(list, ",", null, 62);
                                                                        } else {
                                                                            strA2 = null;
                                                                        }
                                                                        if (strA != null) {
                                                                            accessibilityEventF.setContentDescription(strA);
                                                                            g2b g2bVar9 = g2b.a;
                                                                        }
                                                                        if (strA2 != null) {
                                                                            accessibilityEventF.getText().add(strA2);
                                                                        }
                                                                        lmVar.t(accessibilityEventF);
                                                                    } else {
                                                                        qr5Var3 = qr5Var3;
                                                                        i10 = i32;
                                                                        v(lmVar, lmVar.r(i6), AudioConstants.AUDIO_FILE_BUFFER_SIZE, num7, 8);
                                                                    }
                                                                }
                                                            } else {
                                                                qr5Var3 = qr5Var3;
                                                                i10 = i32;
                                                                if (xj5.a(gc9Var5, ac9.a)) {
                                                                    int iR2 = lmVar.r(i6);
                                                                    obj3.getClass();
                                                                    lmVar.u(iR2, AudioConstants.AUDIO_FILE_BUFFER_SIZE, 4, (List) obj3);
                                                                } else {
                                                                    gc9Var3 = ac9.G;
                                                                    zA = xj5.a(gc9Var5, gc9Var3);
                                                                    str = BuildConfig.FLAVOR;
                                                                    if (zA) {
                                                                        if (c37Var3.b(kb9.k)) {
                                                                            objD4 = c37Var2.d(gc9Var3);
                                                                            if (objD4 == null) {
                                                                                objD4 = null;
                                                                            }
                                                                            iwVar2 = (iw) objD4;
                                                                            if (iwVar2 == null) {
                                                                                iwVar2 = BuildConfig.FLAVOR;
                                                                            }
                                                                            objD5 = c37Var3.d(gc9Var3);
                                                                            if (objD5 == null) {
                                                                                objD5 = null;
                                                                            }
                                                                            charSequence = (iw) objD5;
                                                                            if (charSequence == null) {
                                                                                charSequence = BuildConfig.FLAVOR;
                                                                            }
                                                                            charSequenceG = G(charSequence);
                                                                            length = iwVar2.length();
                                                                            length2 = charSequence.length();
                                                                            if (length > length2) {
                                                                                i14 = length2;
                                                                            } else {
                                                                                i14 = length;
                                                                            }
                                                                            num5 = num7;
                                                                            i15 = 0;
                                                                            while (true) {
                                                                                num6 = num6;
                                                                                if (i15 < i14) {
                                                                                    i16 = length;
                                                                                    break;
                                                                                }
                                                                                i16 = length;
                                                                                if (iwVar2.charAt(i15) != charSequence.charAt(i15)) {
                                                                                    break;
                                                                                    break;
                                                                                } else {
                                                                                    i15++;
                                                                                    length = i16;
                                                                                    num6 = num6;
                                                                                }
                                                                            }
                                                                            i17 = 0;
                                                                            while (true) {
                                                                                if (i17 < i14 - i15) {
                                                                                    i18 = i17;
                                                                                    break;
                                                                                }
                                                                                i18 = i17;
                                                                                if (iwVar2.charAt((i16 - 1) - i17) != charSequence.charAt((length2 - 1) - i18)) {
                                                                                    break;
                                                                                    break;
                                                                                }
                                                                                i17 = i18 + 1;
                                                                            }
                                                                            int i310 = (i16 - i18) - i15;
                                                                            int i311 = (length2 - i18) - i15;
                                                                            gc9<g2b> gc9Var9 = ac9.L;
                                                                            boolean zB5 = c37Var2.b(gc9Var9);
                                                                            boolean zB6 = c37Var3.b(gc9Var9);
                                                                            zB = c37Var2.b(ac9.G);
                                                                            if (zB) {
                                                                                z5 = false;
                                                                            } else {
                                                                                z5 = false;
                                                                            }
                                                                            if (zB) {
                                                                                z6 = false;
                                                                            } else {
                                                                                z6 = false;
                                                                            }
                                                                            if (z5) {
                                                                                i6 = i6;
                                                                                num7 = num5;
                                                                                accessibilityEventG = lmVar.g(lmVar.r(i6), num7, num5, Integer.valueOf(length2), charSequenceG);
                                                                            } else {
                                                                                i6 = i6;
                                                                                num7 = num5;
                                                                                accessibilityEventG = lmVar.g(lmVar.r(i6), num7, num5, Integer.valueOf(length2), charSequenceG);
                                                                            }
                                                                            accessibilityEventG.setClassName("android.widget.EditText");
                                                                            lmVar.t(accessibilityEventG);
                                                                            if (z5) {
                                                                                long j7 = ((lja) lb9Var4.f(ac9.H)).a;
                                                                                accessibilityEventG.setFromIndex((int) (j7 >> 32));
                                                                                accessibilityEventG.setToIndex((int) (j7 & 4294967295L));
                                                                                lmVar.t(accessibilityEventG);
                                                                            } else {
                                                                                long j8 = ((lja) lb9Var4.f(ac9.H)).a;
                                                                                accessibilityEventG.setFromIndex((int) (j8 >> 32));
                                                                                accessibilityEventG.setToIndex((int) (j8 & 4294967295L));
                                                                                lmVar.t(accessibilityEventG);
                                                                            }
                                                                            g2b g2bVar10 = g2b.a;
                                                                        } else {
                                                                            i6 = i6;
                                                                            c37Var2 = c37Var2;
                                                                            num6 = num6;
                                                                            v(lmVar, lmVar.r(i6), AudioConstants.AUDIO_FILE_BUFFER_SIZE, Integer.valueOf(i23), 8);
                                                                        }
                                                                        num7 = num7;
                                                                        i9 = i35;
                                                                    } else {
                                                                        i6 = i6;
                                                                        c37Var2 = c37Var2;
                                                                        num6 = num6;
                                                                        i9 = i35;
                                                                        gc9Var4 = ac9.H;
                                                                        if (xj5.a(gc9Var5, gc9Var4)) {
                                                                            objD3 = c37Var3.d(gc9Var3);
                                                                            if (objD3 == null) {
                                                                                objD3 = null;
                                                                            }
                                                                            iwVar = (iw) objD3;
                                                                            if (iwVar != null) {
                                                                                str = str2;
                                                                            }
                                                                            long j9 = ((lja) lb9Var4.f(gc9Var4)).a;
                                                                            num7 = num7;
                                                                            lmVar = this;
                                                                            lmVar.t(lmVar.g(lmVar.r(i6), Integer.valueOf((int) (j9 >> 32)), Integer.valueOf((int) (j9 & 4294967295L)), Integer.valueOf(str.length()), G(str)));
                                                                            lmVar.x(i29);
                                                                            g2b g2bVar11 = g2b.a;
                                                                        } else {
                                                                            num7 = num7;
                                                                            if (xj5.a(gc9Var5, gc9Var6)) {
                                                                                lmVar.n(qr5Var3);
                                                                                size = arrayList3.size();
                                                                                i12 = 0;
                                                                                while (true) {
                                                                                    if (i12 >= size) {
                                                                                        s69Var2 = null;
                                                                                        break;
                                                                                    } else {
                                                                                        if (((s69) arrayList3.get(i12)).t == i6) {
                                                                                            s69Var2 = (s69) arrayList3.get(i12);
                                                                                            break;
                                                                                        }
                                                                                        i12++;
                                                                                    }
                                                                                }
                                                                                s69Var2.getClass();
                                                                                objD = c37Var3.d(gc9Var6);
                                                                                if (objD == null) {
                                                                                    objD = null;
                                                                                }
                                                                                s69Var2.x = (c69) objD;
                                                                                objD2 = c37Var3.d(ac9.w);
                                                                                if (objD2 == null) {
                                                                                    objD2 = null;
                                                                                }
                                                                                s69Var2.y = (c69) objD2;
                                                                                if (s69Var2.u.contains(s69Var2)) {
                                                                                    lmVar.t.getSnapshotObserver().a.d(s69Var2, lmVar.c0, new nm(s69Var2, lmVar));
                                                                                }
                                                                                g2b g2bVar12 = g2b.a;
                                                                            } else {
                                                                                lmVar.n(qr5Var3);
                                                                                size = arrayList3.size();
                                                                                i12 = 0;
                                                                                while (true) {
                                                                                    if (i12 >= size) {
                                                                                        s69Var2 = null;
                                                                                        break;
                                                                                    } else {
                                                                                        if (((s69) arrayList3.get(i12)).t == i6) {
                                                                                            s69Var2 = (s69) arrayList3.get(i12);
                                                                                            break;
                                                                                        }
                                                                                        i12++;
                                                                                    }
                                                                                }
                                                                                s69Var2.getClass();
                                                                                objD = c37Var3.d(gc9Var6);
                                                                                if (objD == null) {
                                                                                    objD = null;
                                                                                }
                                                                                s69Var2.x = (c69) objD;
                                                                                objD2 = c37Var3.d(ac9.w);
                                                                                if (objD2 == null) {
                                                                                    objD2 = null;
                                                                                }
                                                                                s69Var2.y = (c69) objD2;
                                                                                if (s69Var2.u.contains(s69Var2)) {
                                                                                    lmVar.t.getSnapshotObserver().a.d(s69Var2, lmVar.c0, new nm(s69Var2, lmVar));
                                                                                }
                                                                                g2b g2bVar13 = g2b.a;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            num7 = num7;
                                                            i6 = i6;
                                                            c37Var2 = c37Var2;
                                                            num6 = num6;
                                                            i9 = i35;
                                                        }
                                                    }
                                                }
                                                i9 = i35;
                                            }
                                            i28 = 8;
                                            c37Var2 = c37Var2;
                                            i32 = i10;
                                            lb9Var3 = lb9Var2;
                                            qr5Var3 = qr5Var3;
                                            i33++;
                                            i6 = i6;
                                            j4 = j >> 8;
                                            length4 = i9;
                                            num7 = num7;
                                            arrayList4 = arrayList4;
                                            num6 = num6;
                                        } else {
                                            lb9Var2 = lb9Var3;
                                            j = j4;
                                            i33 = i33;
                                            i9 = length4;
                                        }
                                        i10 = i32;
                                        c37Var2 = c37Var2;
                                        i28 = 8;
                                        c37Var2 = c37Var2;
                                        i32 = i10;
                                        lb9Var3 = lb9Var2;
                                        qr5Var3 = qr5Var3;
                                        i33++;
                                        i6 = i6;
                                        j4 = j >> 8;
                                        length4 = i9;
                                        num7 = num7;
                                        arrayList4 = arrayList4;
                                        num6 = num6;
                                    }
                                    i7 = i6;
                                    lb9Var = lb9Var3;
                                    num3 = num6;
                                    arrayList2 = arrayList4;
                                    int i42 = i32;
                                    qr5Var = qr5Var3;
                                    z = true;
                                    i8 = length4;
                                    num4 = num7;
                                    c37Var = c37Var2;
                                    if (i42 != i28) {
                                        break;
                                    }
                                } else {
                                    i7 = i6;
                                    lb9Var = lb9Var3;
                                    c37Var = c37Var2;
                                    num3 = num6;
                                    arrayList2 = arrayList4;
                                    qr5Var = qr5Var3;
                                    z = true;
                                    i8 = length4;
                                    num4 = num7;
                                }
                                if (i31 == i8) {
                                    break;
                                }
                                num7 = num4;
                                i6 = i7;
                                c37Var2 = c37Var;
                                qr5Var3 = qr5Var;
                                ub9Var2 = ub9Var;
                                lb9Var3 = lb9Var;
                                arrayList4 = arrayList2;
                                i28 = 8;
                                i30 = i31 + 1;
                                length4 = i8;
                                num6 = num3;
                            }
                        } else {
                            lb9Var = lb9Var3;
                            num3 = num6;
                            arrayList2 = arrayList4;
                            i3 = i26;
                            ub9Var = ub9Var2;
                            z = true;
                            num4 = num7;
                            i7 = i6;
                            z2 = false;
                        }
                        if (!z2) {
                            Iterator<Map.Entry<? extends gc9<?>, ? extends Object>> it = lb9Var.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    z3 = false;
                                    break;
                                }
                                if (!ub9Var.k().t.b(it.next().getKey())) {
                                    z3 = z;
                                    break;
                                }
                            }
                            z2 = z3;
                        }
                        if (z2) {
                            int iR3 = lmVar.r(i7);
                            i5 = 8;
                            v(lmVar, iR3, AudioConstants.AUDIO_FILE_BUFFER_SIZE, num4, 8);
                        } else {
                            i5 = 8;
                        }
                    }
                    j3 >>= i5;
                    i27 = i2 + 1;
                    zf5Var2 = zf5Var;
                    num7 = num4;
                    i25 = i5;
                    iArr3 = iArr2;
                    jArr3 = jArr2;
                    i22 = i4;
                    i26 = i3;
                    arrayList4 = arrayList2;
                    num6 = num3;
                }
                num = num6;
                arrayList = arrayList4;
                iArr = iArr3;
                jArr = jArr3;
                int i43 = i22;
                num2 = num7;
                if (i26 != i25) {
                    return;
                } else {
                    i = i43;
                }
            } else {
                num = num6;
                arrayList = arrayList4;
                iArr = iArr3;
                jArr = jArr3;
                num2 = num7;
                i = i22;
            }
            if (i == i24) {
                return;
            }
            i22 = i + 1;
            zf5Var2 = zf5Var;
            length3 = i24;
            num7 = num2;
            i20 = i23;
            iArr3 = iArr;
            jArr3 = jArr;
            arrayList4 = arrayList;
            num6 = num;
            i21 = 0;
        }
    }

    public final void z(qr5 qr5Var, f27 f27Var) {
        lb9 lb9VarR;
        if (qr5Var.e() && !this.t.getAndroidViewsHandler$ui().getLayoutNodeToHolder().containsKey(qr5Var)) {
            qr5 qr5Var2 = null;
            if (!qr5Var.Y.d(8)) {
                qr5Var = qr5Var.I();
                while (true) {
                    if (qr5Var == null) {
                        qr5Var = null;
                        break;
                    } else if (qr5Var.Y.d(8)) {
                        break;
                    } else {
                        qr5Var = qr5Var.I();
                    }
                }
            }
            if (qr5Var == null || (lb9VarR = qr5Var.r()) == null) {
                return;
            }
            if (!lb9VarR.v) {
                for (qr5 qr5VarI = qr5Var.I(); qr5VarI != null; qr5VarI = qr5VarI.I()) {
                    lb9 lb9VarR2 = qr5VarI.r();
                    if (lb9VarR2 != null && lb9VarR2.v) {
                        qr5Var2 = qr5VarI;
                        break;
                    }
                }
                if (qr5Var2 != null) {
                    qr5Var = qr5Var2;
                }
            }
            int i = qr5Var.u;
            if (f27Var.a(i)) {
                v(this, r(i), AudioConstants.AUDIO_FILE_BUFFER_SIZE, 1, 8);
            }
        }
    }
}
