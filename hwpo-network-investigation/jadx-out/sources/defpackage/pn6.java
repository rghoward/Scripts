package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Display;
import android.view.Surface;
import androidx.media3.exoplayer.l;
import io.ably.lib.transport.Defaults;
import io.ably.lib.util.Crypto;
import io.ably.lib.util.Log;
import io.intercom.android.sdk.m5.inbox.data.InboxPagingSource;
import io.intercom.android.sdk.models.Config;
import io.intercom.android.sdk.models.carousel.Carousel;
import io.intercom.android.sdk.survey.SurveyViewModel;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;
import o28.c;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class pn6 extends in6 {
    public static final int[] U1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    public static boolean V1;
    public static boolean W1;
    public int A1;
    public int B1;
    public int C1;
    public a89 D1;
    public long E1;
    public boolean F1;
    public long G1;
    public int H1;
    public long I1;
    public tfb J1;
    public tfb K1;
    public int L1;
    public boolean M1;
    public int N1;
    public e O1;
    public zeb P1;
    public long Q1;
    public long R1;
    public boolean S1;
    public int T1;
    public final Context b1;
    public final boolean c1;
    public final rfb.a d1;
    public final int e1;
    public final boolean f1;
    public final bfb g1;
    public final bfb.a h1;
    public final sf0 i1;
    public final long j1;
    public final cfb k1;
    public final PriorityQueue<Long> l1;
    public d m1;
    public boolean n1;
    public boolean o1;
    public sfb p1;
    public boolean q1;
    public int r1;
    public List<Object> s1;
    public Surface t1;
    public wz7 u1;
    public ar9 v1;
    public boolean w1;
    public int x1;
    public int y1;
    public long z1;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a implements sfb.b {
        public final /* synthetic */ an6 a;
        public final /* synthetic */ int b;

        public a(an6 an6Var, int i, long j) {
            this.a = an6Var;
            this.b = i;
        }

        @Override // sfb.b
        public final void a(long j) {
            pn6.this.Y0(this.a, this.b, j);
        }

        @Override // sfb.b
        public final void b() {
            Trace.beginSection("dropVideoBuffer");
            this.a.e(this.b);
            Trace.endSection();
            pn6.this.d1(0, 1);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b {
        public static boolean a(Context context) {
            Display.HdrCapabilities hdrCapabilities;
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            Display display = displayManager != null ? displayManager.getDisplay(0) : null;
            if (display == null || !display.isHdr() || (hdrCapabilities = display.getHdrCapabilities()) == null) {
                return false;
            }
            for (int i : hdrCapabilities.getSupportedHdrTypes()) {
                if (i == 1) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c {
        public final Context a;
        public boolean b;
        public an6.b c;
        public long d;
        public Handler e;
        public androidx.media3.exoplayer.d.b f;
        public int g;

        public c(Context context) {
            this.a = context;
            this.c = new gs2(context);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class d {
        public final int a;
        public final int b;
        public final int c;

        public d(int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            this.c = i3;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class e implements Handler.Callback {
        public final Handler t;

        public e(an6 an6Var) {
            Handler handlerP = n6b.p(this);
            this.t = handlerP;
            an6Var.r(this, handlerP);
        }

        public final void a(long j) {
            Surface surface;
            pn6 pn6Var = pn6.this;
            rfb.a aVar = pn6Var.d1;
            if (this != pn6Var.O1 || pn6Var.g0 == null) {
                return;
            }
            if (j == Long.MAX_VALUE) {
                pn6Var.O0 = true;
                return;
            }
            try {
                pn6Var.O0(j);
                tfb tfbVar = pn6Var.J1;
                if (!tfbVar.equals(tfb.d) && !tfbVar.equals(pn6Var.K1)) {
                    pn6Var.K1 = tfbVar;
                    aVar.a(tfbVar);
                }
                pn6Var.Q0.e++;
                bfb bfbVar = pn6Var.g1;
                boolean z = bfbVar.e != 3;
                bfbVar.e = 3;
                bfbVar.g = n6b.N(bfbVar.l.c());
                if (z && (surface = pn6Var.t1) != null) {
                    Handler handler = aVar.a;
                    if (handler != null) {
                        handler.post(new jfb(aVar, surface, SystemClock.elapsedRealtime()));
                    }
                    pn6Var.w1 = true;
                }
                pn6Var.t0(j);
            } catch (lo3 e) {
                pn6Var.P0 = e;
            }
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            int i = message.arg1;
            int i2 = message.arg2;
            String str = n6b.a;
            a(((((long) i) & 4294967295L) << 32) | (4294967295L & ((long) i2)));
            return true;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public pn6(c cVar) {
        Context context = cVar.a;
        super(context.getApplicationContext(), 2, cVar.c, 30.0f);
        Context applicationContext = context.getApplicationContext();
        this.b1 = applicationContext;
        this.e1 = cVar.g;
        this.p1 = null;
        this.d1 = new rfb.a(cVar.e, cVar.f);
        this.c1 = this.p1 == null;
        this.g1 = new bfb(applicationContext, this, cVar.d);
        this.h1 = new bfb.a();
        this.f1 = "NVIDIA".equals(Build.MANUFACTURER);
        this.v1 = ar9.c;
        this.x1 = 1;
        this.y1 = 0;
        this.J1 = tfb.d;
        this.N1 = 0;
        this.K1 = null;
        this.L1 = -1000;
        this.Q1 = -9223372036854775807L;
        this.R1 = -9223372036854775807L;
        this.i1 = new sf0();
        this.l1 = new PriorityQueue<>();
        this.j1 = -15000L;
        this.k1 = new cfb();
        this.D1 = null;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0124  */
    /* JADX WARN: Code duplicated, block: B:102:0x0127  */
    /* JADX WARN: Code duplicated, block: B:105:0x0130  */
    /* JADX WARN: Code duplicated, block: B:106:0x0134  */
    /* JADX WARN: Code duplicated, block: B:109:0x013d  */
    /* JADX WARN: Code duplicated, block: B:110:0x0141  */
    /* JADX WARN: Code duplicated, block: B:113:0x014a  */
    /* JADX WARN: Code duplicated, block: B:114:0x014e  */
    /* JADX WARN: Code duplicated, block: B:117:0x0157  */
    /* JADX WARN: Code duplicated, block: B:118:0x015b  */
    /* JADX WARN: Code duplicated, block: B:121:0x0164  */
    /* JADX WARN: Code duplicated, block: B:122:0x0168  */
    /* JADX WARN: Code duplicated, block: B:125:0x0171  */
    /* JADX WARN: Code duplicated, block: B:126:0x0175  */
    /* JADX WARN: Code duplicated, block: B:129:0x017e  */
    /* JADX WARN: Code duplicated, block: B:130:0x0182  */
    /* JADX WARN: Code duplicated, block: B:133:0x018b  */
    /* JADX WARN: Code duplicated, block: B:134:0x018f  */
    /* JADX WARN: Code duplicated, block: B:137:0x0198  */
    /* JADX WARN: Code duplicated, block: B:138:0x019c  */
    /* JADX WARN: Code duplicated, block: B:141:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:142:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:145:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:146:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:149:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:150:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:153:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:154:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:157:0x01de  */
    /* JADX WARN: Code duplicated, block: B:158:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:161:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:162:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:165:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:166:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:169:0x0208  */
    /* JADX WARN: Code duplicated, block: B:170:0x020c  */
    /* JADX WARN: Code duplicated, block: B:173:0x0216  */
    /* JADX WARN: Code duplicated, block: B:174:0x021a  */
    /* JADX WARN: Code duplicated, block: B:177:0x0224  */
    /* JADX WARN: Code duplicated, block: B:178:0x0228  */
    /* JADX WARN: Code duplicated, block: B:181:0x0232  */
    /* JADX WARN: Code duplicated, block: B:182:0x0236  */
    /* JADX WARN: Code duplicated, block: B:185:0x0240  */
    /* JADX WARN: Code duplicated, block: B:186:0x0244  */
    /* JADX WARN: Code duplicated, block: B:189:0x024e  */
    /* JADX WARN: Code duplicated, block: B:190:0x0252  */
    /* JADX WARN: Code duplicated, block: B:193:0x025c  */
    /* JADX WARN: Code duplicated, block: B:194:0x0260  */
    /* JADX WARN: Code duplicated, block: B:197:0x026a  */
    /* JADX WARN: Code duplicated, block: B:198:0x026e  */
    /* JADX WARN: Code duplicated, block: B:201:0x0278  */
    /* JADX WARN: Code duplicated, block: B:202:0x027c  */
    /* JADX WARN: Code duplicated, block: B:205:0x0286  */
    /* JADX WARN: Code duplicated, block: B:206:0x028a  */
    /* JADX WARN: Code duplicated, block: B:209:0x0294  */
    /* JADX WARN: Code duplicated, block: B:210:0x0298  */
    /* JADX WARN: Code duplicated, block: B:213:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:214:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:217:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:218:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:221:0x02be  */
    /* JADX WARN: Code duplicated, block: B:222:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:225:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:226:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:229:0x02da  */
    /* JADX WARN: Code duplicated, block: B:230:0x02de  */
    /* JADX WARN: Code duplicated, block: B:233:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:234:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:237:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:238:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:241:0x0304  */
    /* JADX WARN: Code duplicated, block: B:242:0x0308  */
    /* JADX WARN: Code duplicated, block: B:245:0x0312  */
    /* JADX WARN: Code duplicated, block: B:246:0x0316  */
    /* JADX WARN: Code duplicated, block: B:249:0x0320  */
    /* JADX WARN: Code duplicated, block: B:250:0x0324  */
    /* JADX WARN: Code duplicated, block: B:253:0x032e  */
    /* JADX WARN: Code duplicated, block: B:254:0x0332  */
    /* JADX WARN: Code duplicated, block: B:257:0x033c  */
    /* JADX WARN: Code duplicated, block: B:258:0x0340  */
    /* JADX WARN: Code duplicated, block: B:261:0x034a  */
    /* JADX WARN: Code duplicated, block: B:262:0x034e  */
    /* JADX WARN: Code duplicated, block: B:265:0x0358  */
    /* JADX WARN: Code duplicated, block: B:266:0x035c  */
    /* JADX WARN: Code duplicated, block: B:269:0x0366  */
    /* JADX WARN: Code duplicated, block: B:270:0x036a  */
    /* JADX WARN: Code duplicated, block: B:273:0x0374  */
    /* JADX WARN: Code duplicated, block: B:274:0x0378  */
    /* JADX WARN: Code duplicated, block: B:277:0x0382  */
    /* JADX WARN: Code duplicated, block: B:278:0x0386  */
    /* JADX WARN: Code duplicated, block: B:281:0x0390  */
    /* JADX WARN: Code duplicated, block: B:282:0x0394  */
    /* JADX WARN: Code duplicated, block: B:285:0x039e  */
    /* JADX WARN: Code duplicated, block: B:286:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:289:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:290:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:293:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:294:0x03be  */
    /* JADX WARN: Code duplicated, block: B:297:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:298:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:301:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:302:0x03da  */
    /* JADX WARN: Code duplicated, block: B:305:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:306:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:309:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:310:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:313:0x0400  */
    /* JADX WARN: Code duplicated, block: B:314:0x0404  */
    /* JADX WARN: Code duplicated, block: B:317:0x040e  */
    /* JADX WARN: Code duplicated, block: B:318:0x0412  */
    /* JADX WARN: Code duplicated, block: B:321:0x041c  */
    /* JADX WARN: Code duplicated, block: B:322:0x0420  */
    /* JADX WARN: Code duplicated, block: B:325:0x042a  */
    /* JADX WARN: Code duplicated, block: B:326:0x042e  */
    /* JADX WARN: Code duplicated, block: B:329:0x0438  */
    /* JADX WARN: Code duplicated, block: B:330:0x043c  */
    /* JADX WARN: Code duplicated, block: B:333:0x0446  */
    /* JADX WARN: Code duplicated, block: B:334:0x044a  */
    /* JADX WARN: Code duplicated, block: B:337:0x0454  */
    /* JADX WARN: Code duplicated, block: B:338:0x0458  */
    /* JADX WARN: Code duplicated, block: B:341:0x0462  */
    /* JADX WARN: Code duplicated, block: B:342:0x0466  */
    /* JADX WARN: Code duplicated, block: B:345:0x0470  */
    /* JADX WARN: Code duplicated, block: B:346:0x0474  */
    /* JADX WARN: Code duplicated, block: B:349:0x047e  */
    /* JADX WARN: Code duplicated, block: B:350:0x0482  */
    /* JADX WARN: Code duplicated, block: B:353:0x048c  */
    /* JADX WARN: Code duplicated, block: B:354:0x0490  */
    /* JADX WARN: Code duplicated, block: B:357:0x049a  */
    /* JADX WARN: Code duplicated, block: B:358:0x049e  */
    /* JADX WARN: Code duplicated, block: B:361:0x04a8  */
    /* JADX WARN: Code duplicated, block: B:362:0x04ac  */
    /* JADX WARN: Code duplicated, block: B:365:0x04b6  */
    /* JADX WARN: Code duplicated, block: B:366:0x04ba  */
    /* JADX WARN: Code duplicated, block: B:369:0x04c4  */
    /* JADX WARN: Code duplicated, block: B:370:0x04c8  */
    /* JADX WARN: Code duplicated, block: B:373:0x04d2  */
    /* JADX WARN: Code duplicated, block: B:374:0x04d6  */
    /* JADX WARN: Code duplicated, block: B:377:0x04e0  */
    /* JADX WARN: Code duplicated, block: B:378:0x04e4  */
    /* JADX WARN: Code duplicated, block: B:381:0x04ee  */
    /* JADX WARN: Code duplicated, block: B:382:0x04f2  */
    /* JADX WARN: Code duplicated, block: B:385:0x04fc  */
    /* JADX WARN: Code duplicated, block: B:386:0x0500  */
    /* JADX WARN: Code duplicated, block: B:389:0x050a  */
    /* JADX WARN: Code duplicated, block: B:390:0x050e  */
    /* JADX WARN: Code duplicated, block: B:393:0x0518  */
    /* JADX WARN: Code duplicated, block: B:394:0x051c  */
    /* JADX WARN: Code duplicated, block: B:397:0x0526  */
    /* JADX WARN: Code duplicated, block: B:398:0x052a  */
    /* JADX WARN: Code duplicated, block: B:401:0x0534  */
    /* JADX WARN: Code duplicated, block: B:402:0x0538  */
    /* JADX WARN: Code duplicated, block: B:405:0x0542  */
    /* JADX WARN: Code duplicated, block: B:406:0x0546  */
    /* JADX WARN: Code duplicated, block: B:409:0x0550  */
    /* JADX WARN: Code duplicated, block: B:410:0x0554  */
    /* JADX WARN: Code duplicated, block: B:413:0x055e  */
    /* JADX WARN: Code duplicated, block: B:414:0x0562  */
    /* JADX WARN: Code duplicated, block: B:417:0x056c  */
    /* JADX WARN: Code duplicated, block: B:418:0x0570  */
    /* JADX WARN: Code duplicated, block: B:421:0x057a  */
    /* JADX WARN: Code duplicated, block: B:422:0x057e  */
    /* JADX WARN: Code duplicated, block: B:425:0x0588  */
    /* JADX WARN: Code duplicated, block: B:426:0x058c  */
    /* JADX WARN: Code duplicated, block: B:429:0x0596  */
    /* JADX WARN: Code duplicated, block: B:430:0x059a  */
    /* JADX WARN: Code duplicated, block: B:433:0x05a4  */
    /* JADX WARN: Code duplicated, block: B:434:0x05a8  */
    /* JADX WARN: Code duplicated, block: B:437:0x05b2  */
    /* JADX WARN: Code duplicated, block: B:438:0x05b6  */
    /* JADX WARN: Code duplicated, block: B:441:0x05c0  */
    /* JADX WARN: Code duplicated, block: B:442:0x05c4  */
    /* JADX WARN: Code duplicated, block: B:445:0x05ce  */
    /* JADX WARN: Code duplicated, block: B:446:0x05d2  */
    /* JADX WARN: Code duplicated, block: B:449:0x05dc  */
    /* JADX WARN: Code duplicated, block: B:450:0x05e0  */
    /* JADX WARN: Code duplicated, block: B:453:0x05ea  */
    /* JADX WARN: Code duplicated, block: B:454:0x05ee  */
    /* JADX WARN: Code duplicated, block: B:457:0x05f8  */
    /* JADX WARN: Code duplicated, block: B:458:0x05fc  */
    /* JADX WARN: Code duplicated, block: B:461:0x0606  */
    /* JADX WARN: Code duplicated, block: B:462:0x060a  */
    /* JADX WARN: Code duplicated, block: B:465:0x0614  */
    /* JADX WARN: Code duplicated, block: B:466:0x0618  */
    /* JADX WARN: Code duplicated, block: B:469:0x0622  */
    /* JADX WARN: Code duplicated, block: B:470:0x0626  */
    /* JADX WARN: Code duplicated, block: B:473:0x0630  */
    /* JADX WARN: Code duplicated, block: B:474:0x0634  */
    /* JADX WARN: Code duplicated, block: B:477:0x063e  */
    /* JADX WARN: Code duplicated, block: B:478:0x0642  */
    /* JADX WARN: Code duplicated, block: B:481:0x064c  */
    /* JADX WARN: Code duplicated, block: B:482:0x0650  */
    /* JADX WARN: Code duplicated, block: B:485:0x065a  */
    /* JADX WARN: Code duplicated, block: B:486:0x065e  */
    /* JADX WARN: Code duplicated, block: B:489:0x0668  */
    /* JADX WARN: Code duplicated, block: B:490:0x066c  */
    /* JADX WARN: Code duplicated, block: B:493:0x0676  */
    /* JADX WARN: Code duplicated, block: B:494:0x067a  */
    /* JADX WARN: Code duplicated, block: B:497:0x0684  */
    /* JADX WARN: Code duplicated, block: B:498:0x0688  */
    /* JADX WARN: Code duplicated, block: B:49:0x008b A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:501:0x0692  */
    /* JADX WARN: Code duplicated, block: B:502:0x0696  */
    /* JADX WARN: Code duplicated, block: B:505:0x06a0  */
    /* JADX WARN: Code duplicated, block: B:506:0x06a4  */
    /* JADX WARN: Code duplicated, block: B:509:0x06ae  */
    /* JADX WARN: Code duplicated, block: B:50:0x008e  */
    /* JADX WARN: Code duplicated, block: B:510:0x06b2  */
    /* JADX WARN: Code duplicated, block: B:513:0x06bc  */
    /* JADX WARN: Code duplicated, block: B:514:0x06c0  */
    /* JADX WARN: Code duplicated, block: B:517:0x06ca  */
    /* JADX WARN: Code duplicated, block: B:518:0x06ce  */
    /* JADX WARN: Code duplicated, block: B:521:0x06d8  */
    /* JADX WARN: Code duplicated, block: B:522:0x06dc  */
    /* JADX WARN: Code duplicated, block: B:525:0x06e6  */
    /* JADX WARN: Code duplicated, block: B:526:0x06ea  */
    /* JADX WARN: Code duplicated, block: B:529:0x06f4  */
    /* JADX WARN: Code duplicated, block: B:530:0x06f8  */
    /* JADX WARN: Code duplicated, block: B:533:0x0702  */
    /* JADX WARN: Code duplicated, block: B:534:0x0706  */
    /* JADX WARN: Code duplicated, block: B:537:0x0710  */
    /* JADX WARN: Code duplicated, block: B:538:0x0714  */
    /* JADX WARN: Code duplicated, block: B:541:0x071e  */
    /* JADX WARN: Code duplicated, block: B:542:0x0722  */
    /* JADX WARN: Code duplicated, block: B:545:0x072c  */
    /* JADX WARN: Code duplicated, block: B:546:0x0730  */
    /* JADX WARN: Code duplicated, block: B:549:0x073a  */
    /* JADX WARN: Code duplicated, block: B:552:0x0744  */
    /* JADX WARN: Code duplicated, block: B:553:0x0747  */
    /* JADX WARN: Code duplicated, block: B:556:0x0751  */
    /* JADX WARN: Code duplicated, block: B:557:0x0754  */
    /* JADX WARN: Code duplicated, block: B:55:0x009d A[Catch: all -> 0x08be, TRY_LEAVE, TryCatch #0 {all -> 0x08be, blocks: (B:7:0x000f, B:9:0x0013, B:11:0x0021, B:664:0x08b9, B:52:0x0092, B:55:0x009d, B:98:0x0118, B:667:0x08c0), top: B:672:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:560:0x075e  */
    /* JADX WARN: Code duplicated, block: B:561:0x0762  */
    /* JADX WARN: Code duplicated, block: B:564:0x076c  */
    /* JADX WARN: Code duplicated, block: B:565:0x0770  */
    /* JADX WARN: Code duplicated, block: B:568:0x077a  */
    /* JADX WARN: Code duplicated, block: B:569:0x077e  */
    /* JADX WARN: Code duplicated, block: B:572:0x0788  */
    /* JADX WARN: Code duplicated, block: B:573:0x078c  */
    /* JADX WARN: Code duplicated, block: B:576:0x0796  */
    /* JADX WARN: Code duplicated, block: B:577:0x079a  */
    /* JADX WARN: Code duplicated, block: B:580:0x07a4  */
    /* JADX WARN: Code duplicated, block: B:581:0x07a8  */
    /* JADX WARN: Code duplicated, block: B:584:0x07b2  */
    /* JADX WARN: Code duplicated, block: B:585:0x07b6  */
    /* JADX WARN: Code duplicated, block: B:588:0x07c0  */
    /* JADX WARN: Code duplicated, block: B:589:0x07c4  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:592:0x07ce  */
    /* JADX WARN: Code duplicated, block: B:593:0x07d2  */
    /* JADX WARN: Code duplicated, block: B:596:0x07dc  */
    /* JADX WARN: Code duplicated, block: B:597:0x07e0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:600:0x07ea  */
    /* JADX WARN: Code duplicated, block: B:601:0x07ee  */
    /* JADX WARN: Code duplicated, block: B:604:0x07f8  */
    /* JADX WARN: Code duplicated, block: B:605:0x07fc  */
    /* JADX WARN: Code duplicated, block: B:608:0x0806  */
    /* JADX WARN: Code duplicated, block: B:609:0x080a  */
    /* JADX WARN: Code duplicated, block: B:612:0x0814  */
    /* JADX WARN: Code duplicated, block: B:613:0x0818  */
    /* JADX WARN: Code duplicated, block: B:616:0x0822  */
    /* JADX WARN: Code duplicated, block: B:617:0x0826  */
    /* JADX WARN: Code duplicated, block: B:620:0x0830  */
    /* JADX WARN: Code duplicated, block: B:621:0x0834  */
    /* JADX WARN: Code duplicated, block: B:624:0x083e  */
    /* JADX WARN: Code duplicated, block: B:625:0x0842  */
    /* JADX WARN: Code duplicated, block: B:628:0x084c  */
    /* JADX WARN: Code duplicated, block: B:629:0x084f  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:632:0x0859  */
    /* JADX WARN: Code duplicated, block: B:633:0x085b  */
    /* JADX WARN: Code duplicated, block: B:636:0x0865  */
    /* JADX WARN: Code duplicated, block: B:637:0x0867  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:640:0x0871  */
    /* JADX WARN: Code duplicated, block: B:641:0x0873  */
    /* JADX WARN: Code duplicated, block: B:644:0x087d  */
    /* JADX WARN: Code duplicated, block: B:645:0x087f  */
    /* JADX WARN: Code duplicated, block: B:648:0x0889  */
    /* JADX WARN: Code duplicated, block: B:649:0x088b  */
    /* JADX WARN: Code duplicated, block: B:652:0x0895  */
    /* JADX WARN: Code duplicated, block: B:653:0x0897  */
    /* JADX WARN: Code duplicated, block: B:656:0x08a1  */
    /* JADX WARN: Code duplicated, block: B:657:0x08a3  */
    /* JADX WARN: Code duplicated, block: B:660:0x08ad  */
    /* JADX WARN: Code duplicated, block: B:662:0x08b1  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:682:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:683:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:684:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:685:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:686:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:687:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:688:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:689:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:690:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:691:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:692:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:693:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:694:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:695:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:696:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:697:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:698:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:699:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:700:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:701:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:702:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:703:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:704:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:705:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:706:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:707:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:708:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:709:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:710:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:711:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:712:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:713:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:714:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:715:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:716:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:717:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:718:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:719:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:720:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:721:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:722:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:723:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:724:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:725:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:726:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:727:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:728:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:729:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:730:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:731:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:732:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:733:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:734:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:735:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:736:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:737:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:738:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:739:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:740:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:741:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:742:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:743:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:744:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:745:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:746:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:747:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:748:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:749:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:750:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:751:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:752:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:753:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:754:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:755:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:756:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:757:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:758:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:759:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x00db  */
    /* JADX WARN: Code duplicated, block: B:760:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:761:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:762:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:763:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:764:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:765:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:766:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:767:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:768:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:769:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:770:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:771:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:772:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:773:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:774:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:775:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:776:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:777:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:778:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:779:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:780:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:781:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:782:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:783:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:784:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:785:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:786:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:787:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:788:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:789:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:790:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:791:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:792:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:793:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:794:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:795:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:796:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:797:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:798:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:799:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:800:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:801:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:802:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:803:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:804:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:805:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:806:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:807:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:808:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:809:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:810:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:811:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:812:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:813:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:814:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:815:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:816:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:817:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:818:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:819:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:820:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:821:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:822:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:823:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:824:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:825:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:826:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:827:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:828:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:829:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:830:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:86:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:87:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:90:0x0105  */
    /* JADX WARN: Code duplicated, block: B:91:0x0107  */
    /* JADX WARN: Code duplicated, block: B:94:0x0110  */
    /* JADX WARN: Code duplicated, block: B:96:0x0114  */
    /* JADX WARN: Code duplicated, block: B:98:0x0118 A[Catch: all -> 0x08be, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x08be, blocks: (B:7:0x000f, B:9:0x0013, B:11:0x0021, B:664:0x08b9, B:52:0x0092, B:55:0x009d, B:98:0x0118, B:667:0x08c0), top: B:672:0x000f }] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static boolean P0(String str) {
        String str2;
        byte b2;
        String str3;
        byte b3;
        boolean z = false;
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (pn6.class) {
            try {
                if (!V1) {
                    int i = Build.VERSION.SDK_INT;
                    byte b4 = 28;
                    if (i <= 28) {
                        String str4 = Build.DEVICE;
                        str4.getClass();
                        switch (str4.hashCode()) {
                            case -1339091551:
                                b3 = !str4.equals("dangal") ? (byte) -1 : (byte) 0;
                                break;
                            case -1220081023:
                                b3 = !str4.equals("dangalFHD") ? (byte) -1 : (byte) 1;
                                break;
                            case -1220066608:
                                b3 = !str4.equals("dangalUHD") ? (byte) -1 : (byte) 2;
                                break;
                            case -1012436106:
                                b3 = !str4.equals("oneday") ? (byte) -1 : (byte) 3;
                                break;
                            case -760312546:
                                b3 = !str4.equals("aquaman") ? (byte) -1 : (byte) 4;
                                break;
                            case -64886864:
                                b3 = !str4.equals("magnolia") ? (byte) -1 : (byte) 5;
                                break;
                            case 3415681:
                                b3 = !str4.equals("once") ? (byte) -1 : (byte) 6;
                                break;
                            case 825323514:
                                b3 = !str4.equals("machuca") ? (byte) -1 : (byte) 7;
                                break;
                            default:
                                b3 = -1;
                                break;
                        }
                        switch (b3) {
                            default:
                                if (i <= 27 || !"HWEML".equals(Build.DEVICE)) {
                                    str2 = Build.MODEL;
                                    str2.getClass();
                                    switch (str2.hashCode()) {
                                        case -349662828:
                                            if (!str2.equals("AFTJMST12")) {
                                                b2 = 0;
                                            } else {
                                                b2 = -1;
                                            }
                                            break;
                                        case -321033677:
                                            if (!str2.equals("AFTKMST12")) {
                                                b2 = 1;
                                            } else {
                                                b2 = -1;
                                            }
                                            break;
                                        case 2006354:
                                            if (!str2.equals("AFTA")) {
                                                b2 = 2;
                                            } else {
                                                b2 = -1;
                                            }
                                            break;
                                        case 2006367:
                                            if (!str2.equals("AFTN")) {
                                                b2 = 3;
                                            } else {
                                                b2 = -1;
                                            }
                                            break;
                                        case 2006371:
                                            if (!str2.equals("AFTR")) {
                                                b2 = 4;
                                            } else {
                                                b2 = -1;
                                            }
                                            break;
                                        case 1785421873:
                                            if (!str2.equals("AFTEU011")) {
                                                b2 = 5;
                                            } else {
                                                b2 = -1;
                                            }
                                            break;
                                        case 1785421876:
                                            if (!str2.equals("AFTEU014")) {
                                                b2 = 6;
                                            } else {
                                                b2 = -1;
                                            }
                                            break;
                                        case 1798172390:
                                            if (!str2.equals("AFTSO001")) {
                                                b2 = 7;
                                            } else {
                                                b2 = -1;
                                            }
                                            break;
                                        case 2119412532:
                                            if (!str2.equals("AFTEUFF014")) {
                                                b2 = 8;
                                            } else {
                                                b2 = -1;
                                            }
                                            break;
                                        default:
                                            b2 = -1;
                                            break;
                                    }
                                    switch (b2) {
                                        default:
                                            if (i <= 26) {
                                                str3 = Build.DEVICE;
                                                str3.getClass();
                                                switch (str3.hashCode()) {
                                                    case -2144781245:
                                                        if (!str3.equals("GIONEE_SWW1609")) {
                                                            b4 = 0;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -2144781185:
                                                        if (!str3.equals("GIONEE_SWW1627")) {
                                                            b4 = 1;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -2144781160:
                                                        if (!str3.equals("GIONEE_SWW1631")) {
                                                            b4 = 2;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -2097309513:
                                                        if (!str3.equals("K50a40")) {
                                                            b4 = 3;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -2022874474:
                                                        if (!str3.equals("CP8676_I02")) {
                                                            b4 = 4;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -1978993182:
                                                        if (!str3.equals("NX541J")) {
                                                            b4 = 5;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -1978990237:
                                                        if (!str3.equals("NX573J")) {
                                                            b4 = 6;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -1936688988:
                                                        if (!str3.equals("PGN528")) {
                                                            b4 = 7;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -1936688066:
                                                        if (!str3.equals("PGN610")) {
                                                            b4 = 8;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -1936688065:
                                                        if (!str3.equals("PGN611")) {
                                                            b4 = 9;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -1931988508:
                                                        if (!str3.equals("AquaPowerM")) {
                                                            b4 = 10;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -1885099851:
                                                        if (!str3.equals("RAIJIN")) {
                                                            b4 = 11;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -1696512866:
                                                        if (!str3.equals("XT1663")) {
                                                            b4 = 12;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -1680025915:
                                                        if (!str3.equals("ComioS1")) {
                                                            b4 = 13;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -1615810839:
                                                        if (!str3.equals("Phantom6")) {
                                                            b4 = 14;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -1600724499:
                                                        if (!str3.equals("pacificrim")) {
                                                            b4 = 15;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -1554255044:
                                                        if (!str3.equals("vernee_M5")) {
                                                            b4 = 16;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -1481772737:
                                                        if (!str3.equals("panell_dl")) {
                                                            b4 = 17;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -1481772730:
                                                        if (!str3.equals("panell_ds")) {
                                                            b4 = 18;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -1481772729:
                                                        if (!str3.equals("panell_dt")) {
                                                            b4 = 19;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -1320080169:
                                                        if (!str3.equals("GiONEE_GBL7319")) {
                                                            b4 = 20;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -1217592143:
                                                        if (!str3.equals("BRAVIA_ATV2")) {
                                                            b4 = 21;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -1180384755:
                                                        if (!str3.equals("iris60")) {
                                                            b4 = 22;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -1139198265:
                                                        if (!str3.equals("Slate_Pro")) {
                                                            b4 = 23;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -1052835013:
                                                        if (!str3.equals("namath")) {
                                                            b4 = 24;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -993250464:
                                                        if (!str3.equals("A10-70F")) {
                                                            b4 = 25;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -993250458:
                                                        if (!str3.equals("A10-70L")) {
                                                            b4 = 26;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -965403638:
                                                        if (!str3.equals("s905x018")) {
                                                            b4 = 27;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -958336948:
                                                        if (!str3.equals("ELUGA_Ray_X")) {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -879245230:
                                                        if (!str3.equals("tcl_eu")) {
                                                            b4 = 29;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -842500323:
                                                        if (!str3.equals("nicklaus_f")) {
                                                            b4 = 30;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -821392978:
                                                        if (!str3.equals("A7000-a")) {
                                                            b4 = 31;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -797483286:
                                                        if (!str3.equals("SVP-DTV15")) {
                                                            b4 = 32;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -794946968:
                                                        if (!str3.equals("watson")) {
                                                            b4 = 33;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -788334647:
                                                        if (!str3.equals("whyred")) {
                                                            b4 = 34;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -782144577:
                                                        if (!str3.equals("OnePlus5T")) {
                                                            b4 = 35;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -575125681:
                                                        if (!str3.equals("GiONEE_CBL7513")) {
                                                            b4 = 36;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -521118391:
                                                        if (!str3.equals("GIONEE_GBL7360")) {
                                                            b4 = 37;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -430914369:
                                                        if (!str3.equals("Pixi4-7_3G")) {
                                                            b4 = 38;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -290434366:
                                                        if (!str3.equals("taido_row")) {
                                                            b4 = 39;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -282781963:
                                                        if (!str3.equals("BLACK-1X")) {
                                                            b4 = 40;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -277133239:
                                                        if (!str3.equals("Z12_PRO")) {
                                                            b4 = 41;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -173639913:
                                                        if (!str3.equals("ELUGA_A3_Pro")) {
                                                            b4 = 42;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -56598463:
                                                        if (!str3.equals("woods_fn")) {
                                                            b4 = 43;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 2126:
                                                        if (!str3.equals("C1")) {
                                                            b4 = 44;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 2564:
                                                        if (!str3.equals("Q5")) {
                                                            b4 = 45;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 2715:
                                                        if (!str3.equals("V1")) {
                                                            b4 = 46;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 2719:
                                                        if (!str3.equals("V5")) {
                                                            b4 = 47;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 3091:
                                                        if (!str3.equals("b5")) {
                                                            b4 = 48;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 3483:
                                                        if (!str3.equals("mh")) {
                                                            b4 = 49;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 73405:
                                                        if (!str3.equals("JGZ")) {
                                                            b4 = 50;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 75537:
                                                        if (!str3.equals("M04")) {
                                                            b4 = 51;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 75739:
                                                        if (!str3.equals("M5c")) {
                                                            b4 = 52;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 76779:
                                                        if (!str3.equals("MX6")) {
                                                            b4 = 53;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 78669:
                                                        if (!str3.equals("P85")) {
                                                            b4 = 54;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 79305:
                                                        if (!str3.equals("PLE")) {
                                                            b4 = 55;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 80618:
                                                        if (!str3.equals("QX1")) {
                                                            b4 = 56;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 88274:
                                                        if (!str3.equals("Z80")) {
                                                            b4 = 57;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 98846:
                                                        if (!str3.equals("cv1")) {
                                                            b4 = 58;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 98848:
                                                        if (!str3.equals("cv3")) {
                                                            b4 = 59;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 99329:
                                                        if (!str3.equals("deb")) {
                                                            b4 = 60;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 101481:
                                                        if (!str3.equals("flo")) {
                                                            b4 = 61;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 1513190:
                                                        if (!str3.equals("1601")) {
                                                            b4 = 62;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 1514184:
                                                        if (!str3.equals("1713")) {
                                                            b4 = 63;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 1514185:
                                                        if (!str3.equals("1714")) {
                                                            b4 = 64;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 2133089:
                                                        if (!str3.equals("F01H")) {
                                                            b4 = 65;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 2133091:
                                                        if (!str3.equals("F01J")) {
                                                            b4 = 66;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 2133120:
                                                        if (!str3.equals("F02H")) {
                                                            b4 = 67;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 2133151:
                                                        if (!str3.equals("F03H")) {
                                                            b4 = 68;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 2133182:
                                                        if (!str3.equals("F04H")) {
                                                            b4 = 69;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 2133184:
                                                        if (!str3.equals("F04J")) {
                                                            b4 = 70;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 2436959:
                                                        if (!str3.equals("P681")) {
                                                            b4 = 71;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 2463773:
                                                        if (!str3.equals("Q350")) {
                                                            b4 = 72;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 2464648:
                                                        if (!str3.equals("Q427")) {
                                                            b4 = 73;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 2689555:
                                                        if (!str3.equals("XE2X")) {
                                                            b4 = 74;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 3154429:
                                                        if (!str3.equals("fugu")) {
                                                            b4 = 75;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 3284551:
                                                        if (!str3.equals("kate")) {
                                                            b4 = 76;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 3351335:
                                                        if (!str3.equals("mido")) {
                                                            b4 = 77;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 3386211:
                                                        if (!str3.equals("p212")) {
                                                            b4 = 78;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 41325051:
                                                        if (!str3.equals("MEIZU_M5")) {
                                                            b4 = 79;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 51349633:
                                                        if (!str3.equals("601LV")) {
                                                            b4 = 80;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 51350594:
                                                        if (!str3.equals("602LV")) {
                                                            b4 = 81;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 55178625:
                                                        if (!str3.equals("Aura_Note_2")) {
                                                            b4 = 82;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 61542055:
                                                        if (!str3.equals("A1601")) {
                                                            b4 = 83;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 65355429:
                                                        if (!str3.equals("E5643")) {
                                                            b4 = 84;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 66214468:
                                                        if (!str3.equals("F3111")) {
                                                            b4 = 85;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 66214470:
                                                        if (!str3.equals("F3113")) {
                                                            b4 = 86;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 66214473:
                                                        if (!str3.equals("F3116")) {
                                                            b4 = 87;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 66215429:
                                                        if (!str3.equals("F3211")) {
                                                            b4 = 88;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 66215431:
                                                        if (!str3.equals("F3213")) {
                                                            b4 = 89;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 66215433:
                                                        if (!str3.equals("F3215")) {
                                                            b4 = 90;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 66216390:
                                                        if (!str3.equals("F3311")) {
                                                            b4 = 91;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 76402249:
                                                        if (!str3.equals("PRO7S")) {
                                                            b4 = 92;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 76404105:
                                                        if (!str3.equals("Q4260")) {
                                                            b4 = 93;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 76404911:
                                                        if (!str3.equals("Q4310")) {
                                                            b4 = 94;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 80963634:
                                                        if (!str3.equals("V23GB")) {
                                                            b4 = 95;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 82882791:
                                                        if (!str3.equals("X3_HK")) {
                                                            b4 = 96;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 98715550:
                                                        if (!str3.equals("i9031")) {
                                                            b4 = 97;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 101370885:
                                                        if (!str3.equals("l5460")) {
                                                            b4 = 98;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 102844228:
                                                        if (!str3.equals("le_x6")) {
                                                            b4 = 99;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 165221241:
                                                        if (!str3.equals("A2016a40")) {
                                                            b4 = 100;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 182191441:
                                                        if (!str3.equals("CPY83_I00")) {
                                                            b4 = 101;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 245388979:
                                                        if (!str3.equals("marino_f")) {
                                                            b4 = 102;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 287431619:
                                                        if (!str3.equals("griffin")) {
                                                            b4 = 103;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 307593612:
                                                        if (!str3.equals("A7010a48")) {
                                                            b4 = 104;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 308517133:
                                                        if (!str3.equals("A7020a48")) {
                                                            b4 = 105;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 316215098:
                                                        if (!str3.equals("TB3-730F")) {
                                                            b4 = 106;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 316215116:
                                                        if (!str3.equals("TB3-730X")) {
                                                            b4 = 107;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 316246811:
                                                        if (!str3.equals("TB3-850F")) {
                                                            b4 = 108;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 316246818:
                                                        if (!str3.equals("TB3-850M")) {
                                                            b4 = 109;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 407160593:
                                                        if (!str3.equals("Pixi5-10_4G")) {
                                                            b4 = 110;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 507412548:
                                                        if (!str3.equals("QM16XE_U")) {
                                                            b4 = 111;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 793982701:
                                                        if (!str3.equals("GIONEE_WBL5708")) {
                                                            b4 = 112;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 794038622:
                                                        if (!str3.equals("GIONEE_WBL7365")) {
                                                            b4 = 113;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 794040393:
                                                        if (!str3.equals("GIONEE_WBL7519")) {
                                                            b4 = 114;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 835649806:
                                                        if (!str3.equals("manning")) {
                                                            b4 = 115;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 917340916:
                                                        if (!str3.equals("A7000plus")) {
                                                            b4 = 116;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 958008161:
                                                        if (!str3.equals("j2xlteins")) {
                                                            b4 = 117;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 1060579533:
                                                        if (!str3.equals("panell_d")) {
                                                            b4 = 118;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 1150207623:
                                                        if (!str3.equals("LS-5017")) {
                                                            b4 = 119;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 1176899427:
                                                        if (!str3.equals("itel_S41")) {
                                                            b4 = 120;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 1280332038:
                                                        if (!str3.equals("hwALE-H")) {
                                                            b4 = 121;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 1306947716:
                                                        if (!str3.equals("EverStar_S")) {
                                                            b4 = 122;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 1349174697:
                                                        if (!str3.equals("htc_e56ml_dtul")) {
                                                            b4 = 123;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 1522194893:
                                                        if (!str3.equals("woods_f")) {
                                                            b4 = 124;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 1691543273:
                                                        if (!str3.equals("CPH1609")) {
                                                            b4 = 125;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 1691544261:
                                                        if (!str3.equals("CPH1715")) {
                                                            b4 = 126;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 1709443163:
                                                        if (!str3.equals("iball8735_9806")) {
                                                            b4 = 127;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 1865889110:
                                                        if (!str3.equals("santoni")) {
                                                            b4 = 128;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 1906253259:
                                                        if (!str3.equals("PB2-670M")) {
                                                            b4 = 129;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 1977196784:
                                                        if (!str3.equals("Infinix-X572")) {
                                                            b4 = 130;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 2006372676:
                                                        if (!str3.equals("BRAVIA_ATV3_4K")) {
                                                            b4 = 131;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 2019281702:
                                                        if (!str3.equals("DM-01K")) {
                                                            b4 = 132;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 2029784656:
                                                        if (!str3.equals("HWBLN-H")) {
                                                            b4 = 133;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 2030379515:
                                                        if (!str3.equals("HWCAM-H")) {
                                                            b4 = 134;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 2033393791:
                                                        if (!str3.equals("ASUS_X00AD_2")) {
                                                            b4 = 135;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 2047190025:
                                                        if (!str3.equals("ELUGA_Note")) {
                                                            b4 = 136;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 2047252157:
                                                        if (!str3.equals("ELUGA_Prim")) {
                                                            b4 = 137;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 2048319463:
                                                        if (!str3.equals("HWVNS-H")) {
                                                            b4 = 138;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 2048855701:
                                                        if (!str3.equals("HWWAS-H")) {
                                                            b4 = 139;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    default:
                                                        b4 = -1;
                                                        break;
                                                }
                                                switch (b4) {
                                                    default:
                                                        if (str2.equals("JSN-L21")) {
                                                        }
                                                    case 0:
                                                    case 1:
                                                    case 2:
                                                    case 3:
                                                    case 4:
                                                    case 5:
                                                    case 6:
                                                    case 7:
                                                    case 8:
                                                    case 9:
                                                    case 10:
                                                    case z97.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                                                    case 12:
                                                    case z97.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                                                    case 14:
                                                    case h4c.e /* 15 */:
                                                    case Crypto.DEFAULT_BLOCKLENGTH /* 16 */:
                                                    case 17:
                                                    case 18:
                                                    case 19:
                                                    case InboxPagingSource.PAGE_SIZE /* 20 */:
                                                    case 21:
                                                    case 22:
                                                    case 23:
                                                    case 24:
                                                    case 25:
                                                    case 26:
                                                    case 27:
                                                    case 28:
                                                    case 29:
                                                    case 30:
                                                    case 31:
                                                    case 32:
                                                    case 33:
                                                    case 34:
                                                    case 35:
                                                    case 36:
                                                    case 37:
                                                    case 38:
                                                    case 39:
                                                    case 40:
                                                    case 41:
                                                    case 42:
                                                    case 43:
                                                    case Carousel.ENTITY_TYPE /* 44 */:
                                                    case 45:
                                                    case 46:
                                                    case 47:
                                                    case 48:
                                                    case 49:
                                                    case 50:
                                                    case 51:
                                                    case 52:
                                                    case 53:
                                                    case 54:
                                                    case 55:
                                                    case 56:
                                                    case 57:
                                                    case 58:
                                                    case 59:
                                                    case 60:
                                                    case 61:
                                                    case 62:
                                                    case 63:
                                                    case Defaults.HTTP_ASYNC_THREADPOOL_SIZE /* 64 */:
                                                    case 65:
                                                    case 66:
                                                    case 67:
                                                    case 68:
                                                    case 69:
                                                    case 70:
                                                    case 71:
                                                    case 72:
                                                    case 73:
                                                    case 74:
                                                    case 75:
                                                    case 76:
                                                    case 77:
                                                    case 78:
                                                    case 79:
                                                    case Defaults.PORT /* 80 */:
                                                    case 81:
                                                    case 82:
                                                    case 83:
                                                    case 84:
                                                    case SurveyViewModel.ENTITY_TYPE /* 85 */:
                                                    case 86:
                                                    case 87:
                                                    case 88:
                                                    case 89:
                                                    case 90:
                                                    case 91:
                                                    case 92:
                                                    case 93:
                                                    case 94:
                                                    case 95:
                                                    case 96:
                                                    case 97:
                                                    case 98:
                                                    case Log.NONE /* 99 */:
                                                    case Config.DEFAULT_RATE_LIMIT_COUNT /* 100 */:
                                                    case 101:
                                                    case 102:
                                                    case 103:
                                                    case 104:
                                                    case 105:
                                                    case 106:
                                                    case 107:
                                                    case 108:
                                                    case 109:
                                                    case 110:
                                                    case 111:
                                                    case 112:
                                                    case 113:
                                                    case 114:
                                                    case 115:
                                                    case 116:
                                                    case 117:
                                                    case 118:
                                                    case 119:
                                                    case 120:
                                                    case 121:
                                                    case 122:
                                                    case 123:
                                                    case 124:
                                                    case 125:
                                                    case 126:
                                                    case 127:
                                                    case 128:
                                                    case 129:
                                                    case 130:
                                                    case 131:
                                                    case 132:
                                                    case 133:
                                                    case 134:
                                                    case 135:
                                                    case 136:
                                                    case 137:
                                                    case 138:
                                                    case 139:
                                                        z = true;
                                                        break;
                                                }
                                            }
                                        case 0:
                                        case 1:
                                        case 2:
                                        case 3:
                                        case 4:
                                        case 5:
                                        case 6:
                                        case 7:
                                        case 8:
                                            z = true;
                                            break;
                                    }
                                }
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                                z = true;
                                break;
                        }
                    } else if (i <= 27) {
                        str2 = Build.MODEL;
                        str2.getClass();
                        switch (str2.hashCode()) {
                            case -349662828:
                                if (!str2.equals("AFTJMST12")) {
                                    b2 = 0;
                                } else {
                                    b2 = -1;
                                }
                                break;
                            case -321033677:
                                if (!str2.equals("AFTKMST12")) {
                                    b2 = 1;
                                } else {
                                    b2 = -1;
                                }
                                break;
                            case 2006354:
                                if (!str2.equals("AFTA")) {
                                    b2 = 2;
                                } else {
                                    b2 = -1;
                                }
                                break;
                            case 2006367:
                                if (!str2.equals("AFTN")) {
                                    b2 = 3;
                                } else {
                                    b2 = -1;
                                }
                                break;
                            case 2006371:
                                if (!str2.equals("AFTR")) {
                                    b2 = 4;
                                } else {
                                    b2 = -1;
                                }
                                break;
                            case 1785421873:
                                if (!str2.equals("AFTEU011")) {
                                    b2 = 5;
                                } else {
                                    b2 = -1;
                                }
                                break;
                            case 1785421876:
                                if (!str2.equals("AFTEU014")) {
                                    b2 = 6;
                                } else {
                                    b2 = -1;
                                }
                                break;
                            case 1798172390:
                                if (!str2.equals("AFTSO001")) {
                                    b2 = 7;
                                } else {
                                    b2 = -1;
                                }
                                break;
                            case 2119412532:
                                if (!str2.equals("AFTEUFF014")) {
                                    b2 = 8;
                                } else {
                                    b2 = -1;
                                }
                                break;
                            default:
                                b2 = -1;
                                break;
                        }
                        switch (b2) {
                            default:
                                if (i <= 26) {
                                    str3 = Build.DEVICE;
                                    str3.getClass();
                                    switch (str3.hashCode()) {
                                        case -2144781245:
                                            if (!str3.equals("GIONEE_SWW1609")) {
                                                b4 = 0;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -2144781185:
                                            if (!str3.equals("GIONEE_SWW1627")) {
                                                b4 = 1;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -2144781160:
                                            if (!str3.equals("GIONEE_SWW1631")) {
                                                b4 = 2;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -2097309513:
                                            if (!str3.equals("K50a40")) {
                                                b4 = 3;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -2022874474:
                                            if (!str3.equals("CP8676_I02")) {
                                                b4 = 4;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -1978993182:
                                            if (!str3.equals("NX541J")) {
                                                b4 = 5;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -1978990237:
                                            if (!str3.equals("NX573J")) {
                                                b4 = 6;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -1936688988:
                                            if (!str3.equals("PGN528")) {
                                                b4 = 7;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -1936688066:
                                            if (!str3.equals("PGN610")) {
                                                b4 = 8;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -1936688065:
                                            if (!str3.equals("PGN611")) {
                                                b4 = 9;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -1931988508:
                                            if (!str3.equals("AquaPowerM")) {
                                                b4 = 10;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -1885099851:
                                            if (!str3.equals("RAIJIN")) {
                                                b4 = 11;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -1696512866:
                                            if (!str3.equals("XT1663")) {
                                                b4 = 12;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -1680025915:
                                            if (!str3.equals("ComioS1")) {
                                                b4 = 13;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -1615810839:
                                            if (!str3.equals("Phantom6")) {
                                                b4 = 14;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -1600724499:
                                            if (!str3.equals("pacificrim")) {
                                                b4 = 15;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -1554255044:
                                            if (!str3.equals("vernee_M5")) {
                                                b4 = 16;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -1481772737:
                                            if (!str3.equals("panell_dl")) {
                                                b4 = 17;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -1481772730:
                                            if (!str3.equals("panell_ds")) {
                                                b4 = 18;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -1481772729:
                                            if (!str3.equals("panell_dt")) {
                                                b4 = 19;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -1320080169:
                                            if (!str3.equals("GiONEE_GBL7319")) {
                                                b4 = 20;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -1217592143:
                                            if (!str3.equals("BRAVIA_ATV2")) {
                                                b4 = 21;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -1180384755:
                                            if (!str3.equals("iris60")) {
                                                b4 = 22;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -1139198265:
                                            if (!str3.equals("Slate_Pro")) {
                                                b4 = 23;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -1052835013:
                                            if (!str3.equals("namath")) {
                                                b4 = 24;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -993250464:
                                            if (!str3.equals("A10-70F")) {
                                                b4 = 25;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -993250458:
                                            if (!str3.equals("A10-70L")) {
                                                b4 = 26;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -965403638:
                                            if (!str3.equals("s905x018")) {
                                                b4 = 27;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -958336948:
                                            if (!str3.equals("ELUGA_Ray_X")) {
                                                b4 = -1;
                                            }
                                            break;
                                        case -879245230:
                                            if (!str3.equals("tcl_eu")) {
                                                b4 = 29;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -842500323:
                                            if (!str3.equals("nicklaus_f")) {
                                                b4 = 30;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -821392978:
                                            if (!str3.equals("A7000-a")) {
                                                b4 = 31;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -797483286:
                                            if (!str3.equals("SVP-DTV15")) {
                                                b4 = 32;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -794946968:
                                            if (!str3.equals("watson")) {
                                                b4 = 33;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -788334647:
                                            if (!str3.equals("whyred")) {
                                                b4 = 34;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -782144577:
                                            if (!str3.equals("OnePlus5T")) {
                                                b4 = 35;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -575125681:
                                            if (!str3.equals("GiONEE_CBL7513")) {
                                                b4 = 36;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -521118391:
                                            if (!str3.equals("GIONEE_GBL7360")) {
                                                b4 = 37;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -430914369:
                                            if (!str3.equals("Pixi4-7_3G")) {
                                                b4 = 38;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -290434366:
                                            if (!str3.equals("taido_row")) {
                                                b4 = 39;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -282781963:
                                            if (!str3.equals("BLACK-1X")) {
                                                b4 = 40;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -277133239:
                                            if (!str3.equals("Z12_PRO")) {
                                                b4 = 41;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -173639913:
                                            if (!str3.equals("ELUGA_A3_Pro")) {
                                                b4 = 42;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -56598463:
                                            if (!str3.equals("woods_fn")) {
                                                b4 = 43;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 2126:
                                            if (!str3.equals("C1")) {
                                                b4 = 44;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 2564:
                                            if (!str3.equals("Q5")) {
                                                b4 = 45;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 2715:
                                            if (!str3.equals("V1")) {
                                                b4 = 46;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 2719:
                                            if (!str3.equals("V5")) {
                                                b4 = 47;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 3091:
                                            if (!str3.equals("b5")) {
                                                b4 = 48;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 3483:
                                            if (!str3.equals("mh")) {
                                                b4 = 49;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 73405:
                                            if (!str3.equals("JGZ")) {
                                                b4 = 50;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 75537:
                                            if (!str3.equals("M04")) {
                                                b4 = 51;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 75739:
                                            if (!str3.equals("M5c")) {
                                                b4 = 52;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 76779:
                                            if (!str3.equals("MX6")) {
                                                b4 = 53;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 78669:
                                            if (!str3.equals("P85")) {
                                                b4 = 54;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 79305:
                                            if (!str3.equals("PLE")) {
                                                b4 = 55;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 80618:
                                            if (!str3.equals("QX1")) {
                                                b4 = 56;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 88274:
                                            if (!str3.equals("Z80")) {
                                                b4 = 57;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 98846:
                                            if (!str3.equals("cv1")) {
                                                b4 = 58;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 98848:
                                            if (!str3.equals("cv3")) {
                                                b4 = 59;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 99329:
                                            if (!str3.equals("deb")) {
                                                b4 = 60;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 101481:
                                            if (!str3.equals("flo")) {
                                                b4 = 61;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 1513190:
                                            if (!str3.equals("1601")) {
                                                b4 = 62;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 1514184:
                                            if (!str3.equals("1713")) {
                                                b4 = 63;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 1514185:
                                            if (!str3.equals("1714")) {
                                                b4 = 64;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 2133089:
                                            if (!str3.equals("F01H")) {
                                                b4 = 65;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 2133091:
                                            if (!str3.equals("F01J")) {
                                                b4 = 66;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 2133120:
                                            if (!str3.equals("F02H")) {
                                                b4 = 67;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 2133151:
                                            if (!str3.equals("F03H")) {
                                                b4 = 68;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 2133182:
                                            if (!str3.equals("F04H")) {
                                                b4 = 69;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 2133184:
                                            if (!str3.equals("F04J")) {
                                                b4 = 70;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 2436959:
                                            if (!str3.equals("P681")) {
                                                b4 = 71;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 2463773:
                                            if (!str3.equals("Q350")) {
                                                b4 = 72;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 2464648:
                                            if (!str3.equals("Q427")) {
                                                b4 = 73;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 2689555:
                                            if (!str3.equals("XE2X")) {
                                                b4 = 74;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 3154429:
                                            if (!str3.equals("fugu")) {
                                                b4 = 75;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 3284551:
                                            if (!str3.equals("kate")) {
                                                b4 = 76;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 3351335:
                                            if (!str3.equals("mido")) {
                                                b4 = 77;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 3386211:
                                            if (!str3.equals("p212")) {
                                                b4 = 78;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 41325051:
                                            if (!str3.equals("MEIZU_M5")) {
                                                b4 = 79;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 51349633:
                                            if (!str3.equals("601LV")) {
                                                b4 = 80;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 51350594:
                                            if (!str3.equals("602LV")) {
                                                b4 = 81;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 55178625:
                                            if (!str3.equals("Aura_Note_2")) {
                                                b4 = 82;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 61542055:
                                            if (!str3.equals("A1601")) {
                                                b4 = 83;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 65355429:
                                            if (!str3.equals("E5643")) {
                                                b4 = 84;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 66214468:
                                            if (!str3.equals("F3111")) {
                                                b4 = 85;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 66214470:
                                            if (!str3.equals("F3113")) {
                                                b4 = 86;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 66214473:
                                            if (!str3.equals("F3116")) {
                                                b4 = 87;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 66215429:
                                            if (!str3.equals("F3211")) {
                                                b4 = 88;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 66215431:
                                            if (!str3.equals("F3213")) {
                                                b4 = 89;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 66215433:
                                            if (!str3.equals("F3215")) {
                                                b4 = 90;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 66216390:
                                            if (!str3.equals("F3311")) {
                                                b4 = 91;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 76402249:
                                            if (!str3.equals("PRO7S")) {
                                                b4 = 92;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 76404105:
                                            if (!str3.equals("Q4260")) {
                                                b4 = 93;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 76404911:
                                            if (!str3.equals("Q4310")) {
                                                b4 = 94;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 80963634:
                                            if (!str3.equals("V23GB")) {
                                                b4 = 95;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 82882791:
                                            if (!str3.equals("X3_HK")) {
                                                b4 = 96;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 98715550:
                                            if (!str3.equals("i9031")) {
                                                b4 = 97;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 101370885:
                                            if (!str3.equals("l5460")) {
                                                b4 = 98;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 102844228:
                                            if (!str3.equals("le_x6")) {
                                                b4 = 99;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 165221241:
                                            if (!str3.equals("A2016a40")) {
                                                b4 = 100;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 182191441:
                                            if (!str3.equals("CPY83_I00")) {
                                                b4 = 101;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 245388979:
                                            if (!str3.equals("marino_f")) {
                                                b4 = 102;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 287431619:
                                            if (!str3.equals("griffin")) {
                                                b4 = 103;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 307593612:
                                            if (!str3.equals("A7010a48")) {
                                                b4 = 104;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 308517133:
                                            if (!str3.equals("A7020a48")) {
                                                b4 = 105;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 316215098:
                                            if (!str3.equals("TB3-730F")) {
                                                b4 = 106;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 316215116:
                                            if (!str3.equals("TB3-730X")) {
                                                b4 = 107;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 316246811:
                                            if (!str3.equals("TB3-850F")) {
                                                b4 = 108;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 316246818:
                                            if (!str3.equals("TB3-850M")) {
                                                b4 = 109;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 407160593:
                                            if (!str3.equals("Pixi5-10_4G")) {
                                                b4 = 110;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 507412548:
                                            if (!str3.equals("QM16XE_U")) {
                                                b4 = 111;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 793982701:
                                            if (!str3.equals("GIONEE_WBL5708")) {
                                                b4 = 112;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 794038622:
                                            if (!str3.equals("GIONEE_WBL7365")) {
                                                b4 = 113;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 794040393:
                                            if (!str3.equals("GIONEE_WBL7519")) {
                                                b4 = 114;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 835649806:
                                            if (!str3.equals("manning")) {
                                                b4 = 115;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 917340916:
                                            if (!str3.equals("A7000plus")) {
                                                b4 = 116;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 958008161:
                                            if (!str3.equals("j2xlteins")) {
                                                b4 = 117;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 1060579533:
                                            if (!str3.equals("panell_d")) {
                                                b4 = 118;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 1150207623:
                                            if (!str3.equals("LS-5017")) {
                                                b4 = 119;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 1176899427:
                                            if (!str3.equals("itel_S41")) {
                                                b4 = 120;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 1280332038:
                                            if (!str3.equals("hwALE-H")) {
                                                b4 = 121;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 1306947716:
                                            if (!str3.equals("EverStar_S")) {
                                                b4 = 122;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 1349174697:
                                            if (!str3.equals("htc_e56ml_dtul")) {
                                                b4 = 123;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 1522194893:
                                            if (!str3.equals("woods_f")) {
                                                b4 = 124;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 1691543273:
                                            if (!str3.equals("CPH1609")) {
                                                b4 = 125;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 1691544261:
                                            if (!str3.equals("CPH1715")) {
                                                b4 = 126;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 1709443163:
                                            if (!str3.equals("iball8735_9806")) {
                                                b4 = 127;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 1865889110:
                                            if (!str3.equals("santoni")) {
                                                b4 = 128;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 1906253259:
                                            if (!str3.equals("PB2-670M")) {
                                                b4 = 129;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 1977196784:
                                            if (!str3.equals("Infinix-X572")) {
                                                b4 = 130;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 2006372676:
                                            if (!str3.equals("BRAVIA_ATV3_4K")) {
                                                b4 = 131;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 2019281702:
                                            if (!str3.equals("DM-01K")) {
                                                b4 = 132;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 2029784656:
                                            if (!str3.equals("HWBLN-H")) {
                                                b4 = 133;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 2030379515:
                                            if (!str3.equals("HWCAM-H")) {
                                                b4 = 134;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 2033393791:
                                            if (!str3.equals("ASUS_X00AD_2")) {
                                                b4 = 135;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 2047190025:
                                            if (!str3.equals("ELUGA_Note")) {
                                                b4 = 136;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 2047252157:
                                            if (!str3.equals("ELUGA_Prim")) {
                                                b4 = 137;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 2048319463:
                                            if (!str3.equals("HWVNS-H")) {
                                                b4 = 138;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 2048855701:
                                            if (!str3.equals("HWWAS-H")) {
                                                b4 = 139;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        default:
                                            b4 = -1;
                                            break;
                                    }
                                    switch (b4) {
                                        default:
                                            if (str2.equals("JSN-L21")) {
                                            }
                                        case 0:
                                        case 1:
                                        case 2:
                                        case 3:
                                        case 4:
                                        case 5:
                                        case 6:
                                        case 7:
                                        case 8:
                                        case 9:
                                        case 10:
                                        case z97.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                                        case 12:
                                        case z97.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                                        case 14:
                                        case h4c.e /* 15 */:
                                        case Crypto.DEFAULT_BLOCKLENGTH /* 16 */:
                                        case 17:
                                        case 18:
                                        case 19:
                                        case InboxPagingSource.PAGE_SIZE /* 20 */:
                                        case 21:
                                        case 22:
                                        case 23:
                                        case 24:
                                        case 25:
                                        case 26:
                                        case 27:
                                        case 28:
                                        case 29:
                                        case 30:
                                        case 31:
                                        case 32:
                                        case 33:
                                        case 34:
                                        case 35:
                                        case 36:
                                        case 37:
                                        case 38:
                                        case 39:
                                        case 40:
                                        case 41:
                                        case 42:
                                        case 43:
                                        case Carousel.ENTITY_TYPE /* 44 */:
                                        case 45:
                                        case 46:
                                        case 47:
                                        case 48:
                                        case 49:
                                        case 50:
                                        case 51:
                                        case 52:
                                        case 53:
                                        case 54:
                                        case 55:
                                        case 56:
                                        case 57:
                                        case 58:
                                        case 59:
                                        case 60:
                                        case 61:
                                        case 62:
                                        case 63:
                                        case Defaults.HTTP_ASYNC_THREADPOOL_SIZE /* 64 */:
                                        case 65:
                                        case 66:
                                        case 67:
                                        case 68:
                                        case 69:
                                        case 70:
                                        case 71:
                                        case 72:
                                        case 73:
                                        case 74:
                                        case 75:
                                        case 76:
                                        case 77:
                                        case 78:
                                        case 79:
                                        case Defaults.PORT /* 80 */:
                                        case 81:
                                        case 82:
                                        case 83:
                                        case 84:
                                        case SurveyViewModel.ENTITY_TYPE /* 85 */:
                                        case 86:
                                        case 87:
                                        case 88:
                                        case 89:
                                        case 90:
                                        case 91:
                                        case 92:
                                        case 93:
                                        case 94:
                                        case 95:
                                        case 96:
                                        case 97:
                                        case 98:
                                        case Log.NONE /* 99 */:
                                        case Config.DEFAULT_RATE_LIMIT_COUNT /* 100 */:
                                        case 101:
                                        case 102:
                                        case 103:
                                        case 104:
                                        case 105:
                                        case 106:
                                        case 107:
                                        case 108:
                                        case 109:
                                        case 110:
                                        case 111:
                                        case 112:
                                        case 113:
                                        case 114:
                                        case 115:
                                        case 116:
                                        case 117:
                                        case 118:
                                        case 119:
                                        case 120:
                                        case 121:
                                        case 122:
                                        case 123:
                                        case 124:
                                        case 125:
                                        case 126:
                                        case 127:
                                        case 128:
                                        case 129:
                                        case 130:
                                        case 131:
                                        case 132:
                                        case 133:
                                        case 134:
                                        case 135:
                                        case 136:
                                        case 137:
                                        case 138:
                                        case 139:
                                            z = true;
                                            break;
                                    }
                                }
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                                z = true;
                                break;
                        }
                    } else {
                        str2 = Build.MODEL;
                        str2.getClass();
                        switch (str2.hashCode()) {
                            case -349662828:
                                if (!str2.equals("AFTJMST12")) {
                                    b2 = -1;
                                } else {
                                    b2 = 0;
                                }
                                break;
                            case -321033677:
                                if (!str2.equals("AFTKMST12")) {
                                    b2 = -1;
                                } else {
                                    b2 = 1;
                                }
                                break;
                            case 2006354:
                                if (!str2.equals("AFTA")) {
                                    b2 = -1;
                                } else {
                                    b2 = 2;
                                }
                                break;
                            case 2006367:
                                if (!str2.equals("AFTN")) {
                                    b2 = -1;
                                } else {
                                    b2 = 3;
                                }
                                break;
                            case 2006371:
                                if (!str2.equals("AFTR")) {
                                    b2 = -1;
                                } else {
                                    b2 = 4;
                                }
                                break;
                            case 1785421873:
                                if (!str2.equals("AFTEU011")) {
                                    b2 = -1;
                                } else {
                                    b2 = 5;
                                }
                                break;
                            case 1785421876:
                                if (!str2.equals("AFTEU014")) {
                                    b2 = -1;
                                } else {
                                    b2 = 6;
                                }
                                break;
                            case 1798172390:
                                if (!str2.equals("AFTSO001")) {
                                    b2 = -1;
                                } else {
                                    b2 = 7;
                                }
                                break;
                            case 2119412532:
                                if (!str2.equals("AFTEUFF014")) {
                                    b2 = -1;
                                } else {
                                    b2 = 8;
                                }
                                break;
                            default:
                                b2 = -1;
                                break;
                        }
                        switch (b2) {
                            default:
                                if (i <= 26) {
                                    str3 = Build.DEVICE;
                                    str3.getClass();
                                    switch (str3.hashCode()) {
                                        case -2144781245:
                                            if (!str3.equals("GIONEE_SWW1609")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 0;
                                            }
                                            break;
                                        case -2144781185:
                                            if (!str3.equals("GIONEE_SWW1627")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 1;
                                            }
                                            break;
                                        case -2144781160:
                                            if (!str3.equals("GIONEE_SWW1631")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 2;
                                            }
                                            break;
                                        case -2097309513:
                                            if (!str3.equals("K50a40")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 3;
                                            }
                                            break;
                                        case -2022874474:
                                            if (!str3.equals("CP8676_I02")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 4;
                                            }
                                            break;
                                        case -1978993182:
                                            if (!str3.equals("NX541J")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 5;
                                            }
                                            break;
                                        case -1978990237:
                                            if (!str3.equals("NX573J")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 6;
                                            }
                                            break;
                                        case -1936688988:
                                            if (!str3.equals("PGN528")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 7;
                                            }
                                            break;
                                        case -1936688066:
                                            if (!str3.equals("PGN610")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 8;
                                            }
                                            break;
                                        case -1936688065:
                                            if (!str3.equals("PGN611")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 9;
                                            }
                                            break;
                                        case -1931988508:
                                            if (!str3.equals("AquaPowerM")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 10;
                                            }
                                            break;
                                        case -1885099851:
                                            if (!str3.equals("RAIJIN")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 11;
                                            }
                                            break;
                                        case -1696512866:
                                            if (!str3.equals("XT1663")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 12;
                                            }
                                            break;
                                        case -1680025915:
                                            if (!str3.equals("ComioS1")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 13;
                                            }
                                            break;
                                        case -1615810839:
                                            if (!str3.equals("Phantom6")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 14;
                                            }
                                            break;
                                        case -1600724499:
                                            if (!str3.equals("pacificrim")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 15;
                                            }
                                            break;
                                        case -1554255044:
                                            if (!str3.equals("vernee_M5")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 16;
                                            }
                                            break;
                                        case -1481772737:
                                            if (!str3.equals("panell_dl")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 17;
                                            }
                                            break;
                                        case -1481772730:
                                            if (!str3.equals("panell_ds")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 18;
                                            }
                                            break;
                                        case -1481772729:
                                            if (!str3.equals("panell_dt")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 19;
                                            }
                                            break;
                                        case -1320080169:
                                            if (!str3.equals("GiONEE_GBL7319")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 20;
                                            }
                                            break;
                                        case -1217592143:
                                            if (!str3.equals("BRAVIA_ATV2")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 21;
                                            }
                                            break;
                                        case -1180384755:
                                            if (!str3.equals("iris60")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 22;
                                            }
                                            break;
                                        case -1139198265:
                                            if (!str3.equals("Slate_Pro")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 23;
                                            }
                                            break;
                                        case -1052835013:
                                            if (!str3.equals("namath")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 24;
                                            }
                                            break;
                                        case -993250464:
                                            if (!str3.equals("A10-70F")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 25;
                                            }
                                            break;
                                        case -993250458:
                                            if (!str3.equals("A10-70L")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 26;
                                            }
                                            break;
                                        case -965403638:
                                            if (!str3.equals("s905x018")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 27;
                                            }
                                            break;
                                        case -958336948:
                                            if (!str3.equals("ELUGA_Ray_X")) {
                                                b4 = -1;
                                            }
                                            break;
                                        case -879245230:
                                            if (!str3.equals("tcl_eu")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 29;
                                            }
                                            break;
                                        case -842500323:
                                            if (!str3.equals("nicklaus_f")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 30;
                                            }
                                            break;
                                        case -821392978:
                                            if (!str3.equals("A7000-a")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 31;
                                            }
                                            break;
                                        case -797483286:
                                            if (!str3.equals("SVP-DTV15")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 32;
                                            }
                                            break;
                                        case -794946968:
                                            if (!str3.equals("watson")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 33;
                                            }
                                            break;
                                        case -788334647:
                                            if (!str3.equals("whyred")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 34;
                                            }
                                            break;
                                        case -782144577:
                                            if (!str3.equals("OnePlus5T")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 35;
                                            }
                                            break;
                                        case -575125681:
                                            if (!str3.equals("GiONEE_CBL7513")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 36;
                                            }
                                            break;
                                        case -521118391:
                                            if (!str3.equals("GIONEE_GBL7360")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 37;
                                            }
                                            break;
                                        case -430914369:
                                            if (!str3.equals("Pixi4-7_3G")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 38;
                                            }
                                            break;
                                        case -290434366:
                                            if (!str3.equals("taido_row")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 39;
                                            }
                                            break;
                                        case -282781963:
                                            if (!str3.equals("BLACK-1X")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 40;
                                            }
                                            break;
                                        case -277133239:
                                            if (!str3.equals("Z12_PRO")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 41;
                                            }
                                            break;
                                        case -173639913:
                                            if (!str3.equals("ELUGA_A3_Pro")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 42;
                                            }
                                            break;
                                        case -56598463:
                                            if (!str3.equals("woods_fn")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 43;
                                            }
                                            break;
                                        case 2126:
                                            if (!str3.equals("C1")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 44;
                                            }
                                            break;
                                        case 2564:
                                            if (!str3.equals("Q5")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 45;
                                            }
                                            break;
                                        case 2715:
                                            if (!str3.equals("V1")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 46;
                                            }
                                            break;
                                        case 2719:
                                            if (!str3.equals("V5")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 47;
                                            }
                                            break;
                                        case 3091:
                                            if (!str3.equals("b5")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 48;
                                            }
                                            break;
                                        case 3483:
                                            if (!str3.equals("mh")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 49;
                                            }
                                            break;
                                        case 73405:
                                            if (!str3.equals("JGZ")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 50;
                                            }
                                            break;
                                        case 75537:
                                            if (!str3.equals("M04")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 51;
                                            }
                                            break;
                                        case 75739:
                                            if (!str3.equals("M5c")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 52;
                                            }
                                            break;
                                        case 76779:
                                            if (!str3.equals("MX6")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 53;
                                            }
                                            break;
                                        case 78669:
                                            if (!str3.equals("P85")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 54;
                                            }
                                            break;
                                        case 79305:
                                            if (!str3.equals("PLE")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 55;
                                            }
                                            break;
                                        case 80618:
                                            if (!str3.equals("QX1")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 56;
                                            }
                                            break;
                                        case 88274:
                                            if (!str3.equals("Z80")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 57;
                                            }
                                            break;
                                        case 98846:
                                            if (!str3.equals("cv1")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 58;
                                            }
                                            break;
                                        case 98848:
                                            if (!str3.equals("cv3")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 59;
                                            }
                                            break;
                                        case 99329:
                                            if (!str3.equals("deb")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 60;
                                            }
                                            break;
                                        case 101481:
                                            if (!str3.equals("flo")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 61;
                                            }
                                            break;
                                        case 1513190:
                                            if (!str3.equals("1601")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 62;
                                            }
                                            break;
                                        case 1514184:
                                            if (!str3.equals("1713")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 63;
                                            }
                                            break;
                                        case 1514185:
                                            if (!str3.equals("1714")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 64;
                                            }
                                            break;
                                        case 2133089:
                                            if (!str3.equals("F01H")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 65;
                                            }
                                            break;
                                        case 2133091:
                                            if (!str3.equals("F01J")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 66;
                                            }
                                            break;
                                        case 2133120:
                                            if (!str3.equals("F02H")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 67;
                                            }
                                            break;
                                        case 2133151:
                                            if (!str3.equals("F03H")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 68;
                                            }
                                            break;
                                        case 2133182:
                                            if (!str3.equals("F04H")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 69;
                                            }
                                            break;
                                        case 2133184:
                                            if (!str3.equals("F04J")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 70;
                                            }
                                            break;
                                        case 2436959:
                                            if (!str3.equals("P681")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 71;
                                            }
                                            break;
                                        case 2463773:
                                            if (!str3.equals("Q350")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 72;
                                            }
                                            break;
                                        case 2464648:
                                            if (!str3.equals("Q427")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 73;
                                            }
                                            break;
                                        case 2689555:
                                            if (!str3.equals("XE2X")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 74;
                                            }
                                            break;
                                        case 3154429:
                                            if (!str3.equals("fugu")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 75;
                                            }
                                            break;
                                        case 3284551:
                                            if (!str3.equals("kate")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 76;
                                            }
                                            break;
                                        case 3351335:
                                            if (!str3.equals("mido")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 77;
                                            }
                                            break;
                                        case 3386211:
                                            if (!str3.equals("p212")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 78;
                                            }
                                            break;
                                        case 41325051:
                                            if (!str3.equals("MEIZU_M5")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 79;
                                            }
                                            break;
                                        case 51349633:
                                            if (!str3.equals("601LV")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 80;
                                            }
                                            break;
                                        case 51350594:
                                            if (!str3.equals("602LV")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 81;
                                            }
                                            break;
                                        case 55178625:
                                            if (!str3.equals("Aura_Note_2")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 82;
                                            }
                                            break;
                                        case 61542055:
                                            if (!str3.equals("A1601")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 83;
                                            }
                                            break;
                                        case 65355429:
                                            if (!str3.equals("E5643")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 84;
                                            }
                                            break;
                                        case 66214468:
                                            if (!str3.equals("F3111")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 85;
                                            }
                                            break;
                                        case 66214470:
                                            if (!str3.equals("F3113")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 86;
                                            }
                                            break;
                                        case 66214473:
                                            if (!str3.equals("F3116")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 87;
                                            }
                                            break;
                                        case 66215429:
                                            if (!str3.equals("F3211")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 88;
                                            }
                                            break;
                                        case 66215431:
                                            if (!str3.equals("F3213")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 89;
                                            }
                                            break;
                                        case 66215433:
                                            if (!str3.equals("F3215")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 90;
                                            }
                                            break;
                                        case 66216390:
                                            if (!str3.equals("F3311")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 91;
                                            }
                                            break;
                                        case 76402249:
                                            if (!str3.equals("PRO7S")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 92;
                                            }
                                            break;
                                        case 76404105:
                                            if (!str3.equals("Q4260")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 93;
                                            }
                                            break;
                                        case 76404911:
                                            if (!str3.equals("Q4310")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 94;
                                            }
                                            break;
                                        case 80963634:
                                            if (!str3.equals("V23GB")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 95;
                                            }
                                            break;
                                        case 82882791:
                                            if (!str3.equals("X3_HK")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 96;
                                            }
                                            break;
                                        case 98715550:
                                            if (!str3.equals("i9031")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 97;
                                            }
                                            break;
                                        case 101370885:
                                            if (!str3.equals("l5460")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 98;
                                            }
                                            break;
                                        case 102844228:
                                            if (!str3.equals("le_x6")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 99;
                                            }
                                            break;
                                        case 165221241:
                                            if (!str3.equals("A2016a40")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 100;
                                            }
                                            break;
                                        case 182191441:
                                            if (!str3.equals("CPY83_I00")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 101;
                                            }
                                            break;
                                        case 245388979:
                                            if (!str3.equals("marino_f")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 102;
                                            }
                                            break;
                                        case 287431619:
                                            if (!str3.equals("griffin")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 103;
                                            }
                                            break;
                                        case 307593612:
                                            if (!str3.equals("A7010a48")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 104;
                                            }
                                            break;
                                        case 308517133:
                                            if (!str3.equals("A7020a48")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 105;
                                            }
                                            break;
                                        case 316215098:
                                            if (!str3.equals("TB3-730F")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 106;
                                            }
                                            break;
                                        case 316215116:
                                            if (!str3.equals("TB3-730X")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 107;
                                            }
                                            break;
                                        case 316246811:
                                            if (!str3.equals("TB3-850F")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 108;
                                            }
                                            break;
                                        case 316246818:
                                            if (!str3.equals("TB3-850M")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 109;
                                            }
                                            break;
                                        case 407160593:
                                            if (!str3.equals("Pixi5-10_4G")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 110;
                                            }
                                            break;
                                        case 507412548:
                                            if (!str3.equals("QM16XE_U")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 111;
                                            }
                                            break;
                                        case 793982701:
                                            if (!str3.equals("GIONEE_WBL5708")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 112;
                                            }
                                            break;
                                        case 794038622:
                                            if (!str3.equals("GIONEE_WBL7365")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 113;
                                            }
                                            break;
                                        case 794040393:
                                            if (!str3.equals("GIONEE_WBL7519")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 114;
                                            }
                                            break;
                                        case 835649806:
                                            if (!str3.equals("manning")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 115;
                                            }
                                            break;
                                        case 917340916:
                                            if (!str3.equals("A7000plus")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 116;
                                            }
                                            break;
                                        case 958008161:
                                            if (!str3.equals("j2xlteins")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 117;
                                            }
                                            break;
                                        case 1060579533:
                                            if (!str3.equals("panell_d")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 118;
                                            }
                                            break;
                                        case 1150207623:
                                            if (!str3.equals("LS-5017")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 119;
                                            }
                                            break;
                                        case 1176899427:
                                            if (!str3.equals("itel_S41")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 120;
                                            }
                                            break;
                                        case 1280332038:
                                            if (!str3.equals("hwALE-H")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 121;
                                            }
                                            break;
                                        case 1306947716:
                                            if (!str3.equals("EverStar_S")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 122;
                                            }
                                            break;
                                        case 1349174697:
                                            if (!str3.equals("htc_e56ml_dtul")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 123;
                                            }
                                            break;
                                        case 1522194893:
                                            if (!str3.equals("woods_f")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 124;
                                            }
                                            break;
                                        case 1691543273:
                                            if (!str3.equals("CPH1609")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 125;
                                            }
                                            break;
                                        case 1691544261:
                                            if (!str3.equals("CPH1715")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 126;
                                            }
                                            break;
                                        case 1709443163:
                                            if (!str3.equals("iball8735_9806")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 127;
                                            }
                                            break;
                                        case 1865889110:
                                            if (!str3.equals("santoni")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 128;
                                            }
                                            break;
                                        case 1906253259:
                                            if (!str3.equals("PB2-670M")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 129;
                                            }
                                            break;
                                        case 1977196784:
                                            if (!str3.equals("Infinix-X572")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 130;
                                            }
                                            break;
                                        case 2006372676:
                                            if (!str3.equals("BRAVIA_ATV3_4K")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 131;
                                            }
                                            break;
                                        case 2019281702:
                                            if (!str3.equals("DM-01K")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 132;
                                            }
                                            break;
                                        case 2029784656:
                                            if (!str3.equals("HWBLN-H")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 133;
                                            }
                                            break;
                                        case 2030379515:
                                            if (!str3.equals("HWCAM-H")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 134;
                                            }
                                            break;
                                        case 2033393791:
                                            if (!str3.equals("ASUS_X00AD_2")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 135;
                                            }
                                            break;
                                        case 2047190025:
                                            if (!str3.equals("ELUGA_Note")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 136;
                                            }
                                            break;
                                        case 2047252157:
                                            if (!str3.equals("ELUGA_Prim")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 137;
                                            }
                                            break;
                                        case 2048319463:
                                            if (!str3.equals("HWVNS-H")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 138;
                                            }
                                            break;
                                        case 2048855701:
                                            if (!str3.equals("HWWAS-H")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 139;
                                            }
                                            break;
                                        default:
                                            b4 = -1;
                                            break;
                                    }
                                    switch (b4) {
                                        default:
                                            if (str2.equals("JSN-L21")) {
                                            }
                                        case 0:
                                        case 1:
                                        case 2:
                                        case 3:
                                        case 4:
                                        case 5:
                                        case 6:
                                        case 7:
                                        case 8:
                                        case 9:
                                        case 10:
                                        case z97.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                                        case 12:
                                        case z97.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                                        case 14:
                                        case h4c.e /* 15 */:
                                        case Crypto.DEFAULT_BLOCKLENGTH /* 16 */:
                                        case 17:
                                        case 18:
                                        case 19:
                                        case InboxPagingSource.PAGE_SIZE /* 20 */:
                                        case 21:
                                        case 22:
                                        case 23:
                                        case 24:
                                        case 25:
                                        case 26:
                                        case 27:
                                        case 28:
                                        case 29:
                                        case 30:
                                        case 31:
                                        case 32:
                                        case 33:
                                        case 34:
                                        case 35:
                                        case 36:
                                        case 37:
                                        case 38:
                                        case 39:
                                        case 40:
                                        case 41:
                                        case 42:
                                        case 43:
                                        case Carousel.ENTITY_TYPE /* 44 */:
                                        case 45:
                                        case 46:
                                        case 47:
                                        case 48:
                                        case 49:
                                        case 50:
                                        case 51:
                                        case 52:
                                        case 53:
                                        case 54:
                                        case 55:
                                        case 56:
                                        case 57:
                                        case 58:
                                        case 59:
                                        case 60:
                                        case 61:
                                        case 62:
                                        case 63:
                                        case Defaults.HTTP_ASYNC_THREADPOOL_SIZE /* 64 */:
                                        case 65:
                                        case 66:
                                        case 67:
                                        case 68:
                                        case 69:
                                        case 70:
                                        case 71:
                                        case 72:
                                        case 73:
                                        case 74:
                                        case 75:
                                        case 76:
                                        case 77:
                                        case 78:
                                        case 79:
                                        case Defaults.PORT /* 80 */:
                                        case 81:
                                        case 82:
                                        case 83:
                                        case 84:
                                        case SurveyViewModel.ENTITY_TYPE /* 85 */:
                                        case 86:
                                        case 87:
                                        case 88:
                                        case 89:
                                        case 90:
                                        case 91:
                                        case 92:
                                        case 93:
                                        case 94:
                                        case 95:
                                        case 96:
                                        case 97:
                                        case 98:
                                        case Log.NONE /* 99 */:
                                        case Config.DEFAULT_RATE_LIMIT_COUNT /* 100 */:
                                        case 101:
                                        case 102:
                                        case 103:
                                        case 104:
                                        case 105:
                                        case 106:
                                        case 107:
                                        case 108:
                                        case 109:
                                        case 110:
                                        case 111:
                                        case 112:
                                        case 113:
                                        case 114:
                                        case 115:
                                        case 116:
                                        case 117:
                                        case 118:
                                        case 119:
                                        case 120:
                                        case 121:
                                        case 122:
                                        case 123:
                                        case 124:
                                        case 125:
                                        case 126:
                                        case 127:
                                        case 128:
                                        case 129:
                                        case 130:
                                        case 131:
                                        case 132:
                                        case 133:
                                        case 134:
                                        case 135:
                                        case 136:
                                        case 137:
                                        case 138:
                                        case 139:
                                            z = true;
                                            break;
                                    }
                                }
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                                z = true;
                                break;
                        }
                    }
                    W1 = z;
                    V1 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return W1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:19:0x003f  */
    public static int Q0(en6 en6Var, id4 id4Var) {
        int i = id4Var.v;
        int i2 = id4Var.w;
        if (i != -1 && i2 != -1) {
            String str = id4Var.o;
            str.getClass();
            if ("video/dolby-vision".equals(str)) {
                Pair<Integer, Integer> pairB = og1.b(id4Var);
                if (pairB == null) {
                    str = "video/hevc";
                } else {
                    int iIntValue = ((Integer) pairB.first).intValue();
                    if (iIntValue == 512 || iIntValue == 1 || iIntValue == 2) {
                        str = "video/avc";
                    } else if (iIntValue == 1024) {
                        str = "video/av01";
                    } else {
                        str = "video/hevc";
                    }
                }
            }
            switch (str) {
                case "video/3gpp":
                case "video/av01":
                case "video/mp4v-es":
                case "video/x-vnd.on2.vp8":
                    return ((i * i2) * 3) / 4;
                case "video/hevc":
                    return Math.max(2097152, ((i * i2) * 3) / 4);
                case "video/avc":
                    String str2 = Build.MODEL;
                    if (!"BRAVIA 4K 2015".equals(str2) && (!"Amazon".equals(Build.MANUFACTURER) || (!"KFSOWI".equals(str2) && (!"AFTS".equals(str2) || !en6Var.f)))) {
                        return ((n6b.g(i2, 16) * n6b.g(i, 16)) * 768) / 4;
                    }
                    break;
                case "video/x-vnd.on2.vp9":
                    return ((i * i2) * 3) / 8;
            }
        }
        return -1;
    }

    public static List<en6> R0(Context context, jn6 jn6Var, id4 id4Var, boolean z, boolean z2) {
        String str = id4Var.o;
        if (str == null) {
            return ul8.x;
        }
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(str) && !b.a(context)) {
            String strC = mn6.c(id4Var);
            List<en6> listA = strC == null ? ul8.x : jn6Var.a(z, strC, z2);
            if (!listA.isEmpty()) {
                return listA;
            }
        }
        return mn6.g(jn6Var, id4Var, z, z2);
    }

    public static int S0(en6 en6Var, id4 id4Var) {
        int i = id4Var.p;
        List<byte[]> list = id4Var.r;
        if (i == -1) {
            return Q0(en6Var, id4Var);
        }
        int size = list.size();
        int length = 0;
        for (int i2 = 0; i2 < size; i2++) {
            length += list.get(i2).length;
        }
        return id4Var.p + length;
    }

    @Override // defpackage.in6
    public final void A0() {
        sfb sfbVar = this.p1;
        if (sfbVar != null) {
            sfbVar.m();
        } else {
            long j = this.R0.f;
        }
    }

    @Override // defpackage.in6
    public final void C0() {
        super.C0();
        this.l1.clear();
        this.C1 = 0;
        this.T1 = 0;
        this.F1 = false;
        sf0 sf0Var = this.i1;
        if (sf0Var != null) {
            sf0Var.b = null;
            ByteBuffer byteBuffer = sf0Var.a;
            byteBuffer.position(byteBuffer.limit());
        }
    }

    @Override // androidx.media3.exoplayer.k
    public final boolean D(long j) {
        if (this.K0 == -9223372036854775807L || j < this.E1) {
            return false;
        }
        long j2 = this.S0;
        return j2 == -9223372036854775807L || j > j2;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003b  */
    /* JADX WARN: Code duplicated, block: B:90:0x013a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x013c  */
    /* JADX WARN: Code duplicated, block: B:92:0x0144  */
    @Override // defpackage.in6
    public final boolean G0(nn2 nn2Var) {
        boolean z;
        ByteBuffer byteBuffer;
        int iLimit;
        uf7.d dVar;
        uf7.a aVar;
        boolean z2 = false;
        if (!V0(nn2Var)) {
            long j = nn2Var.y;
            boolean z3 = j < this.E;
            cfb cfbVar = this.k1;
            if (cfbVar != null) {
                long j2 = cfbVar.a;
                long j3 = j2 == -9223372036854775807L ? -9223372036854775807L : (long) (((j - j2) * cfbVar.c) + cfbVar.b);
                if (j3 == -9223372036854775807L || j3 >= this.j1) {
                    z = false;
                } else {
                    z = true;
                }
            } else {
                z = false;
            }
            if ((z3 || z) && !nn2Var.i(268435456)) {
                if (!nn2Var.i(67108864)) {
                    sf0 sf0Var = this.i1;
                    if (sf0Var != null) {
                        ByteBuffer byteBuffer2 = sf0Var.a;
                        en6 en6Var = this.n0;
                        en6Var.getClass();
                        if (en6Var.b.equals("video/av01") && (byteBuffer = nn2Var.w) != null) {
                            boolean z4 = z3 || this.T1 <= 0;
                            ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                            byteBufferAsReadOnlyBuffer.flip();
                            if (byteBuffer2.hasRemaining()) {
                                sf0Var.a(uf7.a(byteBuffer2));
                                byteBuffer2.position(byteBuffer2.limit());
                            }
                            ArrayList arrayListA = uf7.a(byteBufferAsReadOnlyBuffer);
                            sf0Var.a(arrayListA);
                            int size = arrayListA.size() - 1;
                            int i = 0;
                            while (size >= 0) {
                                uf7.c cVar = (uf7.c) arrayListA.get(size);
                                int i2 = cVar.a;
                                if (i2 != 2 && i2 != 15) {
                                    if ((i2 == 3 && !z4) || ((i2 != 6 && i2 != 3) || (dVar = sf0Var.b) == null)) {
                                        break;
                                    }
                                    try {
                                        aVar = new uf7.a(dVar, cVar);
                                    } catch (uf7.b unused) {
                                        aVar = null;
                                    }
                                    if (aVar == null || aVar.a) {
                                        break;
                                    }
                                }
                                if (((uf7.c) arrayListA.get(size)).a == 6 || ((uf7.c) arrayListA.get(size)).a == 3) {
                                    i++;
                                }
                                size--;
                            }
                            if (i > 1 || size + 1 >= 8) {
                                iLimit = byteBufferAsReadOnlyBuffer.limit();
                            } else {
                                iLimit = size >= 0 ? ((uf7.c) arrayListA.get(size)).b.limit() : byteBufferAsReadOnlyBuffer.position();
                            }
                            if (iLimit == 0) {
                                nn2Var.j();
                            } else if (iLimit != byteBufferAsReadOnlyBuffer.limit()) {
                                d dVar2 = this.m1;
                                dVar2.getClass();
                                if (dVar2.c + iLimit < byteBufferAsReadOnlyBuffer.capacity() && !nn2Var.i(1073741824)) {
                                    ByteBuffer byteBuffer3 = nn2Var.w;
                                    byteBuffer3.getClass();
                                    byteBuffer3.position(iLimit);
                                }
                            }
                        }
                    }
                    if (z2) {
                        if (z3) {
                            this.Q0.d++;
                        } else {
                            this.l1.add(Long.valueOf(nn2Var.y));
                            this.T1++;
                        }
                    }
                    return z2;
                }
                nn2Var.j();
                z2 = true;
                if (z2) {
                    if (z3) {
                        this.Q0.d++;
                    } else {
                        this.l1.add(Long.valueOf(nn2Var.y));
                        this.T1++;
                    }
                }
                return z2;
            }
        }
        return false;
    }

    @Override // defpackage.in6, androidx.media3.exoplayer.a
    public final void H() {
        final ln2 ln2Var;
        final rfb.a aVar = this.d1;
        this.K1 = null;
        this.R1 = -9223372036854775807L;
        X0();
        this.w1 = false;
        this.O1 = null;
        this.F1 = true;
        try {
            super.H();
            ln2Var = this.Q0;
            aVar.getClass();
            synchronized (ln2Var) {
            }
        } finally {
            ln2Var = this.Q0;
            aVar.getClass();
            synchronized (ln2Var) {
                Handler handler = aVar.a;
                if (handler != null) {
                    handler.post(new Runnable() { // from class: qfb
                        @Override // java.lang.Runnable
                        public final void run() {
                            rfb.a aVar2 = aVar;
                            ln2 ln2Var2 = ln2Var;
                            synchronized (ln2Var2) {
                            }
                            rfb rfbVar = aVar2.b;
                            String str = n6b.a;
                            rfbVar.c(ln2Var2);
                        }
                    });
                }
                aVar.a(tfb.d);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0027  */
    @Override // defpackage.in6
    public final boolean H0() {
        boolean z;
        id4 id4Var = this.h0;
        long j = this.R1;
        if (j != -9223372036854775807L) {
            if (this.W0 + 1 + j > Long.MAX_VALUE - (this.R0.c + j)) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = true;
        }
        return this.D1 == null || this.F1 || this.M1 || (id4Var != null && id4Var.q > 0) || z || this.R0.f != -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.a
    public final void I(boolean z, boolean z2) {
        o28.c cVar;
        this.Q0 = new ln2();
        mn8 mn8Var = this.w;
        mn8Var.getClass();
        boolean z3 = mn8Var.b;
        xl7.r((z3 && this.N1 == 0) ? false : true);
        if (this.M1 != z3) {
            this.M1 = z3;
            z0();
        }
        final ln2 ln2Var = this.Q0;
        final rfb.a aVar = this.d1;
        Handler handler = aVar.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: ofb
                @Override // java.lang.Runnable
                public final void run() {
                    rfb rfbVar = aVar.b;
                    String str = n6b.a;
                    rfbVar.f(ln2Var);
                }
            });
        }
        boolean z4 = this.q1;
        bfb bfbVar = this.g1;
        if (!z4) {
            if (this.s1 != null && this.p1 == null) {
                o28.a aVar2 = new o28.a(this.b1, bfbVar);
                aVar2.d = true;
                long j = this.j1;
                aVar2.g = j != -9223372036854775807L ? -j : -9223372036854775807L;
                vf1 vf1Var = this.z;
                vf1Var.getClass();
                aVar2.e = vf1Var;
                xl7.r(!aVar2.f);
                if (aVar2.c == null) {
                    aVar2.c = new o28.f();
                }
                o28 o28Var = new o28(aVar2);
                aVar2.f = true;
                if (1 >= o28Var.s) {
                    o28Var.s = 1;
                }
                SparseArray<o28.c> sparseArray = o28Var.c;
                if (n6b.k(sparseArray, 0)) {
                    cVar = sparseArray.get(0);
                } else {
                    o28.c cVar2 = o28Var.new c(o28Var.a);
                    o28Var.g.add(cVar2);
                    sparseArray.put(0, cVar2);
                    cVar = cVar2;
                }
                this.p1 = cVar;
            }
            this.q1 = true;
        }
        sfb sfbVar = this.p1;
        if (sfbVar == null) {
            vf1 vf1Var2 = this.z;
            vf1Var2.getClass();
            bfbVar.l = vf1Var2;
            bfbVar.e(!z2 ? 1 : 0);
            return;
        }
        sfbVar.q(new on6(this));
        zeb zebVar = this.P1;
        if (zebVar != null) {
            this.p1.x(zebVar);
        }
        if (this.t1 != null && !this.v1.equals(ar9.c)) {
            this.p1.y(this.t1, this.v1);
        }
        this.p1.n(this.y1);
        this.p1.o(this.e0);
        List<Object> list = this.s1;
        if (list != null) {
            this.p1.u(list);
        }
        this.r1 = !z2 ? 1 : 0;
        this.U0 = true;
    }

    @Override // defpackage.in6
    public final boolean I0(en6 en6Var) {
        return U0(en6Var);
    }

    @Override // defpackage.in6, androidx.media3.exoplayer.a
    public final void J(long j, boolean z, boolean z2) {
        sfb sfbVar = this.p1;
        if (sfbVar != null && !z) {
            sfbVar.t(true);
        }
        if (z2) {
            this.E1 = j;
        }
        super.J(j, z, z2);
        sfb sfbVar2 = this.p1;
        bfb bfbVar = this.g1;
        if (sfbVar2 == null) {
            bfbVar.b.b();
            bfbVar.h = -9223372036854775807L;
            bfbVar.f = -9223372036854775807L;
            bfbVar.e = Math.min(bfbVar.e, 1);
            bfbVar.i = -9223372036854775807L;
            bfbVar.n = false;
        }
        cfb cfbVar = this.k1;
        if (cfbVar != null) {
            cfbVar.b();
        }
        if (z) {
            sfb sfbVar3 = this.p1;
            if (sfbVar3 != null) {
                sfbVar3.v(false);
            } else {
                bfbVar.c(false);
            }
        }
        X0();
        this.B1 = 0;
    }

    @Override // defpackage.in6
    public final boolean J0() {
        en6 en6Var = this.n0;
        if (this.p1 != null && en6Var != null) {
            String str = en6Var.a;
            if (str.equals("c2.mtk.avc.decoder") || str.equals("c2.mtk.hevc.decoder")) {
                return true;
            }
        }
        return super.J0();
    }

    @Override // androidx.media3.exoplayer.a
    public final void K() {
        sfb sfbVar = this.p1;
        if (sfbVar == null || !this.c1) {
            return;
        }
        sfbVar.a();
    }

    @Override // androidx.media3.exoplayer.a
    public final void L() {
        try {
            try {
                this.A0 = false;
                B0();
                z0();
                i83 i83Var = this.a0;
                if (i83Var != null) {
                    i83Var.c(null);
                }
                this.a0 = null;
                this.q1 = false;
                this.Q1 = -9223372036854775807L;
                wz7 wz7Var = this.u1;
                if (wz7Var != null) {
                    wz7Var.release();
                    this.u1 = null;
                }
            } catch (Throwable th) {
                i83 i83Var2 = this.a0;
                if (i83Var2 != null) {
                    i83Var2.c(null);
                }
                this.a0 = null;
                throw th;
            }
        } catch (Throwable th2) {
            this.q1 = false;
            this.Q1 = -9223372036854775807L;
            wz7 wz7Var2 = this.u1;
            if (wz7Var2 != null) {
                wz7Var2.release();
                this.u1 = null;
            }
            throw th2;
        }
    }

    @Override // defpackage.in6
    public final int L0(ra raVar, id4 id4Var) {
        boolean z;
        int i = 0;
        if (!fv6.m(id4Var.o)) {
            return l.r(0, 0, 0, 0);
        }
        boolean z2 = id4Var.s != null;
        Context context = this.b1;
        List<en6> listR0 = R0(context, raVar, id4Var, z2, false);
        if (z2 && listR0.isEmpty()) {
            listR0 = R0(context, raVar, id4Var, false, false);
        }
        if (listR0.isEmpty()) {
            return l.r(1, 0, 0, 0);
        }
        int i2 = id4Var.P;
        if (i2 != 0 && i2 != 2) {
            return l.r(2, 0, 0, 0);
        }
        en6 en6Var = listR0.get(0);
        boolean zE = en6Var.e(context, id4Var);
        if (!zE) {
            int i3 = 1;
            while (true) {
                if (i3 >= listR0.size()) {
                    z = true;
                    break;
                }
                en6 en6Var2 = listR0.get(i3);
                if (en6Var2.e(context, id4Var)) {
                    z = false;
                    zE = true;
                    en6Var = en6Var2;
                    break;
                }
                i3++;
            }
        } else {
            z = true;
            break;
        }
        int i4 = zE ? 4 : 3;
        int i5 = en6Var.f(id4Var) ? 16 : 8;
        int i6 = en6Var.g ? 64 : 0;
        int i7 = z ? 128 : 0;
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(id4Var.o) && !b.a(context)) {
            i7 = 256;
        }
        if (zE) {
            List<en6> listR1 = R0(context, raVar, id4Var, z2, true);
            if (!listR1.isEmpty()) {
                HashMap<mn6.a, List<en6>> map = mn6.a;
                ArrayList arrayList = new ArrayList(listR1);
                Collections.sort(arrayList, new ln6(new kn6(context, id4Var)));
                en6 en6Var3 = (en6) arrayList.get(0);
                if (en6Var3.e(context, id4Var) && en6Var3.f(id4Var)) {
                    i = 32;
                }
            }
        }
        return i4 | i5 | i | i6 | i7;
    }

    @Override // androidx.media3.exoplayer.a
    public final void M() {
        this.A1 = 0;
        vf1 vf1Var = this.z;
        vf1Var.getClass();
        this.z1 = vf1Var.c();
        this.G1 = 0L;
        this.H1 = 0;
        sfb sfbVar = this.p1;
        if (sfbVar != null) {
            sfbVar.j();
        } else {
            this.g1.d();
        }
    }

    @Override // androidx.media3.exoplayer.a
    public final void N() {
        W0();
        final int i = this.H1;
        if (i != 0) {
            final long j = this.G1;
            final rfb.a aVar = this.d1;
            Handler handler = aVar.a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: nfb
                    @Override // java.lang.Runnable
                    public final void run() {
                        rfb rfbVar = aVar.b;
                        String str = n6b.a;
                        rfbVar.e(i, j);
                    }
                });
            }
            this.G1 = 0L;
            this.H1 = 0;
        }
        sfb sfbVar = this.p1;
        if (sfbVar != null) {
            sfbVar.i();
        } else {
            bfb bfbVar = this.g1;
            bfbVar.d = false;
            bfbVar.i = -9223372036854775807L;
            dfb dfbVar = bfbVar.b;
            dfbVar.d = false;
            dfb.b bVar = dfbVar.c;
            if (bVar != null) {
                bVar.b();
            }
            dfbVar.a();
        }
        cfb cfbVar = this.k1;
        if (cfbVar != null) {
            cfbVar.b();
        }
    }

    @Override // defpackage.in6, androidx.media3.exoplayer.a
    public final void O(id4[] id4VarArr, long j, long j2, bq6.b bVar) {
        super.O(id4VarArr, j, j2, bVar);
        e1(bVar);
        cfb cfbVar = this.k1;
        if (cfbVar != null) {
            cfbVar.b();
        }
    }

    @Override // androidx.media3.exoplayer.a
    public final void P() {
        bq6.b bVar = this.J;
        if (bVar != null) {
            e1(bVar);
        }
    }

    @Override // defpackage.in6
    public final pn2 T(en6 en6Var, id4 id4Var, id4 id4Var2, boolean z) {
        int i;
        pn2 pn2VarB = en6Var.b(id4Var, id4Var2);
        float f = id4Var.z;
        float f2 = id4Var2.z;
        int i2 = pn2VarB.e;
        d dVar = this.m1;
        dVar.getClass();
        if (id4Var2.v > dVar.a || id4Var2.w > dVar.b) {
            i2 |= 256;
        }
        if (S0(en6Var, id4Var2) > dVar.c) {
            i2 |= 64;
        }
        if (this.y1 != Integer.MIN_VALUE && (i = Build.VERSION.SDK_INT) < 31 && ((i != 30 || Build.MODEL.startsWith("MiTV")) && f != -1.0f && f2 != -1.0f && (!en6Var.f || !z))) {
            float fMax = Math.max(f2, f) / Math.min(f2, f);
            if (Math.abs(fMax - Math.round(fMax)) > 0.01f) {
                i2 |= 65536;
            }
        }
        int i3 = i2;
        return new pn2(en6Var.a, id4Var, id4Var2, i3 != 0 ? 0 : pn2VarB.d, i3);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0056  */
    /* JADX WARN: Code duplicated, block: B:33:0x0059  */
    /* JADX WARN: Code duplicated, block: B:50:0x0090  */
    /* JADX WARN: Code duplicated, block: B:53:0x009b  */
    /* JADX WARN: Code duplicated, block: B:55:0x009f  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:62:0x0070 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final Surface T0(en6 en6Var) {
        boolean z;
        wz7.a aVar;
        int i;
        RuntimeException runtimeException;
        Error error;
        sfb sfbVar = this.p1;
        if (sfbVar != null) {
            return sfbVar.c();
        }
        Surface surface = this.t1;
        if (surface != null) {
            return surface;
        }
        if (Build.VERSION.SDK_INT >= 35 && en6Var.h) {
            return null;
        }
        xl7.r(b1(en6Var));
        wz7 wz7Var = this.u1;
        if (wz7Var != null && wz7Var.t != en6Var.f && wz7Var != null) {
            wz7Var.release();
            this.u1 = null;
        }
        if (this.u1 == null) {
            Context context = this.b1;
            boolean z2 = en6Var.f;
            boolean z3 = false;
            if (z2) {
                if (!wz7.b(context)) {
                    z = false;
                }
                xl7.r(z);
                aVar = new wz7.a("ExoPlayer:PlaceholderSurface");
                if (z2) {
                    i = wz7.w;
                } else {
                    i = 0;
                }
                aVar.start();
                Handler handler = new Handler(aVar.getLooper(), aVar);
                aVar.u = handler;
                aVar.t = new y93(handler);
                synchronized (aVar) {
                    aVar.u.obtainMessage(1, i, 0).sendToTarget();
                    while (aVar.x == null && aVar.w == null && aVar.v == null) {
                        try {
                            aVar.wait();
                        } catch (InterruptedException unused) {
                            z3 = true;
                        }
                    }
                }
                if (z3) {
                    Thread.currentThread().interrupt();
                }
                runtimeException = aVar.w;
                if (runtimeException == null) {
                    throw runtimeException;
                }
                error = aVar.v;
                if (error == null) {
                    throw error;
                }
                wz7 wz7Var2 = aVar.x;
                wz7Var2.getClass();
                this.u1 = wz7Var2;
            } else {
                int i2 = wz7.w;
            }
            z = true;
            xl7.r(z);
            aVar = new wz7.a("ExoPlayer:PlaceholderSurface");
            if (z2) {
                i = wz7.w;
            } else {
                i = 0;
            }
            aVar.start();
            Handler handler2 = new Handler(aVar.getLooper(), aVar);
            aVar.u = handler2;
            aVar.t = new y93(handler2);
            synchronized (aVar) {
                aVar.u.obtainMessage(1, i, 0).sendToTarget();
                while (aVar.x == null) {
                    aVar.wait();
                }
                if (z3) {
                    Thread.currentThread().interrupt();
                }
                runtimeException = aVar.w;
                if (runtimeException == null) {
                    throw runtimeException;
                }
                error = aVar.v;
                if (error == null) {
                    throw error;
                }
                wz7 wz7Var3 = aVar.x;
                wz7Var3.getClass();
                this.u1 = wz7Var3;
            }
        }
        return this.u1;
    }

    @Override // defpackage.in6
    public final dn6 U(IllegalStateException illegalStateException, en6 en6Var) {
        Surface surface = this.t1;
        nn6 nn6Var = new nn6(illegalStateException, en6Var);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
        return nn6Var;
    }

    public final boolean U0(en6 en6Var) {
        if (this.p1 != null) {
            return true;
        }
        Surface surface = this.t1;
        if (surface == null || !surface.isValid()) {
            return (Build.VERSION.SDK_INT >= 35 && en6Var.h) || b1(en6Var);
        }
        return true;
    }

    public final boolean V0(nn2 nn2Var) {
        if (k() || nn2Var.i(536870912)) {
            return true;
        }
        long j = this.R1;
        return j == -9223372036854775807L || j - (nn2Var.y - this.R0.c) <= 100000;
    }

    public final void W0() {
        if (this.A1 > 0) {
            vf1 vf1Var = this.z;
            vf1Var.getClass();
            long jC = vf1Var.c();
            final long j = jC - this.z1;
            final int i = this.A1;
            final rfb.a aVar = this.d1;
            Handler handler = aVar.a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: mfb
                    @Override // java.lang.Runnable
                    public final void run() {
                        rfb rfbVar = aVar.b;
                        String str = n6b.a;
                        rfbVar.h(i, j);
                    }
                });
            }
            this.A1 = 0;
            this.z1 = jC;
        }
    }

    public final void X0() {
        an6 an6Var;
        if (this.M1 && (an6Var = this.g0) != null) {
            this.O1 = new e(an6Var);
            if (Build.VERSION.SDK_INT >= 33) {
                Bundle bundle = new Bundle();
                bundle.putInt("tunnel-peek", 1);
                an6Var.b(bundle);
            }
        }
    }

    public final void Y0(an6 an6Var, int i, long j) {
        Surface surface;
        Trace.beginSection("releaseOutputBuffer");
        an6Var.j(i, j);
        Trace.endSection();
        this.Q0.e++;
        this.B1 = 0;
        if (this.p1 == null) {
            tfb tfbVar = this.J1;
            boolean zEquals = tfbVar.equals(tfb.d);
            rfb.a aVar = this.d1;
            if (!zEquals && !tfbVar.equals(this.K1)) {
                this.K1 = tfbVar;
                aVar.a(tfbVar);
            }
            bfb bfbVar = this.g1;
            boolean z = bfbVar.e != 3;
            bfbVar.e = 3;
            bfbVar.g = n6b.N(bfbVar.l.c());
            if (!z || (surface = this.t1) == null) {
                return;
            }
            Handler handler = aVar.a;
            if (handler != null) {
                handler.post(new jfb(aVar, surface, SystemClock.elapsedRealtime()));
            }
            this.w1 = true;
        }
    }

    public final void Z0(Object obj) {
        Handler handler;
        Surface surface = obj instanceof Surface ? (Surface) obj : null;
        Surface surface2 = this.t1;
        rfb.a aVar = this.d1;
        if (surface2 == surface) {
            if (surface != null) {
                tfb tfbVar = this.K1;
                if (tfbVar != null) {
                    aVar.a(tfbVar);
                }
                Surface surface3 = this.t1;
                if (surface3 == null || !this.w1 || (handler = aVar.a) == null) {
                    return;
                }
                handler.post(new jfb(aVar, surface3, SystemClock.elapsedRealtime()));
                return;
            }
            return;
        }
        this.t1 = surface;
        sfb sfbVar = this.p1;
        bfb bfbVar = this.g1;
        if (sfbVar == null) {
            bfbVar.g(surface);
        }
        this.w1 = false;
        int i = this.A;
        an6 an6Var = this.g0;
        if (an6Var != null && this.p1 == null) {
            en6 en6Var = this.n0;
            en6Var.getClass();
            if (!U0(en6Var) || this.n1) {
                z0();
                j0();
            } else {
                Surface surfaceT0 = T0(en6Var);
                if (surfaceT0 != null) {
                    an6Var.o(surfaceT0);
                } else {
                    if (Build.VERSION.SDK_INT < 35) {
                        d43.c();
                        return;
                    }
                    an6Var.i();
                }
            }
        }
        if (surface != null) {
            tfb tfbVar2 = this.K1;
            if (tfbVar2 != null) {
                aVar.a(tfbVar2);
            }
        } else {
            this.K1 = null;
            sfb sfbVar2 = this.p1;
            if (sfbVar2 != null) {
                sfbVar2.p();
            }
        }
        if (i == 2) {
            sfb sfbVar3 = this.p1;
            if (sfbVar3 != null) {
                sfbVar3.v(true);
            } else {
                bfbVar.c(true);
            }
        }
        X0();
    }

    @Override // defpackage.in6
    public final int a0(nn2 nn2Var) {
        if (Build.VERSION.SDK_INT >= 34) {
            return ((this.D1 == null && !this.M1) || nn2Var.y >= this.E || V0(nn2Var)) ? 0 : 32;
        }
        return 0;
    }

    public final boolean a1(long j, long j2, boolean z, boolean z2) {
        if (this.p1 != null && this.c1) {
            j2 -= -this.Q1;
        }
        if (j < -500000 && !z) {
            xz8 xz8Var = this.B;
            xz8Var.getClass();
            int iC = xz8Var.c(j2 - this.D);
            if (iC != 0) {
                this.E1 = j2;
                ln2 ln2Var = this.Q0;
                PriorityQueue<Long> priorityQueue = this.l1;
                if (z2) {
                    int i = ln2Var.d + iC;
                    ln2Var.d = i;
                    ln2Var.f += this.C1;
                    ln2Var.d = priorityQueue.size() + i;
                } else {
                    ln2Var.j++;
                    d1(priorityQueue.size() + iC, this.C1);
                }
                if (this.g0 != null) {
                    if (J0()) {
                        z0();
                        j0();
                    } else if (H0()) {
                        Y();
                    } else {
                        this.V0 = true;
                    }
                }
                sfb sfbVar = this.p1;
                if (sfbVar != null) {
                    sfbVar.t(false);
                }
                return true;
            }
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.k
    public final boolean b() {
        boolean z;
        boolean zB;
        if (this.X == null) {
            z = false;
        } else {
            if (k()) {
                zB = this.G;
            } else {
                xz8 xz8Var = this.B;
                xz8Var.getClass();
                zB = xz8Var.b();
            }
            if (!zB && this.x0 < 0) {
                if (this.v0 != -9223372036854775807L) {
                    vf1 vf1Var = this.z;
                    vf1Var.getClass();
                    if (vf1Var.c() < this.v0) {
                    }
                }
                z = false;
            }
            z = true;
        }
        sfb sfbVar = this.p1;
        if (sfbVar != null) {
            return sfbVar.w(z);
        }
        if (z && (this.g0 == null || this.M1)) {
            return true;
        }
        return this.g1.b(z);
    }

    @Override // defpackage.in6
    public final float b0(float f, id4 id4Var, id4[] id4VarArr) {
        en6 en6Var;
        float fMax = -1.0f;
        for (id4 id4Var2 : id4VarArr) {
            float f2 = id4Var2.z;
            if (f2 != -1.0f) {
                fMax = Math.max(fMax, f2);
            }
        }
        float f3 = fMax == -1.0f ? -1.0f : fMax * f;
        if (this.D1 == null || (en6Var = this.n0) == null) {
            return f3;
        }
        int i = id4Var.v;
        int i2 = id4Var.w;
        float f4 = -3.4028235E38f;
        if (en6Var.i) {
            float f5 = en6Var.l;
            if (f5 != -3.4028235E38f && en6Var.j == i && en6Var.k == i2) {
                f4 = f5;
            } else {
                f4 = 1024.0f;
                if (!en6Var.g(i, i2, 1024.0d)) {
                    float f6 = 0.0f;
                    while (true) {
                        float f7 = f4 - f6;
                        if (Math.abs(f7) <= 5.0f) {
                            break;
                        }
                        float f8 = (f7 / 2.0f) + f6;
                        if (en6Var.g(i, i2, f8)) {
                            f6 = f8;
                        } else {
                            f4 = f8;
                        }
                    }
                    f4 = f6;
                }
                en6Var.l = f4;
                en6Var.j = i;
                en6Var.k = i2;
            }
        }
        return f3 != -1.0f ? Math.max(f3, f4) : f4;
    }

    public final boolean b1(en6 en6Var) {
        if (this.M1 || P0(en6Var.a)) {
            return false;
        }
        return !en6Var.f || wz7.b(this.b1);
    }

    @Override // defpackage.in6
    public final ArrayList c0(ra raVar, id4 id4Var, boolean z) {
        boolean z2 = this.M1;
        Context context = this.b1;
        List<en6> listR0 = R0(context, raVar, id4Var, z, z2);
        HashMap<mn6.a, List<en6>> map = mn6.a;
        ArrayList arrayList = new ArrayList(listR0);
        Collections.sort(arrayList, new ln6(new kn6(context, id4Var)));
        return arrayList;
    }

    public final void c1(an6 an6Var, int i) {
        Trace.beginSection("skipVideoBuffer");
        an6Var.e(i);
        Trace.endSection();
        this.Q0.f++;
    }

    @Override // androidx.media3.exoplayer.a, androidx.media3.exoplayer.k
    public final boolean d() {
        if (!this.M0) {
            return false;
        }
        sfb sfbVar = this.p1;
        return sfbVar == null || sfbVar.d();
    }

    public final void d1(int i, int i2) {
        ln2 ln2Var = this.Q0;
        ln2Var.h += i;
        int i3 = i + i2;
        ln2Var.g += i3;
        this.A1 += i3;
        int i4 = this.B1 + i3;
        this.B1 = i4;
        ln2Var.i = Math.max(i4, ln2Var.i);
        int i5 = this.e1;
        if (i5 <= 0 || this.A1 < i5) {
            return;
        }
        W0();
    }

    public final void e1(bq6.b bVar) {
        toa toaVar = this.I;
        if (toaVar.p()) {
            this.R1 = -9223372036854775807L;
            return;
        }
        int iB = toaVar.b(bVar.a);
        if (iB == -1) {
            this.R1 = -9223372036854775807L;
        } else {
            this.R1 = toaVar.f(iB, new toa.b(), false).d;
        }
    }

    /* JADX WARN: Code duplicated, block: B:69:0x013c  */
    /* JADX WARN: Instruction removed from duplicated block: B:69:0x013c, please report this as an issue */
    @Override // defpackage.in6
    public final an6.a f0(en6 en6Var, id4 id4Var, MediaCrypto mediaCrypto, float f) {
        xh1 xh1Var;
        int i;
        d dVar;
        Point point;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        byte b2;
        boolean z;
        Pair<Integer, Integer> pairB;
        int iQ0;
        String str = en6Var.c;
        id4[] id4VarArr = this.C;
        id4VarArr.getClass();
        int i2 = id4Var.v;
        float f2 = id4Var.z;
        xh1 xh1Var2 = id4Var.E;
        int i3 = id4Var.w;
        int iS0 = S0(en6Var, id4Var);
        if (id4VarArr.length == 1) {
            if (iS0 != -1 && (iQ0 = Q0(en6Var, id4Var)) != -1) {
                iS0 = Math.min((int) (iS0 * 1.5f), iQ0);
            }
            dVar = new d(i2, i3, iS0);
            xh1Var = xh1Var2;
            i = i3;
        } else {
            int length = id4VarArr.length;
            int iMax = i2;
            int iMax2 = i3;
            int i4 = 0;
            boolean z2 = false;
            while (i4 < length) {
                id4 id4Var2 = id4VarArr[i4];
                id4[] id4VarArr2 = id4VarArr;
                if (xh1Var2 != null && id4Var2.E == null) {
                    id4.a aVarA = id4Var2.a();
                    aVarA.D = xh1Var2;
                    id4Var2 = new id4(aVarA);
                }
                pn2 pn2VarB = en6Var.b(id4Var, id4Var2);
                int i5 = length;
                int i6 = id4Var2.w;
                if (pn2VarB.d != 0) {
                    int i7 = id4Var2.v;
                    b2 = -1;
                    z2 |= i7 == -1 || i6 == -1;
                    iMax = Math.max(iMax, i7);
                    iMax2 = Math.max(iMax2, i6);
                    iS0 = Math.max(iS0, S0(en6Var, id4Var2));
                } else {
                    b2 = -1;
                }
                length = i5;
                i4++;
                id4VarArr = id4VarArr2;
            }
            if (z2) {
                md6.g("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + iMax + "x" + iMax2);
                boolean z3 = i3 > i2;
                int i8 = z3 ? i3 : i2;
                boolean z4 = z3;
                int i9 = z3 ? i2 : i3;
                float f3 = i9 / i8;
                int i10 = 0;
                while (true) {
                    xh1Var = xh1Var2;
                    if (i10 < 9) {
                        int i11 = U1[i10];
                        int i12 = i10;
                        int i13 = (int) (i11 * f3);
                        if (i11 > i8 && i13 > i9) {
                            if (!z4) {
                                i13 = i11;
                            }
                            if (!z4) {
                                i11 = i13;
                            }
                            int i14 = i9;
                            MediaCodecInfo.CodecCapabilities codecCapabilities = en6Var.d;
                            if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
                                point = null;
                            } else {
                                int widthAlignment = videoCapabilities.getWidthAlignment();
                                int heightAlignment = videoCapabilities.getHeightAlignment();
                                point = new Point(n6b.g(i13, widthAlignment) * widthAlignment, n6b.g(i11, heightAlignment) * heightAlignment);
                            }
                            if (point != null) {
                                i = i3;
                                if (en6Var.g(point.x, point.y, f2)) {
                                }
                            } else {
                                i = i3;
                            }
                            i10 = i12 + 1;
                            i3 = i;
                            xh1Var2 = xh1Var;
                            i9 = i14;
                            i8 = i8;
                        }
                        if (point != null) {
                            iMax = Math.max(iMax, point.x);
                            iMax2 = Math.max(iMax2, point.y);
                            id4.a aVarA2 = id4Var.a();
                            aVarA2.u = iMax;
                            aVarA2.v = iMax2;
                            iS0 = Math.max(iS0, Q0(en6Var, new id4(aVarA2)));
                            md6.g("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + iMax + "x" + iMax2);
                        }
                    }
                    i = i3;
                    point = null;
                    if (point != null) {
                        iMax = Math.max(iMax, point.x);
                        iMax2 = Math.max(iMax2, point.y);
                        id4.a aVarA3 = id4Var.a();
                        aVarA3.u = iMax;
                        aVarA3.v = iMax2;
                        iS0 = Math.max(iS0, Q0(en6Var, new id4(aVarA3)));
                        md6.g("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + iMax + "x" + iMax2);
                    }
                }
            } else {
                xh1Var = xh1Var2;
                i = i3;
            }
            dVar = new d(iMax, iMax2, iS0);
        }
        this.m1 = dVar;
        int i15 = this.M1 ? this.N1 : 0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i2);
        mediaFormat.setInteger("height", i);
        tn6.b(mediaFormat, id4Var.r);
        if (f2 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f2);
        }
        tn6.a(mediaFormat, "rotation-degrees", id4Var.A);
        if (xh1Var != null) {
            xh1 xh1Var3 = xh1Var;
            tn6.a(mediaFormat, "color-transfer", xh1Var3.c);
            tn6.a(mediaFormat, "color-standard", xh1Var3.a);
            tn6.a(mediaFormat, "color-range", xh1Var3.b);
            byte[] bArr = xh1Var3.d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(id4Var.o) && (pairB = og1.b(id4Var)) != null) {
            tn6.a(mediaFormat, "profile", ((Integer) pairB.first).intValue());
        }
        mediaFormat.setInteger("max-width", dVar.a);
        mediaFormat.setInteger("max-height", dVar.b);
        tn6.a(mediaFormat, "max-input-size", dVar.c);
        mediaFormat.setInteger("priority", 0);
        if (f != -1.0f) {
            mediaFormat.setFloat("operating-rate", f);
        }
        if (this.f1) {
            z = true;
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            z = true;
        }
        if (i15 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", z);
            mediaFormat.setInteger("audio-session-id", i15);
        }
        if (Build.VERSION.SDK_INT >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.L1));
        }
        R(mediaFormat);
        Surface surfaceT0 = T0(en6Var);
        if (this.p1 != null && !n6b.K(this.b1)) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        return new an6.a(en6Var, mediaFormat, id4Var, surfaceT0, mediaCrypto, null);
    }

    public final void f1(long j) {
        ln2 ln2Var = this.Q0;
        ln2Var.k += j;
        ln2Var.l++;
        this.G1 += j;
        this.H1++;
    }

    @Override // defpackage.in6
    public final void g0(nn2 nn2Var) {
        if (this.o1) {
            ByteBuffer byteBuffer = nn2Var.z;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b2 = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b3 = byteBuffer.get();
                byte b4 = byteBuffer.get();
                byteBuffer.position(0);
                if (b2 == -75 && s == 60 && s2 == 1 && b3 == 4) {
                    if (b4 == 0 || b4 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        an6 an6Var = this.g0;
                        an6Var.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        an6Var.b(bundle);
                    }
                }
            }
        }
    }

    @Override // androidx.media3.exoplayer.k, androidx.media3.exoplayer.l
    public final String getName() {
        return "MediaCodecVideoRenderer";
    }

    @Override // defpackage.in6, androidx.media3.exoplayer.k
    public final void h(long j, long j2) throws lo3 {
        sfb sfbVar = this.p1;
        if (sfbVar != null) {
            try {
                sfbVar.h(j, j2);
            } catch (sfb.c e2) {
                throw G(e2, e2.t, false, 7001);
            }
        }
        super.h(j, j2);
    }

    @Override // defpackage.in6
    public final boolean l0(id4 id4Var) throws lo3 {
        sfb sfbVar = this.p1;
        if (sfbVar == null || sfbVar.z()) {
            return true;
        }
        try {
            return this.p1.s(id4Var);
        } catch (sfb.c e2) {
            throw G(e2, id4Var, false, 7000);
        }
    }

    @Override // defpackage.in6
    public final void m0(final Exception exc) {
        md6.e("MediaCodecVideoRenderer", "Video codec error", exc);
        final rfb.a aVar = this.d1;
        Handler handler = aVar.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: kfb
                @Override // java.lang.Runnable
                public final void run() {
                    rfb rfbVar = aVar.b;
                    String str = n6b.a;
                    rfbVar.j(exc);
                }
            });
        }
    }

    @Override // defpackage.in6
    public final void n0(final long j, final long j2, String str) {
        final String str2;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        final rfb.a aVar = this.d1;
        Handler handler = aVar.a;
        if (handler != null) {
            str2 = str;
            handler.post(new Runnable() { // from class: gfb
                @Override // java.lang.Runnable
                public final void run() {
                    rfb rfbVar = aVar.b;
                    String str3 = n6b.a;
                    rfbVar.l(j, j2, str2);
                }
            });
        } else {
            str2 = str;
        }
        this.n1 = P0(str2);
        en6 en6Var = this.n0;
        en6Var.getClass();
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 29 && "video/x-vnd.on2.vp9".equals(en6Var.b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = en6Var.d;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
                if (codecProfileLevel.profile == 16384) {
                    z = true;
                    break;
                }
            }
        }
        this.o1 = z;
        X0();
    }

    @Override // androidx.media3.exoplayer.k
    public final void o() {
        sfb sfbVar = this.p1;
        if (sfbVar == null) {
            bfb bfbVar = this.g1;
            if (bfbVar.e == 0) {
                bfbVar.e = 1;
                return;
            }
            return;
        }
        int i = this.r1;
        if (i == 0 || i == 1) {
            this.r1 = 0;
        } else {
            sfbVar.A();
        }
    }

    @Override // defpackage.in6
    public final void o0(final androidx.media3.exoplayer.b bVar) {
        final rfb.a aVar = this.d1;
        Handler handler = aVar.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: hfb
                @Override // java.lang.Runnable
                public final void run() {
                    rfb rfbVar = aVar.b;
                    String str = n6b.a;
                    rfbVar.a(bVar);
                }
            });
        }
    }

    @Override // defpackage.in6
    public final void p0(final String str) {
        final rfb.a aVar = this.d1;
        Handler handler = aVar.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: lfb
                @Override // java.lang.Runnable
                public final void run() {
                    rfb rfbVar = aVar.b;
                    String str2 = n6b.a;
                    rfbVar.d(str);
                }
            });
        }
    }

    @Override // defpackage.in6
    public final pn2 q0(jd4 jd4Var) {
        final pn2 pn2VarQ0 = super.q0(jd4Var);
        final id4 id4Var = jd4Var.b;
        id4Var.getClass();
        final rfb.a aVar = this.d1;
        Handler handler = aVar.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: pfb
                @Override // java.lang.Runnable
                public final void run() {
                    rfb rfbVar = aVar.b;
                    String str = n6b.a;
                    rfbVar.i(id4Var, pn2VarQ0);
                }
            });
        }
        cfb cfbVar = this.k1;
        if (cfbVar != null) {
            cfbVar.b();
        }
        return pn2VarQ0;
    }

    @Override // defpackage.in6
    public final void r0(id4 id4Var, MediaFormat mediaFormat) {
        int integer;
        int i;
        an6 an6Var = this.g0;
        if (an6Var != null) {
            an6Var.m(this.x1);
        }
        if (this.M1) {
            i = id4Var.v;
            integer = id4Var.w;
        } else {
            mediaFormat.getClass();
            boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            int integer2 = z ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
            integer = z ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
            i = integer2;
        }
        float f = id4Var.B;
        int i2 = id4Var.A;
        if (i2 == 90 || i2 == 270) {
            f = 1.0f / f;
            int i3 = integer;
            integer = i;
            i = i3;
        }
        this.J1 = new tfb(i, integer, f);
        sfb sfbVar = this.p1;
        if (sfbVar == null || !this.S1) {
            this.g1.f(id4Var.z);
        } else {
            id4.a aVarA = id4Var.a();
            aVarA.u = i;
            aVarA.v = integer;
            aVarA.A = f;
            id4 id4Var2 = new id4(aVarA);
            int i4 = this.r1;
            List list = this.s1;
            if (list == null) {
                k95.b bVar = k95.u;
                list = ul8.x;
            }
            sfbVar.k(id4Var2, this.R0.b, i4, list);
            this.r1 = 2;
        }
        this.S1 = false;
    }

    @Override // defpackage.in6
    public final void t0(long j) {
        super.t0(j);
        if (this.M1) {
            return;
        }
        this.C1--;
    }

    @Override // defpackage.in6
    public final void u0() {
        sfb sfbVar = this.p1;
        if (sfbVar != null) {
            sfbVar.m();
            if (this.Q1 == -9223372036854775807L) {
                this.Q1 = this.R0.b;
            }
            this.p1.l(-this.Q1);
        } else {
            this.g1.e(2);
        }
        this.S1 = true;
        X0();
    }

    @Override // defpackage.in6, androidx.media3.exoplayer.k
    public final void v(float f, float f2) {
        super.v(f, f2);
        sfb sfbVar = this.p1;
        if (sfbVar != null) {
            sfbVar.o(f);
        } else {
            this.g1.h(f);
        }
        cfb cfbVar = this.k1;
        if (cfbVar != null) {
            cfbVar.c(f);
        }
    }

    @Override // defpackage.in6
    public final void v0(nn2 nn2Var) {
        ByteBuffer byteBuffer;
        sf0 sf0Var = this.i1;
        if (sf0Var != null) {
            en6 en6Var = this.n0;
            en6Var.getClass();
            if (en6Var.b.equals("video/av01") && nn2Var.i(1) && (byteBuffer = nn2Var.w) != null) {
                int iPosition = byteBuffer.position();
                int iLimit = byteBuffer.limit();
                byteBuffer.limit(Math.min(iLimit, iPosition + 500));
                ByteBuffer byteBuffer2 = sf0Var.a;
                byteBuffer2.clear();
                byteBuffer2.put(byteBuffer);
                byteBuffer2.flip();
                byteBuffer.position(iPosition);
                byteBuffer.limit(iLimit);
            }
        }
        this.T1 = 0;
        int iA0 = a0(nn2Var);
        if ((Build.VERSION.SDK_INT < 34 || (iA0 & 32) == 0) && !this.M1) {
            this.C1++;
        }
    }

    @Override // defpackage.in6
    public final boolean x0(long j, long j2, an6 an6Var, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, id4 id4Var) {
        int i4;
        an6Var.getClass();
        long j4 = j3 - this.R0.c;
        int i5 = 0;
        while (true) {
            PriorityQueue<Long> priorityQueue = this.l1;
            Long lPeek = priorityQueue.peek();
            if (lPeek == null || lPeek.longValue() >= j3) {
                break;
            }
            i5++;
            priorityQueue.poll();
        }
        d1(i5, 0);
        sfb sfbVar = this.p1;
        if (sfbVar != null) {
            if (!z || z2) {
                return sfbVar.r(j3, new a(an6Var, i, j4));
            }
            c1(an6Var, i);
            return true;
        }
        int iA = this.g1.a(j3, j, j2, this.R0.b, z, z2, this.h1);
        bfb.a aVar = this.h1;
        cfb cfbVar = this.k1;
        if (cfbVar != null && iA != 5 && iA != 4) {
            cfbVar.a(j3, aVar.a);
        }
        if (iA == 0) {
            vf1 vf1Var = this.z;
            vf1Var.getClass();
            long jD = vf1Var.d();
            zeb zebVar = this.P1;
            if (zebVar != null) {
                zebVar.f(j4, jD, id4Var, this.i0);
            }
            Y0(an6Var, i, jD);
            f1(aVar.a);
            return true;
        }
        if (iA == 1) {
            long j5 = aVar.b;
            long j6 = aVar.a;
            if (j5 == this.I1) {
                c1(an6Var, i);
            } else {
                zeb zebVar2 = this.P1;
                if (zebVar2 != null) {
                    i4 = i;
                    zebVar2.f(j4, j5, id4Var, this.i0);
                } else {
                    i4 = i;
                }
                Y0(an6Var, i4, j5);
            }
            f1(j6);
            this.I1 = j5;
            return true;
        }
        if (iA == 2) {
            Trace.beginSection("dropVideoBuffer");
            an6Var.e(i);
            Trace.endSection();
            d1(0, 1);
            f1(aVar.a);
            return true;
        }
        if (iA == 3) {
            c1(an6Var, i);
            f1(aVar.a);
            return true;
        }
        if (iA != 4 && iA != 5) {
            aa0.c(String.valueOf(iA));
        }
        return false;
    }

    @Override // defpackage.in6, androidx.media3.exoplayer.a, androidx.media3.exoplayer.j.b
    public final void y(int i, Object obj) {
        if (i == 1) {
            Z0(obj);
            return;
        }
        if (i == 7) {
            obj.getClass();
            zeb zebVar = (zeb) obj;
            this.P1 = zebVar;
            sfb sfbVar = this.p1;
            if (sfbVar != null) {
                sfbVar.x(zebVar);
                return;
            }
            return;
        }
        if (i == 10) {
            obj.getClass();
            int iIntValue = ((Integer) obj).intValue();
            if (this.N1 != iIntValue) {
                this.N1 = iIntValue;
                if (this.M1) {
                    z0();
                    return;
                }
                return;
            }
            return;
        }
        if (i == 4) {
            obj.getClass();
            int iIntValue2 = ((Integer) obj).intValue();
            this.x1 = iIntValue2;
            an6 an6Var = this.g0;
            if (an6Var != null) {
                an6Var.m(iIntValue2);
                return;
            }
            return;
        }
        if (i == 5) {
            obj.getClass();
            int iIntValue3 = ((Integer) obj).intValue();
            this.y1 = iIntValue3;
            sfb sfbVar2 = this.p1;
            if (sfbVar2 != null) {
                sfbVar2.n(iIntValue3);
                return;
            }
            dfb dfbVar = this.g1.b;
            if (dfbVar.j == iIntValue3) {
                return;
            }
            dfbVar.j = iIntValue3;
            dfbVar.d(true);
            return;
        }
        if (i == 13) {
            obj.getClass();
            List<Object> list = (List) obj;
            if (list.equals(afb.a)) {
                sfb sfbVar3 = this.p1;
                if (sfbVar3 == null || !sfbVar3.z()) {
                    return;
                }
                this.p1.g();
                return;
            }
            this.s1 = list;
            sfb sfbVar4 = this.p1;
            if (sfbVar4 != null) {
                sfbVar4.u(list);
                return;
            }
            return;
        }
        if (i == 14) {
            obj.getClass();
            ar9 ar9Var = (ar9) obj;
            if (ar9Var.a == 0 || ar9Var.b == 0) {
                return;
            }
            this.v1 = ar9Var;
            sfb sfbVar5 = this.p1;
            if (sfbVar5 != null) {
                Surface surface = this.t1;
                surface.getClass();
                sfbVar5.y(surface, ar9Var);
                return;
            }
            return;
        }
        switch (i) {
            case Crypto.DEFAULT_BLOCKLENGTH /* 16 */:
                obj.getClass();
                this.L1 = ((Integer) obj).intValue();
                an6 an6Var2 = this.g0;
                if (an6Var2 != null && Build.VERSION.SDK_INT >= 35) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("importance", Math.max(0, -this.L1));
                    an6Var2.b(bundle);
                }
                break;
            case 17:
                Surface surface2 = this.t1;
                Z0(null);
                obj.getClass();
                ((pn6) obj).y(1, surface2);
                break;
            case 18:
                boolean z = this.D1 != null;
                a89 a89Var = (a89) obj;
                this.D1 = a89Var;
                if (z != (a89Var != null)) {
                    M0(this.h0);
                }
                break;
            default:
                super.y(i, obj);
                break;
        }
    }
}
