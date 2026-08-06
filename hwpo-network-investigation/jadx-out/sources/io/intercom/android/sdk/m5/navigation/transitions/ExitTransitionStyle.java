package io.intercom.android.sdk.m5.navigation.transitions;

import defpackage.dza;
import defpackage.et3;
import defpackage.jo3;
import defpackage.ko3;
import defpackage.nl3;
import defpackage.o91;
import defpackage.ol3;
import defpackage.ph3;
import defpackage.qq2;
import defpackage.sr9;
import defpackage.t39;
import defpackage.xv;
import defpackage.xya;
import defpackage.zg3;
import defpackage.zva;
import java.util.LinkedHashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ExitTransitionStyle {
    private static final /* synthetic */ nl3 $ENTRIES;
    private static final /* synthetic */ ExitTransitionStyle[] $VALUES;
    public static final ExitTransitionStyle SLIDE_DOWN = new SLIDE_DOWN("SLIDE_DOWN", 0);
    public static final ExitTransitionStyle SLIDE_OUT_RIGHT = new SLIDE_OUT_RIGHT("SLIDE_OUT_RIGHT", 1);
    public static final ExitTransitionStyle SLIDE_OUT_LEFT = new SLIDE_OUT_LEFT("SLIDE_OUT_LEFT", 2);
    public static final ExitTransitionStyle NONE = new ExitTransitionStyle("NONE", 3) { // from class: io.intercom.android.sdk.m5.navigation.transitions.ExitTransitionStyle.NONE
        {
            qq2 qq2Var = null;
        }

        @Override // io.intercom.android.sdk.m5.navigation.transitions.ExitTransitionStyle
        public jo3 transition() {
            return jo3.a;
        }
    };
    public static final ExitTransitionStyle NULL = new ExitTransitionStyle("NULL", 4) { // from class: io.intercom.android.sdk.m5.navigation.transitions.ExitTransitionStyle.NULL
        {
            qq2 qq2Var = null;
        }

        @Override // io.intercom.android.sdk.m5.navigation.transitions.ExitTransitionStyle
        public jo3 transition() {
            return null;
        }
    };

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class SLIDE_OUT_LEFT extends ExitTransitionStyle {
        public SLIDE_OUT_LEFT(String str, int i) {
            super(str, i, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int transition$lambda$0(int i) {
            return -i;
        }

        @Override // io.intercom.android.sdk.m5.navigation.transitions.ExitTransitionStyle
        public jo3 transition() {
            xya xyaVarC = xv.c(0, 0, null, 7);
            e eVar = new e();
            dza dzaVar = zg3.a;
            return new ko3(new zva((et3) null, new sr9(xyaVarC, new ph3(eVar)), (o91) null, (t39) null, (LinkedHashMap) null, 125)).b(zg3.f(xv.c(0, 0, null, 7)));
        }
    }

    private static final /* synthetic */ ExitTransitionStyle[] $values() {
        return new ExitTransitionStyle[]{SLIDE_DOWN, SLIDE_OUT_RIGHT, SLIDE_OUT_LEFT, NONE, NULL};
    }

    static {
        ExitTransitionStyle[] exitTransitionStyleArr$values = $values();
        $VALUES = exitTransitionStyleArr$values;
        $ENTRIES = ol3.b(exitTransitionStyleArr$values);
    }

    public /* synthetic */ ExitTransitionStyle(String str, int i, qq2 qq2Var) {
        this(str, i);
    }

    public static nl3<ExitTransitionStyle> getEntries() {
        return $ENTRIES;
    }

    public static ExitTransitionStyle valueOf(String str) {
        return (ExitTransitionStyle) Enum.valueOf(ExitTransitionStyle.class, str);
    }

    public static ExitTransitionStyle[] values() {
        return (ExitTransitionStyle[]) $VALUES.clone();
    }

    public abstract jo3 transition();

    private ExitTransitionStyle(String str, int i) {
        super(str, i);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class SLIDE_DOWN extends ExitTransitionStyle {
        public SLIDE_DOWN(String str, int i) {
            super(str, i, null);
        }

        @Override // io.intercom.android.sdk.m5.navigation.transitions.ExitTransitionStyle
        public jo3 transition() {
            return zg3.k(xv.c(0, 0, null, 7), new d());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int transition$lambda$0(int i) {
            return i;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class SLIDE_OUT_RIGHT extends ExitTransitionStyle {
        public SLIDE_OUT_RIGHT(String str, int i) {
            super(str, i, null);
        }

        @Override // io.intercom.android.sdk.m5.navigation.transitions.ExitTransitionStyle
        public jo3 transition() {
            xya xyaVarC = xv.c(0, 0, null, 7);
            f fVar = new f();
            dza dzaVar = zg3.a;
            return new ko3(new zva((et3) null, new sr9(xyaVarC, new ph3(fVar)), (o91) null, (t39) null, (LinkedHashMap) null, 125)).b(zg3.f(xv.c(0, 0, null, 7)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int transition$lambda$0(int i) {
            return i;
        }
    }
}
