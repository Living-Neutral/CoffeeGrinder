$(document).ready(function() {
    var animating = false;
    var decisionVal = 80;
    var pullDeltaX = 0;
    var deg = 0;
    var $choice, $choiceAccept;
    
    function pullChange() {
        animating = true;
        deg = pullDeltaX/10;
        $choice.css("transform", "translateX("+ pullDeltaX +"px) rotate("+ deg +"deg)");
    };
    
    function release() {
        if (pullDeltaX >= decisionVal) {
            $choice.addClass("to-right");
        } else if (pullDeltaY <= -decisionVal) {
            $choice.addClass("to-left");
        }
        
        if (Math.abs(pullDeltaX) < decisionVal) {
            $choice.addClass("reset");
        }
        
        setTimeout(function() {
            $choice.attr("style", "").removeClass("reset").find(".demo__")
        })
    };
    
    $(document).on("mousedown touchstart", "choice:not(.inactive)", function(e) {
        if (animating) return;
        
        $choice = $(this);
        $choiceAccept = $("choice.accept", $choice);
        var startX = e.pageX || e.originalEvent.touches[0].pageX;
        
        $(document).on("mousemove touchmove", function(e) {
            var x = e.pageX || e.originalEvent.touches[0].pageX;
            pullDeltaX = (x - startX);
            if (!pullDeltaX) return;
            pullChange();
        });
        
        $(document).on("mouseup touchend", function() {
            $(document).off("mousemove touchmove mouseup touchend");
            if (!pullDeltaX) return;
            release();
        });
    });
});

