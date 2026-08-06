package androidx.media3.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.AttachedSurfaceControl;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceControl;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.SurfaceSyncGroup;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.image.ImageOutput;
import androidx.media3.ui.PlayerView;
import com.hwpo_training_app.R;
import defpackage.am3;
import defpackage.c48;
import defpackage.d55;
import defpackage.e48;
import defpackage.h28;
import defpackage.jib;
import defpackage.k95;
import defpackage.kc2;
import defpackage.lh8;
import defpackage.o38;
import defpackage.qa;
import defpackage.qx9;
import defpackage.s28;
import defpackage.teb;
import defpackage.tfb;
import defpackage.toa;
import defpackage.vua;
import defpackage.xl7;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class PlayerView extends FrameLayout {
    public static final /* synthetic */ int c0 = 0;
    public final ImageView A;
    public final SubtitleView B;
    public final View C;
    public final TextView D;
    public final androidx.media3.ui.c E;
    public final FrameLayout F;
    public final FrameLayout G;
    public final Handler H;
    public final Class<?> I;
    public final Method J;
    public final Object K;
    public s28 L;
    public boolean M;
    public androidx.media3.ui.c.m N;
    public int O;
    public int P;
    public Drawable Q;
    public int R;
    public boolean S;
    public CharSequence T;
    public int U;
    public boolean V;
    public boolean W;
    public boolean a0;
    public boolean b0;
    public final b t;
    public final AspectRatioFrameLayout u;
    public final View v;
    public final View w;
    public final boolean x;
    public final e y;
    public final ImageView z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a {
        public static void a(SurfaceView surfaceView) {
            surfaceView.setSurfaceLifecycle(2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class b implements s28.c, View.OnClickListener, androidx.media3.ui.c.m, androidx.media3.ui.c.d {
        public final toa.b t = new toa.b();
        public Object u;

        public b() {
        }

        @Override // s28.c
        public final void F(kc2 kc2Var) {
            SubtitleView subtitleView = PlayerView.this.B;
            if (subtitleView != null) {
                subtitleView.setCues(kc2Var.a);
            }
        }

        @Override // s28.c
        public final void J(vua vuaVar) {
            PlayerView playerView = PlayerView.this;
            s28 s28Var = playerView.L;
            s28Var.getClass();
            toa toaVarN = s28Var.H(17) ? s28Var.N() : toa.a;
            if (toaVarN.p()) {
                this.u = null;
            } else {
                boolean zH = s28Var.H(30);
                toa.b bVar = this.t;
                if (!zH || s28Var.B().a.isEmpty()) {
                    Object obj = this.u;
                    if (obj != null) {
                        int iB = toaVarN.b(obj);
                        if (iB != -1) {
                            if (s28Var.G() == toaVarN.f(iB, bVar, false).c) {
                                return;
                            }
                        }
                        this.u = null;
                    }
                } else {
                    this.u = toaVarN.f(s28Var.p(), bVar, true).b;
                }
            }
            playerView.n(false);
        }

        @Override // s28.c
        public final void Q() {
            PlayerView playerView = PlayerView.this;
            View view = playerView.v;
            if (view != null) {
                view.setVisibility(4);
                if (!playerView.b()) {
                    playerView.c();
                    return;
                }
                ImageView imageView = playerView.z;
                if (imageView != null) {
                    imageView.setVisibility(4);
                }
            }
        }

        @Override // s28.c
        public final void b(tfb tfbVar) {
            PlayerView playerView;
            s28 s28Var;
            if (tfbVar.equals(tfb.d) || (s28Var = (playerView = PlayerView.this).L) == null || s28Var.A() == 1) {
                return;
            }
            playerView.j();
        }

        @Override // s28.c
        public final void d0(int i, int i2) {
            PlayerView playerView = PlayerView.this;
            View view = playerView.w;
            if (Build.VERSION.SDK_INT == 34 && (view instanceof SurfaceView) && playerView.b0) {
                final e eVar = playerView.y;
                eVar.getClass();
                Handler handler = playerView.H;
                final SurfaceView surfaceView = (SurfaceView) view;
                final c48 c48Var = new c48(playerView);
                handler.post(new Runnable() { // from class: d48
                    @Override // java.lang.Runnable
                    public final void run() {
                        PlayerView.e.a(eVar, surfaceView, c48Var);
                    }
                });
            }
        }

        @Override // s28.c
        public final void o(s28.d dVar, s28.d dVar2, int i) {
            androidx.media3.ui.c cVar;
            int i2 = PlayerView.c0;
            PlayerView playerView = PlayerView.this;
            if (playerView.d() && playerView.W && (cVar = playerView.E) != null) {
                cVar.g();
            }
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int i = PlayerView.c0;
            PlayerView.this.i();
        }

        @Override // androidx.media3.ui.c.m
        public final void p(int i) {
            int i2 = PlayerView.c0;
            PlayerView.this.l();
        }

        @Override // s28.c
        public final void u(int i, boolean z) {
            int i2 = PlayerView.c0;
            PlayerView playerView = PlayerView.this;
            playerView.k();
            if (!playerView.d() || !playerView.W) {
                playerView.e(false);
                return;
            }
            androidx.media3.ui.c cVar = playerView.E;
            if (cVar != null) {
                cVar.g();
            }
        }

        @Override // s28.c
        public final void x(int i) {
            int i2 = PlayerView.c0;
            PlayerView playerView = PlayerView.this;
            playerView.k();
            playerView.m();
            if (!playerView.d() || !playerView.W) {
                playerView.e(false);
                return;
            }
            androidx.media3.ui.c cVar = playerView.E;
            if (cVar != null) {
                cVar.g();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface c {
        void a();
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface d {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class e {
        public SurfaceSyncGroup a;

        public static /* synthetic */ void a(e eVar, SurfaceView surfaceView, c48 c48Var) {
            eVar.getClass();
            AttachedSurfaceControl rootSurfaceControl = surfaceView.getRootSurfaceControl();
            if (rootSurfaceControl == null) {
                return;
            }
            SurfaceSyncGroup surfaceSyncGroup = new SurfaceSyncGroup("exo-sync-b-334901521");
            eVar.a = surfaceSyncGroup;
            xl7.r(surfaceSyncGroup.add(rootSurfaceControl, new e48()));
            c48Var.run();
            rootSurfaceControl.applyTransactionOnDraw(new SurfaceControl.Transaction());
        }

        public final void b() {
            SurfaceSyncGroup surfaceSyncGroup = this.a;
            if (surfaceSyncGroup != null) {
                surfaceSyncGroup.markSyncReady();
                this.a = null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PlayerView(Context context, AttributeSet attributeSet, int i) {
        int i2;
        int i3;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z5;
        boolean z6;
        int i10;
        boolean z7;
        int i11;
        Class<ExoPlayer> cls;
        Object objNewProxyInstance;
        Method method;
        super(context, attributeSet, i);
        b bVar = new b();
        this.t = bVar;
        this.H = new Handler(Looper.getMainLooper());
        if (isInEditMode()) {
            this.u = null;
            this.v = null;
            this.w = null;
            this.x = false;
            this.y = null;
            this.z = null;
            this.A = null;
            this.B = null;
            this.C = null;
            this.D = null;
            this.E = null;
            this.F = null;
            this.G = null;
            this.I = null;
            this.J = null;
            this.K = null;
            ImageView imageView = new ImageView(context);
            Resources resources = getResources();
            imageView.setImageDrawable(resources.getDrawable(2131230938, context.getTheme()));
            imageView.setBackgroundColor(resources.getColor(R.color.exo_edit_mode_background_color, null));
            addView(imageView);
            return;
        }
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, lh8.d, i, 0);
            try {
                boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(42);
                int color = typedArrayObtainStyledAttributes.getColor(42, 0);
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(22, R.layout.exo_player_view);
                boolean z8 = typedArrayObtainStyledAttributes.getBoolean(50, true);
                int i12 = typedArrayObtainStyledAttributes.getInt(3, 1);
                int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(9, 0);
                int i13 = typedArrayObtainStyledAttributes.getInt(15, 0);
                boolean z9 = typedArrayObtainStyledAttributes.getBoolean(51, true);
                int i14 = typedArrayObtainStyledAttributes.getInt(45, 1);
                int i15 = typedArrayObtainStyledAttributes.getInt(28, 0);
                z = z9;
                i2 = typedArrayObtainStyledAttributes.getInt(38, 5000);
                boolean z10 = typedArrayObtainStyledAttributes.getBoolean(14, true);
                boolean z11 = typedArrayObtainStyledAttributes.getBoolean(4, true);
                int integer = typedArrayObtainStyledAttributes.getInteger(35, 0);
                this.S = typedArrayObtainStyledAttributes.getBoolean(16, this.S);
                boolean z12 = typedArrayObtainStyledAttributes.getBoolean(13, true);
                typedArrayObtainStyledAttributes.recycle();
                z4 = z12;
                z2 = z10;
                z6 = z8;
                i9 = color;
                i3 = resourceId;
                i5 = resourceId2;
                i7 = i15;
                z3 = z11;
                i4 = integer;
                i10 = i12;
                z5 = zHasValue;
                i8 = i14;
                i6 = i13;
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            i2 = 5000;
            i3 = R.layout.exo_player_view;
            z = true;
            z2 = true;
            z3 = true;
            z4 = true;
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i7 = 0;
            i8 = 1;
            i9 = 0;
            z5 = false;
            z6 = true;
            i10 = 1;
        }
        LayoutInflater.from(context).inflate(i3, this);
        setDescendantFocusability(262144);
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(R.id.exo_content_frame);
        this.u = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setResizeMode(i7);
        }
        View viewFindViewById = findViewById(R.id.exo_shutter);
        this.v = viewFindViewById;
        if (viewFindViewById != null && z5) {
            viewFindViewById.setBackgroundColor(i9);
        }
        if (aspectRatioFrameLayout == null || i8 == 0) {
            this.w = null;
            z7 = false;
        } else {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (i8 != 2) {
                if (i8 == 3) {
                    try {
                        int i16 = qx9.E;
                        this.w = (View) qx9.class.getConstructor(Context.class).newInstance(context);
                        z7 = true;
                    } catch (Exception e2) {
                        throw new IllegalStateException("spherical_gl_surface_view requires an ExoPlayer dependency", e2);
                    }
                } else if (i8 != 4) {
                    SurfaceView surfaceView = new SurfaceView(context);
                    if (Build.VERSION.SDK_INT >= 34) {
                        a.a(surfaceView);
                    }
                    this.w = surfaceView;
                } else {
                    try {
                        int i17 = teb.u;
                        this.w = (View) teb.class.getConstructor(Context.class).newInstance(context);
                    } catch (Exception e3) {
                        throw new IllegalStateException("video_decoder_gl_surface_view requires an ExoPlayer dependency", e3);
                    }
                }
                this.w.setLayoutParams(layoutParams);
                this.w.setOnClickListener(bVar);
                this.w.setClickable(false);
                aspectRatioFrameLayout.addView(this.w, 0);
            } else {
                this.w = new TextureView(context);
            }
            z7 = false;
            this.w.setLayoutParams(layoutParams);
            this.w.setOnClickListener(bVar);
            this.w.setClickable(false);
            aspectRatioFrameLayout.addView(this.w, 0);
        }
        this.x = z7;
        this.y = Build.VERSION.SDK_INT == 34 ? new e() : null;
        this.F = (FrameLayout) findViewById(R.id.exo_ad_overlay);
        this.G = (FrameLayout) findViewById(R.id.exo_overlay);
        this.z = (ImageView) findViewById(R.id.exo_image);
        this.P = i6;
        try {
            cls = ExoPlayer.class;
            Class<?>[] clsArr = new Class[1];
            i11 = 0;
            try {
                clsArr[0] = ImageOutput.class;
                method = cls.getMethod("setImageOutput", clsArr);
                objNewProxyInstance = Proxy.newProxyInstance(ImageOutput.class.getClassLoader(), new Class[]{ImageOutput.class}, new InvocationHandler() { // from class: a48
                    @Override // java.lang.reflect.InvocationHandler
                    public final Object invoke(Object obj, Method method2, Object[] objArr) {
                        int i18 = PlayerView.c0;
                        if (!method2.getName().equals("onImageAvailable")) {
                            return null;
                        }
                        final Bitmap bitmap = (Bitmap) objArr[1];
                        final PlayerView playerView = this.a;
                        playerView.H.post(new Runnable() { // from class: b48
                            @Override // java.lang.Runnable
                            public final void run() {
                                PlayerView.a(playerView, bitmap);
                            }
                        });
                        return null;
                    }
                });
            } catch (ClassNotFoundException | NoSuchMethodException unused) {
                cls = null;
                objNewProxyInstance = null;
                method = null;
            }
        } catch (ClassNotFoundException | NoSuchMethodException unused2) {
            i11 = 0;
        }
        this.I = cls;
        this.J = method;
        this.K = objNewProxyInstance;
        ImageView imageView2 = (ImageView) findViewById(R.id.exo_artwork);
        this.A = imageView2;
        this.O = (!z6 || i10 == 0 || imageView2 == null) ? i11 : i10;
        if (i5 != 0) {
            this.Q = getContext().getDrawable(i5);
        }
        SubtitleView subtitleView = (SubtitleView) findViewById(R.id.exo_subtitles);
        this.B = subtitleView;
        if (subtitleView != null) {
            subtitleView.a();
            subtitleView.b();
        }
        View viewFindViewById2 = findViewById(R.id.exo_buffering);
        this.C = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setVisibility(8);
        }
        this.R = i4;
        TextView textView = (TextView) findViewById(R.id.exo_error_message);
        this.D = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        androidx.media3.ui.c cVar = (androidx.media3.ui.c) findViewById(R.id.exo_controller);
        View viewFindViewById3 = findViewById(R.id.exo_controller_placeholder);
        if (cVar != null) {
            this.E = cVar;
        } else if (viewFindViewById3 != null) {
            androidx.media3.ui.c cVar2 = new androidx.media3.ui.c(context, attributeSet);
            this.E = cVar2;
            cVar2.setId(R.id.exo_controller);
            cVar2.setLayoutParams(viewFindViewById3.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById3.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById3);
            viewGroup.removeView(viewFindViewById3);
            viewGroup.addView(cVar2, iIndexOfChild);
        } else {
            this.E = null;
        }
        androidx.media3.ui.c cVar3 = this.E;
        this.U = cVar3 != null ? i2 : i11;
        this.a0 = z2;
        this.V = z3;
        this.W = z4;
        this.M = (!z || cVar3 == null) ? i11 : 1;
        if (cVar3 != null) {
            o38 o38Var = cVar3.t;
            int i18 = o38Var.A;
            if (i18 != 3 && i18 != 2) {
                o38Var.f();
                o38Var.i(2);
            }
            androidx.media3.ui.c cVar4 = this.E;
            b bVar2 = this.t;
            cVar4.getClass();
            bVar2.getClass();
            cVar4.D.add(bVar2);
        }
        if (z) {
            setClickable(true);
        }
        l();
    }

    public static void a(PlayerView playerView, Bitmap bitmap) {
        playerView.setImage(new BitmapDrawable(playerView.getResources(), bitmap));
        s28 s28Var = playerView.L;
        if (s28Var != null && s28Var.H(30) && s28Var.B().a(2)) {
            return;
        }
        ImageView imageView = playerView.z;
        if (imageView != null) {
            imageView.setVisibility(0);
            playerView.o();
        }
        View view = playerView.v;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    private void setImage(Drawable drawable) {
        ImageView imageView = this.z;
        if (imageView == null) {
            return;
        }
        imageView.setImageDrawable(drawable);
        o();
    }

    private void setImageOutput(s28 s28Var) {
        Class<?> cls = this.I;
        if (cls == null || !cls.isAssignableFrom(s28Var.getClass())) {
            return;
        }
        try {
            Method method = this.J;
            method.getClass();
            Object obj = this.K;
            obj.getClass();
            method.invoke(s28Var, obj);
        } catch (IllegalAccessException | InvocationTargetException e2) {
            d55.a(e2);
        }
    }

    public final boolean b() {
        s28 s28Var = this.L;
        return s28Var != null && this.K != null && s28Var.H(30) && s28Var.B().a(4);
    }

    public final void c() {
        ImageView imageView = this.z;
        if (imageView != null) {
            imageView.setVisibility(4);
        }
        if (imageView != null) {
            imageView.setImageResource(android.R.color.transparent);
        }
    }

    public final boolean d() {
        s28 s28Var = this.L;
        return s28Var != null && s28Var.H(16) && this.L.g() && this.L.k();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        e eVar;
        super.dispatchDraw(canvas);
        if (Build.VERSION.SDK_INT == 34 && (eVar = this.y) != null && this.b0) {
            eVar.b();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        s28 s28Var = this.L;
        if (s28Var != null && s28Var.H(16) && this.L.g()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        int keyCode = keyEvent.getKeyCode();
        boolean z = keyCode == 19 || keyCode == 270 || keyCode == 22 || keyCode == 271 || keyCode == 20 || keyCode == 269 || keyCode == 21 || keyCode == 268 || keyCode == 23;
        androidx.media3.ui.c cVar = this.E;
        if (z && p() && !cVar.j()) {
            e(true);
            return true;
        }
        if ((p() && cVar.d(keyEvent)) || super.dispatchKeyEvent(keyEvent)) {
            e(true);
            return true;
        }
        if (z && p()) {
            e(true);
        }
        return false;
    }

    public final void e(boolean z) {
        if (!(d() && this.W) && p()) {
            androidx.media3.ui.c cVar = this.E;
            boolean z2 = cVar.j() && cVar.getShowTimeoutMs() <= 0;
            boolean zG = g();
            if (z || z2 || zG) {
                h(zG);
            }
        }
    }

    public final boolean f(Drawable drawable) {
        ImageView imageView = this.A;
        if (imageView != null && drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                float width = intrinsicWidth / intrinsicHeight;
                ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
                if (this.O == 2) {
                    width = getWidth() / getHeight();
                    scaleType = ImageView.ScaleType.CENTER_CROP;
                }
                AspectRatioFrameLayout aspectRatioFrameLayout = this.u;
                if (aspectRatioFrameLayout != null) {
                    aspectRatioFrameLayout.setAspectRatio(width);
                }
                imageView.setScaleType(scaleType);
                imageView.setImageDrawable(drawable);
                imageView.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    public final boolean g() {
        s28 s28Var = this.L;
        if (s28Var == null) {
            return true;
        }
        int iA = s28Var.A();
        if (!this.V) {
            return false;
        }
        if (this.L.H(17) && this.L.N().p()) {
            return false;
        }
        if (iA != 1 && iA != 4) {
            s28 s28Var2 = this.L;
            s28Var2.getClass();
            if (s28Var2.k()) {
                return false;
            }
        }
        return true;
    }

    public List<qa> getAdOverlayInfos() {
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.G;
        if (frameLayout != null) {
            arrayList.add(new qa(frameLayout));
        }
        androidx.media3.ui.c cVar = this.E;
        if (cVar != null) {
            arrayList.add(new qa(cVar));
        }
        return k95.q(arrayList);
    }

    public ViewGroup getAdViewGroup() {
        FrameLayout frameLayout = this.F;
        xl7.n(frameLayout, "exo_ad_overlay must be present for ad playback");
        return frameLayout;
    }

    public int getArtworkDisplayMode() {
        return this.O;
    }

    public boolean getControllerAutoShow() {
        return this.V;
    }

    public boolean getControllerHideOnTouch() {
        return this.a0;
    }

    public int getControllerShowTimeoutMs() {
        return this.U;
    }

    public Drawable getDefaultArtwork() {
        return this.Q;
    }

    public int getImageDisplayMode() {
        return this.P;
    }

    public FrameLayout getOverlayFrameLayout() {
        return this.G;
    }

    public s28 getPlayer() {
        return this.L;
    }

    public int getResizeMode() {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.u;
        aspectRatioFrameLayout.getClass();
        return aspectRatioFrameLayout.getResizeMode();
    }

    public SubtitleView getSubtitleView() {
        return this.B;
    }

    @Deprecated
    public boolean getUseArtwork() {
        return this.O != 0;
    }

    public boolean getUseController() {
        return this.M;
    }

    public View getVideoSurfaceView() {
        return this.w;
    }

    public final void h(boolean z) {
        if (p()) {
            int i = z ? 0 : this.U;
            androidx.media3.ui.c cVar = this.E;
            cVar.setShowTimeoutMs(i);
            o38 o38Var = cVar.t;
            androidx.media3.ui.c cVar2 = o38Var.a;
            if (!cVar2.l()) {
                cVar2.setVisibility(0);
                cVar2.m();
                ImageView imageView = cVar2.O;
                if (imageView != null) {
                    imageView.requestFocus();
                }
            }
            o38Var.k();
        }
    }

    public final void i() {
        if (!p() || this.L == null) {
            return;
        }
        androidx.media3.ui.c cVar = this.E;
        if (!cVar.j()) {
            e(true);
        } else if (this.a0) {
            cVar.g();
        }
    }

    public final void j() {
        s28 s28Var = this.L;
        tfb tfbVarR = s28Var != null ? s28Var.r() : tfb.d;
        int i = tfbVarR.a;
        int i2 = tfbVarR.b;
        float f = this.x ? 0.0f : (i2 == 0 || i == 0) ? 0.0f : (i * tfbVarR.c) / i2;
        AspectRatioFrameLayout aspectRatioFrameLayout = this.u;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setAspectRatio(f);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0020  */
    public final void k() {
        boolean z;
        View view = this.C;
        if (view != null) {
            s28 s28Var = this.L;
            if (s28Var == null || s28Var.A() != 2) {
                z = false;
            } else {
                int i = this.R;
                z = true;
                if (i != 2 && (i != 1 || !this.L.k())) {
                    z = false;
                }
            }
            view.setVisibility(z ? 0 : 8);
        }
    }

    public final void l() {
        androidx.media3.ui.c cVar = this.E;
        if (cVar == null || !this.M) {
            setContentDescription(null);
        } else if (cVar.j()) {
            setContentDescription(this.a0 ? getResources().getString(R.string.exo_controls_hide) : null);
        } else {
            setContentDescription(getResources().getString(R.string.exo_controls_show));
        }
    }

    public final void m() {
        TextView textView = this.D;
        if (textView != null) {
            CharSequence charSequence = this.T;
            if (charSequence != null) {
                textView.setText(charSequence);
                textView.setVisibility(0);
            } else {
                s28 s28Var = this.L;
                if (s28Var != null) {
                    s28Var.f();
                }
                textView.setVisibility(8);
            }
        }
    }

    public final void n(boolean z) {
        byte[] bArr;
        Drawable drawable;
        s28 s28Var = this.L;
        boolean zF = false;
        boolean z2 = (s28Var == null || !s28Var.H(30) || s28Var.B().a.isEmpty()) ? false : true;
        boolean z3 = this.S;
        ImageView imageView = this.A;
        View view = this.v;
        if (!z3 && (!z2 || z)) {
            if (imageView != null) {
                imageView.setImageResource(android.R.color.transparent);
                imageView.setVisibility(4);
            }
            if (view != null) {
                view.setVisibility(0);
            }
            c();
        }
        if (z2) {
            s28 s28Var2 = this.L;
            boolean z4 = s28Var2 != null && s28Var2.H(30) && s28Var2.B().a(2);
            boolean zB = b();
            if (!z4 && !zB) {
                if (view != null) {
                    view.setVisibility(0);
                }
                c();
            }
            ImageView imageView2 = this.z;
            boolean z5 = (view == null || view.getVisibility() != 4 || imageView2 == null || (drawable = imageView2.getDrawable()) == null || drawable.getAlpha() == 0) ? false : true;
            if (zB && !z4 && z5) {
                if (view != null) {
                    view.setVisibility(0);
                }
                if (imageView2 != null) {
                    imageView2.setVisibility(0);
                    o();
                }
            } else if (z4 && !zB && z5) {
                c();
            }
            if (!z4 && !zB && this.O != 0) {
                imageView.getClass();
                if (s28Var != null && s28Var.H(18) && (bArr = s28Var.W().f) != null) {
                    zF = f(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
                }
                if (zF || f(this.Q)) {
                    return;
                }
            }
            if (imageView != null) {
                imageView.setImageResource(android.R.color.transparent);
                imageView.setVisibility(4);
            }
        }
    }

    public final void o() {
        Drawable drawable;
        AspectRatioFrameLayout aspectRatioFrameLayout;
        ImageView imageView = this.z;
        if (imageView == null || (drawable = imageView.getDrawable()) == null) {
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            return;
        }
        float width = intrinsicWidth / intrinsicHeight;
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
        if (this.P == 1) {
            width = getWidth() / getHeight();
            scaleType = ImageView.ScaleType.CENTER_CROP;
        }
        if (imageView.getVisibility() == 0 && (aspectRatioFrameLayout = this.u) != null) {
            aspectRatioFrameLayout.setAspectRatio(width);
        }
        imageView.setScaleType(scaleType);
    }

    @Override // android.view.View
    public final boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!p() || this.L == null) {
            return false;
        }
        e(true);
        return true;
    }

    public final boolean p() {
        if (!this.M) {
            return false;
        }
        this.E.getClass();
        return true;
    }

    @Override // android.view.View
    public final boolean performClick() {
        i();
        return super.performClick();
    }

    public void setArtworkDisplayMode(int i) {
        xl7.r(i == 0 || this.A != null);
        if (this.O != i) {
            this.O = i;
            n(false);
        }
    }

    public void setAspectRatioListener(AspectRatioFrameLayout.a aVar) {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.u;
        aspectRatioFrameLayout.getClass();
        aspectRatioFrameLayout.setAspectRatioListener(aVar);
    }

    public void setControllerAnimationEnabled(boolean z) {
        androidx.media3.ui.c cVar = this.E;
        cVar.getClass();
        cVar.setAnimationEnabled(z);
    }

    public void setControllerAutoShow(boolean z) {
        this.V = z;
    }

    public void setControllerHideDuringAds(boolean z) {
        this.W = z;
    }

    public void setControllerHideOnTouch(boolean z) {
        this.E.getClass();
        this.a0 = z;
        l();
    }

    @Deprecated
    public void setControllerOnFullScreenModeChangedListener(androidx.media3.ui.c.d dVar) {
        androidx.media3.ui.c cVar = this.E;
        cVar.getClass();
        cVar.setOnFullScreenModeChangedListener(dVar);
    }

    public void setControllerShowTimeoutMs(int i) {
        androidx.media3.ui.c cVar = this.E;
        cVar.getClass();
        this.U = i;
        if (cVar.j()) {
            h(g());
        }
    }

    @Deprecated
    public void setControllerVisibilityListener(androidx.media3.ui.c.m mVar) {
        androidx.media3.ui.c cVar = this.E;
        cVar.getClass();
        androidx.media3.ui.c.m mVar2 = this.N;
        if (mVar2 == mVar) {
            return;
        }
        if (mVar2 != null) {
            cVar.D.remove(mVar2);
        }
        this.N = mVar;
        if (mVar != null) {
            cVar.getClass();
            cVar.D.add(mVar);
            setControllerVisibilityListener((c) null);
        }
    }

    public void setCustomErrorMessage(CharSequence charSequence) {
        xl7.r(this.D != null);
        this.T = charSequence;
        m();
    }

    public void setDefaultArtwork(Drawable drawable) {
        if (this.Q != drawable) {
            this.Q = drawable;
            n(false);
        }
    }

    public void setEnableComposeSurfaceSyncWorkaround(boolean z) {
        this.b0 = z;
    }

    public void setErrorMessageProvider(am3<? super h28> am3Var) {
        if (am3Var != null) {
            m();
        }
    }

    public void setFullscreenButtonClickListener(d dVar) {
        androidx.media3.ui.c cVar = this.E;
        cVar.getClass();
        cVar.setOnFullScreenModeChangedListener(this.t);
    }

    public void setFullscreenButtonState(boolean z) {
        androidx.media3.ui.c cVar = this.E;
        cVar.getClass();
        cVar.o(z);
    }

    public void setImageDisplayMode(int i) {
        xl7.r(this.z != null);
        if (this.P != i) {
            this.P = i;
            o();
        }
    }

    public void setKeepContentOnPlayerReset(boolean z) {
        if (this.S != z) {
            this.S = z;
            n(false);
        }
    }

    public void setMediaRouteButtonViewProvider(jib jibVar) {
        androidx.media3.ui.c cVar = this.E;
        cVar.getClass();
        cVar.setMediaRouteButtonViewProvider(jibVar);
    }

    /* JADX WARN: Code duplicated, block: B:67:0x00e6  */
    public void setPlayer(s28 s28Var) {
        boolean z = true;
        xl7.r(Looper.myLooper() == Looper.getMainLooper());
        xl7.g(s28Var == null || s28Var.O() == Looper.getMainLooper());
        s28 s28Var2 = this.L;
        if (s28Var2 == s28Var) {
            return;
        }
        View view = this.w;
        b bVar = this.t;
        if (s28Var2 != null) {
            s28Var2.J(bVar);
            if (s28Var2.H(27)) {
                if (view instanceof TextureView) {
                    s28Var2.q((TextureView) view);
                } else if (view instanceof SurfaceView) {
                    s28Var2.K((SurfaceView) view);
                }
            }
            Class<?> cls = this.I;
            if (cls != null && cls.isAssignableFrom(s28Var2.getClass())) {
                try {
                    Method method = this.J;
                    method.getClass();
                    method.invoke(s28Var2, null);
                } catch (IllegalAccessException | InvocationTargetException e2) {
                    d55.a(e2);
                    return;
                }
            }
        }
        SubtitleView subtitleView = this.B;
        if (subtitleView != null) {
            subtitleView.setCues(null);
        }
        this.L = s28Var;
        boolean zP = p();
        androidx.media3.ui.c cVar = this.E;
        if (zP) {
            cVar.setPlayer(s28Var);
        }
        k();
        m();
        n(true);
        if (s28Var == null) {
            if (cVar != null) {
                cVar.g();
                return;
            }
            return;
        }
        if (s28Var.H(27)) {
            if (view instanceof TextureView) {
                s28Var.U((TextureView) view);
            } else if (view instanceof SurfaceView) {
                s28Var.u((SurfaceView) view);
            }
            if (s28Var.H(30)) {
                k95<vua.a> k95Var = s28Var.B().a;
                int i = 0;
                loop0: while (true) {
                    if (i >= k95Var.size()) {
                        z = false;
                        break;
                    }
                    if (k95Var.get(i).b.c == 2) {
                        vua.a aVar = k95Var.get(i);
                        int i2 = 0;
                        while (true) {
                            int[] iArr = aVar.d;
                            if (i2 >= iArr.length) {
                                break;
                            } else if (iArr[i2] == 4) {
                                break loop0;
                            } else {
                                i2++;
                            }
                        }
                    }
                    i++;
                }
                if (z) {
                    j();
                }
            } else {
                j();
            }
        }
        if (subtitleView != null && s28Var.H(28)) {
            subtitleView.setCues(s28Var.D().a);
        }
        s28Var.n(bVar);
        setImageOutput(s28Var);
        e(false);
    }

    public void setRepeatToggleModes(int i) {
        androidx.media3.ui.c cVar = this.E;
        cVar.getClass();
        cVar.setRepeatToggleModes(i);
    }

    public void setResizeMode(int i) {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.u;
        aspectRatioFrameLayout.getClass();
        aspectRatioFrameLayout.setResizeMode(i);
    }

    public void setShowBuffering(int i) {
        if (this.R != i) {
            this.R = i;
            k();
        }
    }

    public void setShowFastForwardButton(boolean z) {
        androidx.media3.ui.c cVar = this.E;
        cVar.getClass();
        cVar.setShowFastForwardButton(z);
    }

    @Deprecated
    public void setShowMultiWindowTimeBar(boolean z) {
        androidx.media3.ui.c cVar = this.E;
        cVar.getClass();
        cVar.setShowMultiWindowTimeBar(z);
    }

    public void setShowNextButton(boolean z) {
        androidx.media3.ui.c cVar = this.E;
        cVar.getClass();
        cVar.setShowNextButton(z);
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z) {
        androidx.media3.ui.c cVar = this.E;
        cVar.getClass();
        cVar.setShowPlayButtonIfPlaybackIsSuppressed(z);
    }

    public void setShowPreviousButton(boolean z) {
        androidx.media3.ui.c cVar = this.E;
        cVar.getClass();
        cVar.setShowPreviousButton(z);
    }

    public void setShowRewindButton(boolean z) {
        androidx.media3.ui.c cVar = this.E;
        cVar.getClass();
        cVar.setShowRewindButton(z);
    }

    public void setShowShuffleButton(boolean z) {
        androidx.media3.ui.c cVar = this.E;
        cVar.getClass();
        cVar.setShowShuffleButton(z);
    }

    public void setShowSubtitleButton(boolean z) {
        androidx.media3.ui.c cVar = this.E;
        cVar.getClass();
        cVar.setShowSubtitleButton(z);
    }

    public void setShowVrButton(boolean z) {
        androidx.media3.ui.c cVar = this.E;
        cVar.getClass();
        cVar.setShowVrButton(z);
    }

    public void setShutterBackgroundColor(int i) {
        View view = this.v;
        if (view != null) {
            view.setBackgroundColor(i);
        }
    }

    public void setTimeBarScrubbingEnabled(boolean z) {
        androidx.media3.ui.c cVar = this.E;
        cVar.getClass();
        cVar.setTimeBarScrubbingEnabled(z);
    }

    @Deprecated
    public void setUseArtwork(boolean z) {
        setArtworkDisplayMode(!z ? 1 : 0);
    }

    public void setUseController(boolean z) {
        boolean z2 = true;
        androidx.media3.ui.c cVar = this.E;
        xl7.r((z && cVar == null) ? false : true);
        if (!z && !hasOnClickListeners()) {
            z2 = false;
        }
        setClickable(z2);
        if (this.M == z) {
            return;
        }
        this.M = z;
        if (p()) {
            cVar.setPlayer(this.L);
        } else if (cVar != null) {
            cVar.g();
            cVar.setPlayer(null);
        }
        l();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        View view = this.w;
        if (view instanceof SurfaceView) {
            view.setVisibility(i);
        }
    }

    public void setControllerVisibilityListener(c cVar) {
        if (cVar != null) {
            setControllerVisibilityListener((androidx.media3.ui.c.m) null);
        }
    }

    public PlayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PlayerView(Context context) {
        this(context, null);
    }
}
