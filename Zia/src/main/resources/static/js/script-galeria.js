var slideIndex = 1;
showDivs(slideIndex);

function plusDivs(n) {
  showDivs(slideIndex += n);
}

function showDivs(n) {
  var i;
  var x = document.getElementsByClassName("imgSlides");
  if (n > x.length) { slideIndex = 1 }
  if (n < 1) { slideIndex = x.length };
  for (i = 0; i < x.length; i++) {
    x[i].style.display = "none";
  }
  x[slideIndex - 1].style.display = "block";
}

$("#botao").click(fModal);

function fModal() {
  $.ajax({
    type: 'GET',
    url: '/desafios/galeria/response',
    dataSrc: "",
    success: function (resultado) {
      $("#a1").text(resultado.a1);
      $("#a2").text(resultado.a2);
      $("#a3").text(resultado.a3);
      $("#a4").text(resultado.a4);
      $("#a5").text(resultado.a5);
      $("#a6").text(resultado.a6);
      $("#a7").text(resultado.a7);
      $("#a8").text(resultado.a8);
      $("#a9").text(resultado.a9);
      $("#a10").text(resultado.a10);
      $("#a11").text(resultado.a11);
      $("#a12").text(resultado.a12);
      $("#a13").text(resultado.a13);
      $("#a14").text(resultado.a14);
      $("#a15").text(resultado.a15);
      $("#a16").text(resultado.a16);
      $("#a17").text(resultado.a17);
      $("#a18").text(resultado.a18);
      $("#a19").text(resultado.a19);
      $("#a20").text(resultado.a20);
      $("#a21").text(resultado.a21);
      $("#a22").text(resultado.a22);
      $("#a23").text(resultado.a23);
      $("#a24").text(resultado.a24);
      $("#a25").text(resultado.a25);
      $("#a26").text(resultado.a26);
      $("#a27").text(resultado.a27);
      $("#a28").text(resultado.a28);
      $("#a29").text(resultado.a29);
      $("#a30").text(resultado.a30);
      $("#a31").text(resultado.a31);
      $("#modal").modal({ show: true });
    }
  });
}
