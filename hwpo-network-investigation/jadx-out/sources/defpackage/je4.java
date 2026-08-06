package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import com.hwpo_training_app.R;
import com.hwpo_training_app.core.widget.SimpleProgressBar;
import com.hwpo_training_app.core.widget.placeholder.PlaceHolder;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class je4 implements wfb {
    public final ConstraintLayout a;
    public final MaterialButton b;
    public final AppBarLayout c;
    public final ImageView d;
    public final RecyclerView e;
    public final SwipeRefreshLayout f;
    public final AppCompatEditText g;
    public final PlaceHolder h;
    public final SimpleProgressBar i;
    public final FrameLayout j;
    public final AppCompatImageButton k;
    public final MaterialToolbar l;

    public je4(ConstraintLayout constraintLayout, MaterialButton materialButton, AppBarLayout appBarLayout, ImageView imageView, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout, AppCompatEditText appCompatEditText, PlaceHolder placeHolder, SimpleProgressBar simpleProgressBar, FrameLayout frameLayout, AppCompatImageButton appCompatImageButton, MaterialToolbar materialToolbar) {
        this.a = constraintLayout;
        this.b = materialButton;
        this.c = appBarLayout;
        this.d = imageView;
        this.e = recyclerView;
        this.f = swipeRefreshLayout;
        this.g = appCompatEditText;
        this.h = placeHolder;
        this.i = simpleProgressBar;
        this.j = frameLayout;
        this.k = appCompatImageButton;
        this.l = materialToolbar;
    }

    public static je4 bind(View view) {
        int i = R.id.addAttachmentButton;
        MaterialButton materialButton = (MaterialButton) nt3.b(R.id.addAttachmentButton, view);
        if (materialButton != null) {
            i = R.id.appBar;
            AppBarLayout appBarLayout = (AppBarLayout) nt3.b(R.id.appBar, view);
            if (appBarLayout != null) {
                i = R.id.buttonOpenLeaderboardDetails;
                ImageView imageView = (ImageView) nt3.b(R.id.buttonOpenLeaderboardDetails, view);
                if (imageView != null) {
                    i = R.id.commentsList;
                    RecyclerView recyclerView = (RecyclerView) nt3.b(R.id.commentsList, view);
                    if (recyclerView != null) {
                        i = R.id.commentsSwipeToRefresh;
                        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) nt3.b(R.id.commentsSwipeToRefresh, view);
                        if (swipeRefreshLayout != null) {
                            i = R.id.messageTextEditText;
                            AppCompatEditText appCompatEditText = (AppCompatEditText) nt3.b(R.id.messageTextEditText, view);
                            if (appCompatEditText != null) {
                                i = R.id.placeholder;
                                PlaceHolder placeHolder = (PlaceHolder) nt3.b(R.id.placeholder, view);
                                if (placeHolder != null) {
                                    i = R.id.progress;
                                    SimpleProgressBar simpleProgressBar = (SimpleProgressBar) nt3.b(R.id.progress, view);
                                    if (simpleProgressBar != null) {
                                        i = R.id.sendCommentContainer;
                                        FrameLayout frameLayout = (FrameLayout) nt3.b(R.id.sendCommentContainer, view);
                                        if (frameLayout != null) {
                                            i = R.id.sendMessageButton;
                                            AppCompatImageButton appCompatImageButton = (AppCompatImageButton) nt3.b(R.id.sendMessageButton, view);
                                            if (appCompatImageButton != null) {
                                                i = R.id.toolbar;
                                                MaterialToolbar materialToolbar = (MaterialToolbar) nt3.b(R.id.toolbar, view);
                                                if (materialToolbar != null) {
                                                    return new je4((ConstraintLayout) view, materialButton, appBarLayout, imageView, recyclerView, swipeRefreshLayout, appCompatEditText, placeHolder, simpleProgressBar, frameLayout, appCompatImageButton, materialToolbar);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        ac4.c("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static je4 inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_comments, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // defpackage.wfb
    public final View getRoot() {
        return this.a;
    }

    public static je4 inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
