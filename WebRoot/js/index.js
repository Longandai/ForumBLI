$(document).ready(function(){
    //����ύ��ťʱ���ӷ���˻�ȡ���ݣ�Ȼ���ڿͻ�����ʾ
    $("#btn").click(function(){
        // ���л�����ֵ
        var params=$("input").serialize();
        $.ajax({
            url: "jsonAction.do",
            // ���ݷ��ͷ�ʽ
            type: "post",
            // �������ݸ�ʽ
            dataType : "json",
            // Ҫ���ݵ�����
            data : params,
            // �ص����������ܷ������˷��ظ��ͻ��˵�ֵ����resultֵ
            success : show   
        });
    });
});
 
function show(result){
    //����result�Ƿ�ӷ������˷��ظ��ͻ���
    //alert(result);
    //����json����
    var json = eval("("+result+")");
    var obj = "���: "+json.id+"  �û���: "+json.username+"  ����: "+json.pwd;
    $("#result").html(obj);
}